package com.linexperts.app.models;

import lombok.Data;

/**
 * Clase que representa una compania.
 * 
 * @author ntejada
 */
@Data
public class Company {
    /**
     * Nombre de la compania.
     */
    private String name;

    /**
     * Eslogan de la compania.
     */
    private String catchPhrase;

    /**
     * Descripcion breve de las actividades de la compania.
     */
    private String bs;
}
