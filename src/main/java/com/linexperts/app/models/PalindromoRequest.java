package com.linexperts.app.models;

import lombok.Data;

/**
 * Clase que representa la solicitud para verificar un palindromo.
 * 
 * @autor ntejada
 */
@Data
public class PalindromoRequest {
    /**
     * Cadena de texto que se desea verificar como palindromo.
     */
    private String palindromo;
}
