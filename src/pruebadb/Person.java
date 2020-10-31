/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebadb;

/**
 *
 * @author Cristian
 */
public class Person {

    private String firstname;
    private String middlename;
    private String lastname;
    private int gender;
    private String idtype;
    private String idnumber;
    private String email;

    public Person(String firstname, String middlename, String lastname, int gender, String idtype, String idnumber, String email) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.gender = gender;
        this.idtype = idtype;
        this.idnumber = idnumber;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }
    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getGender() {
        return gender;
    }
    public void setGender(int gender) {
        this.gender = gender;
    }
   
    public String getIdtype() {
        return idtype;
    }
    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    public String getIdnumber() {
        return idnumber;
    }
    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
