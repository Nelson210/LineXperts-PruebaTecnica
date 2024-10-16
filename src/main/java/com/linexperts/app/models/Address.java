package com.linexperts.app.models;

import lombok.Data;

/**
 *
 * @author ntejada
 */
@Data
public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;
}
