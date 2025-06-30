package com.example.e_comerse.Model;

import jakarta.persistence.*;

@Entity
public class userdata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int id;
      private String name;
      @Column(nullable = false,unique = true)
      private long phno;
    private String password;


    public userdata(String password, long phno, String name) {
        this.password = password;
        this.phno = phno;
        this.name = name;
    }

    public userdata() {
    }

    public userdata(String pass, long phNo) {
        this.password = pass;
        this.phno = phNo;

    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPhno() {
        return phno;
    }

    public void setPhno(long phno) {
        this.phno = phno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
