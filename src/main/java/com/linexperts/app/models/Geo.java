package com.linexperts.app.models;

import lombok.Data;

/**
 * Clase que representa las coordenadas geograficas.
 * 
 * @author ntejada
 */
@Data
public class Geo {
    /**
     * Latitud de la ubicacion.
     */
    private String lat;

    /**
     * Longitud de la ubicacion.
     */
    private String lng;
}
