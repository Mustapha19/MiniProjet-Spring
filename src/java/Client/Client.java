/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

/**
 *
 * @author Mustapha Abdelaziz
 */
public class Client {

    private int id;
    private String firstName;
    private String lastName;
    private int Solde;
    private String datebirth;
    private String email;
    private String phone;

    public Client() {
    }

   

    public Client(String firstName, String lastName, String datebirth, int Solde, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.datebirth = datebirth;
        this.Solde = Solde;
        this.email = email;
        this.phone = phone;
    }

    public Client(int id, String firstName, String lastName, String datebirth, int Solde, String email, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.datebirth = datebirth;
        this.Solde = Solde;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
     public String getDatebirth() {
        return datebirth;
    }

    public void setDatebirth(String datebirth) {
        this.datebirth = datebirth;
    }

    public int getSolde() {
        return Solde;
    }

    public void setSolde(int Solde) {
        this.Solde = Solde;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Client{firstName=" + firstName + ", lastName=" + lastName + ", Solde=" + Solde + ", email=" + email + ", phone=" + phone + '}';
    }

}
