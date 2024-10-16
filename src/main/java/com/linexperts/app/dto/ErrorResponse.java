package com.linexperts.app.dto;

import lombok.Data;

/**
 * Clase que representa una respuesta de error en la aplicación.
 * 
 * @author ntejada
 */
@Data
public class ErrorResponse {
    /**
     * Código del error.
     */
    private String error;

    /**
     * Mensaje descriptivo del error.
     */
    private String message;

    /**
     * Constructor de la clase ErrorResponse.
     * 
     * @param error Código del error.
     * @param message Mensaje descriptivo del error.
     */
    public ErrorResponse(String error, String message) {
        this.error = error;
        this.message = message;
    }
}
