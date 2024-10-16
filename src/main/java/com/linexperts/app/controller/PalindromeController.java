package com.linexperts.app.controller;

import com.linexperts.app.dto.PalindromoResponse;
import com.linexperts.app.models.PalindromoRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST para verificar si una cadena es un palindromo.
 *
 * Este controlador expone un endpoint para recibir una cadena y determinar si
 * es un palindromo, además de calcular la longitud de la cadena y la cantidad
 * de caracteres especiales.
 *
 * @autor ntejada
 */
@RestController
@RequestMapping("/api")
public class PalindromeController {

    /**
     * Endpoint para verificar si una cadena es un palíndromo.
     *
     * @param request Objeto que contiene la cadena a verificar.
     * @return Objeto de respuesta con la longitud de la cadena, si es un
     * palíndromo y la cantidad de caracteres especiales.
     */
    @PostMapping("/verificarPalindromo")
    public PalindromoResponse verificarPalindromo(@RequestBody PalindromoRequest request) {
        String palindromo = request.getPalindromo();
        String limpiarPalindromo = palindromo.replaceAll("[^a-zA-Z]", "").toLowerCase();
        boolean isPalindromo = new StringBuilder(limpiarPalindromo).reverse().toString().equals(limpiarPalindromo);
        // Contar caracteres especiales (excluyendo espacios)
        int contadorCaracteresEspeciales = 0;
        for (char c : palindromo.toCharArray()) {
            if (!Character.isLetter(c) && c != ' ') {
                contadorCaracteresEspeciales++;
            }
        }
        return new PalindromoResponse(palindromo.length(), isPalindromo ? 1 : 0, contadorCaracteresEspeciales);
    }
}
