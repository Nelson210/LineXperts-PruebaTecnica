package com.linexperts.app.models;

import lombok.Data;

/**
 * Clase que representa un usuario.
 * 
 * @author ntejada
 */
@Data
public class User {
    /**
     * Identificador unico del usuario.
     */
    private long id;

    /**
     * Nombre completo del usuario.
     */
    private String name;

    /**
     * Nombre de usuario.
     */
    private String username;

    /**
     * Correo electronico del usuario.
     */
    private String email;

    /**
     * Direccion del usuario.
     */
    private Address address;

    /**
     * Numero de telefono del usuario.
     */
    private String phone;

    /**
     * Sitio web del usuario.
     */
    private String website;

    /**
     * Compania donde trabaja el usuario.
     */
    private Company company;

    /**
     * Constructor por defecto.
     */
    public User() {
    }

    /**
     * Constructor con parametros.
     * 
     * @param id Identificador unico del usuario.
     * @param name Nombre completo del usuario.
     */
    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
