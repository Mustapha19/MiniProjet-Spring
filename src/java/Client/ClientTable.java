/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import config.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.registry.infomodel.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Mustapha Abdelaziz
 */
public class ClientTable {
    public List select(){
       JdbcTemplate jdbcTemplate = new JdbcTemplate(DBConnection.conecter());
       String query = "SELECT price,state,pictureURL FROM cars";
        List list = jdbcTemplate.queryForList(query); 
        return list;
    }
    public int insert(Client client) {
//        System.out.println(formateur.toString());
        Connection connection_test =DBConnection.getConnection();
//        this.formateur = formateur;
        if (connection_test != null) {
            try {
                String insertQuerry = "INSERT INTO client(`fristname`,`lastname`,`datebirth`,`solde`,`email`,`phone`) VALUES (?, ? , ?, ?, ?, ?);";

                PreparedStatement insert = connection_test.prepareStatement(insertQuerry);
                insert.setString(1, client.getFirstName());
                insert.setString(2,client.getLastName());
                insert.setString(3, client.getDatebirth());
                insert.setInt(4, client.getSolde());
                insert.setString(5, client.getEmail());
                insert.setString(6, client.getPhone());
                

                return insert.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            System.out.println("Erreur Connection");
        }
        return -1;

    }
     public boolean update(int id) {
        boolean resultat = false;
        try {
            String sql = "DELETE FROM client where ID=" + id;
            Connection conn = DBConnection.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.executeUpdate();
            resultat = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultat;
    }

    public boolean delete(Client client) {
        boolean resultat = false;
        try {
            String sql = "UPDATE client SET FirstName = ? AND Lastname = ? AND datebirth = ? AND solde = ? AND EMAIL = ? AND phone = ? where IDClient= ?";
            Connection conn = DBConnection.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.executeUpdate();
            resultat = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultat;
    }

}
