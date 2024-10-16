package com.linexperts.app.controller;

import com.linexperts.app.models.User;
import com.linexperts.app.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST para gestionar las operaciones relacionadas con los usuarios.
 * 
 * Este controlador proporciona un punto de acceso para obtener la lista de usuarios.
 * 
 * @autor ntejada
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Maneja las solicitudes GET para obtener la lista de usuarios.
     * 
     * @return una respuesta HTTP con la lista de usuarios y el estado HTTP correspondiente
     */
    @GetMapping
    public ResponseEntity<List<User>> obtenerUsuarios() {
        try {
            List<User> usuarios = userService.obtenerUsuarios();
            return new ResponseEntity<>(usuarios, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
        }
    }
}
