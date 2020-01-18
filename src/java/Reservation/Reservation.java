/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reservation;

/**
 *
 * @author Mustapha Abdelaziz
 */
public class Reservation {
    private int idClient;
    private int idCar;
    private String dateD;
    private String dateF;

    public Reservation() {
    }

    public Reservation(String dateD, String dateF) {
        this.dateD = dateD;
        this.dateF = dateF;
    }

    public Reservation(int idClient, int idCar, String dateD, String dateF) {
        this.idClient = idClient;
        this.idCar = idCar;
        this.dateD = dateD;
        this.dateF = dateF;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public String getDateD() {
        return dateD;
    }

    public void setDateD(String dateD) {
        this.dateD = dateD;
    }

    public String getDateF() {
        return dateF;
    }

    public void setDateF(String dateF) {
        this.dateF = dateF;
    }

    @Override
    public String toString() {
        return "Reservation{" + "dateD=" + dateD + ", dateF=" + dateF + '}';
    }
    
    
}
