package com.linexperts.app.controller;

import com.linexperts.app.dto.PalindromoResponse;
import com.linexperts.app.models.PalindromoRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ntejada
 */
@RestController
@RequestMapping("/api")
public class PalindromeController {

    @PostMapping("/verificarPalindromo")
    public PalindromoResponse verificarPalindromo(@RequestBody PalindromoRequest request) {
        String palindromo = request.getPalindromo();
        String limpiarPalindromo = palindromo.replaceAll("[^a-zA-Z]", "").toLowerCase();
        boolean isPalindromo = new StringBuilder(limpiarPalindromo).reverse().toString().equals(limpiarPalindromo);
        int contadorCaracteresEspeciales = palindromo.length() - limpiarPalindromo.length();

        return new PalindromoResponse(palindromo.length(), isPalindromo ? 1 : 0, contadorCaracteresEspeciales);
    }
}
