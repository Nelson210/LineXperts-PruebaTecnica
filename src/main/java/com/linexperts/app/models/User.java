package com.linexperts.app.models;

import lombok.Data;

/**
 *
 * @author ntejada
 */
@Data
public class User {
    private long id;   
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

    public User() {
    }

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
