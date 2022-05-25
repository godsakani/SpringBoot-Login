package com.example.nasia.loginDomain;

import javax.persistence.*;


@Entity
@Table(name="loginadmin")
//@GeneratedValue(strategy()= GenerationType.IDENTITY)
public class Login {

    @Id
    private long id;
    private String name;
    private String password;

    public Login() {
    }

    public Login(long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
