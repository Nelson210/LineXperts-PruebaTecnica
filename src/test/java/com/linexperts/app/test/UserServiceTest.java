package com.linexperts.app.test;

import com.linexperts.app.models.User;
import com.linexperts.app.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Clase de prueba para el servicio UserService.
 * Utiliza Mockito para simular el comportamiento de RestTemplate y JUnit 5 para las pruebas.
 * 
 * @author ntejada
 */
class UserServiceTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private UserService userService;

    /**
     * Configura el entorno de pruebas antes de cada test.
     * Inicializa los mocks de Mockito.
     */
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    /**
     * Prueba que el método obtenerUsuarios retorne una lista de usuarios.
     * Simula una respuesta exitosa de la API externa.
     */
    @Test
    void obtenerUsuarios_retornaListaUsuarios() {
        User[] usuariosArray = {new User(1L, "Leanne Graham"), new User(2L, "Ervin Howell")};
        when(restTemplate.getForEntity(anyString(), eq(User[].class))).thenReturn(new ResponseEntity<>(usuariosArray, HttpStatus.OK));

        List<User> usuarios = userService.obtenerUsuarios();

        assertNotNull(usuarios);
        assertEquals(2, usuarios.size());
    }

    /**
     * Prueba que el método obtenerUsuarios lance una RestClientException.
     * Simula un error al consumir la API externa.
     */
    @Test
    void obtenerUsuarios_lanzaRestClientException() {
        when(restTemplate.getForEntity(anyString(), eq(User[].class))).thenThrow(new RestClientException("Error"));
        
        RestClientException exception = assertThrows(RestClientException.class, () -> userService.obtenerUsuarios());
        assertEquals("Error al consumir la API externa", exception.getMessage());
    }
}
