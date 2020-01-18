/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reservation;

import config.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mustapha Abdelaziz
 */
public class ReservationTable {

    public int insert(Reservation reservation) {
//        System.out.println(formateur.toString());
        Connection connection_test = DBConnection.getConnection();
//        this.formateur = formateur;
        if (connection_test != null) {
            try {
                String insertQuerry = "INSERT INTO Reservation(`IDClient`,`IDCar`,`dateD`,`dateF`) VALUES (?, ? , ? ,?);";

                PreparedStatement insert = connection_test.prepareStatement(insertQuerry);
                insert.setInt(1, reservation.getIdClient());
                insert.setInt(2, reservation.getIdCar());
                insert.setString(3, reservation.getDateD());
                insert.setString(4, reservation.getDateF());

                return insert.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            System.out.println("Erreur Connection");
        }
        return -1;

    }
    public boolean update(Reservation reservation) {
        boolean resultat = false;
        try {
            String sql = "UPDATE Reservation SET DATED = "+reservation.getDateD()+" AND DATEF = "+reservation.getDateF()+"  where IDClient=" + reservation.getIdClient() + "AND IDCar = " + reservation.getIdCar();
            Connection conn = DBConnection.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.executeUpdate();
            resultat = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultat;
    }
    
    public boolean delete(Reservation reservation) {
        boolean resultat = false;
        try {
            String sql = "DELETE FROM Reservation where IDClient=" + reservation.getIdClient() + "AND IDCar = " + reservation.getIdCar();
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
