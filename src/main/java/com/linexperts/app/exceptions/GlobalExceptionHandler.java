package com.linexperts.app.exceptions;

import com.linexperts.app.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.RestClientException;

/**
 * Clase que maneja las excepciones globales en la aplicación.
 * Utiliza la anotación @ControllerAdvice para permitir el manejo
 * centralizado de excepciones en los controladores.
 * 
 * @author ntejada
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Maneja las excepciones de tipo RestClientException.
     * 
     * @param ex La excepción capturada.
     * @return Una instancia de ErrorResponse con el código y mensaje de error.
     */
    @ExceptionHandler(RestClientException.class)
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    public ErrorResponse handleRestClientException(RestClientException ex) {
        return new ErrorResponse("Error al consumir la API externa", ex.getMessage());
    }

    /**
     * Maneja las excepciones de tipo IllegalArgumentException.
     * 
     * @param ex La excepción capturada.
     * @return Una instancia de ErrorResponse con el código y mensaje de error.
     */
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleIllegalArgumentException(IllegalArgumentException ex) {
        return new ErrorResponse("Argumento inválido", ex.getMessage());
    }

    /**
     * Maneja las excepciones de tipo RuntimeException.
     * 
     * @param ex La excepción capturada.
     * @return Una instancia de ErrorResponse con el código y mensaje de error.
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleRuntimeException(RuntimeException ex) {
        return new ErrorResponse("Error interno del servidor", ex.getMessage());
    }
}
