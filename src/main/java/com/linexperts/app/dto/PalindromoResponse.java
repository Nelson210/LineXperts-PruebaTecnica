package com.linexperts.app.dto;

import lombok.Data;

/**
 * Clase que representa la respuesta de la verificacion de un palindromo.
 * 
 * Esta clase contiene los resultados de la verificacion, incluyendo la longitud
 * de la cadena original, si es un palindromo y la cantidad de caracteres especiales.
 * 
 * @autor ntejada
 */
@Data
public class PalindromoResponse {
    /**
     * Longitud de la cadena original.
     */
    private int lengthCadena;

    /**
     * Indicador de si la cadena es un palindromo
     */
    private int isPalindromo;

    /**
     * Cantidad de caracteres especiales en la cadena original.
     */
    private int lengthCaracteresEspeciales;

    /**
     * Constructor para inicializar los campos de la respuesta.
     * 
     * @param lengthCadena Longitud de la cadena original.
     * @param isPalindromo Indicador de si la cadena es un palindromo.
     * @param lengthCaracteresEspeciales Cantidad de caracteres especiales en la cadena original.
     */
    public PalindromoResponse(int lengthCadena, int isPalindromo, int lengthCaracteresEspeciales) {
        this.lengthCadena = lengthCadena;
        this.isPalindromo = isPalindromo;
        this.lengthCaracteresEspeciales = lengthCaracteresEspeciales;
    }
}
