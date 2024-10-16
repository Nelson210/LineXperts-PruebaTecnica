package com.linexperts.app.service;

import com.linexperts.app.models.User;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * Servicio que maneja la lógica de negocio relacionada con los usuarios.
 * Utiliza RestTemplate para consumir una API externa.
 * 
 * @author ntejada
 */
@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * Obtiene la lista de usuarios desde una API externa.
     * 
     * @return Lista de usuarios.
     * @throws RestClientException Si ocurre un error al consumir la API externa.
     */
    public List<User> obtenerUsuarios() {
        String url = "https://jsonplaceholder.typicode.com/users";
        try {
            ResponseEntity<User[]> response = restTemplate.getForEntity(url, User[].class);
            return Arrays.asList(response.getBody());
        } catch (RestClientException e) {
            throw new RestClientException("Error al consumir la API externa", e);
        }
    }
}
