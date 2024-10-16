package com.linexperts.app.dto;

import lombok.Data;

/**
 *
 * @author ntejada
 */
@Data
public class PalindromoResponse {
    private int lengthCadena;
    private int isPalindromo;
    private int lengthCaracteresEspeciales;

    // Constructor
    public PalindromoResponse(int lengthCadena, int isPalindromo, int lengthCaracteresEspeciales) {
        this.lengthCadena = lengthCadena;
        this.isPalindromo = isPalindromo;
        this.lengthCaracteresEspeciales = lengthCaracteresEspeciales;
    }
}
