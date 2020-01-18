/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cars;

import config.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Mustapha Abdelaziz
 */
public class CarsTable {

    public static List select() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DBConnection.conecter());
        String query = "SELECT * FROM cars";
        List list = jdbcTemplate.queryForList(query);
        return list;
    }

    public static List select(int idCar) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DBConnection.conecter());
        String query = "SELECT * FROM cars WHERE idCar=" + idCar;
        List list = jdbcTemplate.queryForList(query);
        return list;
    }

    public static void insert(Car car) {
        String insertQuerry = "INSERT INTO cars (brand, color, carbural, KM, price, state, pictureURL) VALUES (?,?,?,?,?,?,?)";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DBConnection.conecter());
        jdbcTemplate.update(insertQuerry, car.getBrand(),
                car.getColor(),
                car.getCarbural(),
                car.getKilom(),
                car.getPrice(),
                car.getState(),
                car.getPictureURL());

    }

    public static void update(Car car, int id) {
        System.out.println(car);
        String updateQuery = "UPDATE cars SET brand = ?,color = ?,carbural = ?,KM = ?,price = ?,state = ? where IDCar=?";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DBConnection.conecter());
        jdbcTemplate.update(updateQuery,
                car.getBrand(),
                car.getColor(),
                car.getCarbural(),
                car.getKilom(),
                car.getPrice(),
                car.getState(),
                id);
    }

    public static void delete(int id) {
        String deleteQuery = "DELETE FROM cars where IDCar=" + id;
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DBConnection.conecter());
        jdbcTemplate.update(deleteQuery);
    }

}
