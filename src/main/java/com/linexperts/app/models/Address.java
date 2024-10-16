package com.linexperts.app.models;

import lombok.Data;

/**
 * Clase que representa una direccion.
 * 
 * @author ntejada
 */
@Data
public class Address {
    /**
     * Calle de la direccion.
     */
    private String street;

    /**
     * Suite o apartamento de la direccion.
     */
    private String suite;

    /**
     * Ciudad de la direccion.
     */
    private String city;

    /**
     * Código postal de la direccion.
     */
    private String zipcode;

    /**
     * Coordenadas geográficas de la direccion.
     */
    private Geo geo;
}

