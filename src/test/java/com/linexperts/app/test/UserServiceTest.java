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

class UserServiceTest {
    // objetivo 2
    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void obtenerUsuarios_retornaListaUsuarios() {
        User[] usuariosArray = {new User(1L, "Leanne Graham"), new User(2L, "Ervin Howell")};
        when(restTemplate.getForEntity(anyString(), eq(User[].class))).thenReturn(new ResponseEntity<>(usuariosArray, HttpStatus.OK));

        List<User> usuarios = userService.obtenerUsuarios();

        assertNotNull(usuarios);
        assertEquals(2, usuarios.size());
    }

    @Test
    void obtenerUsuarios_lanzaRestClientException() {
        when(restTemplate.getForEntity(anyString(), eq(User[].class))).thenThrow(new RestClientException("Error"));
        
        RestClientException exception = assertThrows(RestClientException.class, () -> userService.obtenerUsuarios());
        assertEquals("Error al consumir la API externa", exception.getMessage());
    }
}