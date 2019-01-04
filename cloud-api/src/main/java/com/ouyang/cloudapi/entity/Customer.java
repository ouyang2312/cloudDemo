package com.ouyang.cloudapi.entity;

import java.io.Serializable;

public class Customer implements Serializable {

    private Integer id;
    private String name;
    private String email;
    private String dbSource;

    public Customer() {
    }

    public Customer(Integer id, String name, String email, String dbSource) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dbSource = dbSource;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dbSource='" + dbSource + '\'' +
                '}';
    }
}
