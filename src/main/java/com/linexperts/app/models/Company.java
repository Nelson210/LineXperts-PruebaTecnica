/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
