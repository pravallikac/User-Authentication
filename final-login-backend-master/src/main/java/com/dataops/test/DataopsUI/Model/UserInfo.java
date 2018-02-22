package com.dataops.test.DataopsUI.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String fullname;
    private String email;
    private String role;
    private String country;
    private String username;
    private String password;

    public UserInfo() {
        super();

    }

    public UserInfo(String username, String password) {

        this.username = username;
        this.password = password;
    }


    public UserInfo(String fullname, String email,String username, String password) {

        this.fullname = fullname;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() { return role;    }

    public void setRole(String role) { this.role = role;    }

    public String getCountry() { return country;    }

    public void setCountry(String country) { this.country = country;    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public String toString() {
        return "UserInfo [username=" + username + ", email=" + email +", role=" + role+", country="+country+", password=" + password + "]";
    }
}
