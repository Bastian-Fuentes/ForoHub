package com.brfr.forohub.controller;

import com.brfr.forohub.model.Usuario;
import com.brfr.forohub.repository.UsuarioRepository;
import com.brfr.forohub.service.JwtUtil;
import com.brfr.forohub.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {
    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private UsuarioService usuarioService;


    @PostMapping("/login")
    public String login(@RequestBody Usuario usuario) {
        usuario = usuarioRepository.findByEmail(usuario.getEmail());
        if (usuario != null && usuario.getPassword().equals(usuario.getPassword())) {
            return jwtUtil.generateToken(usuario.getEmail());
        } else {
            return "Invalid credentials";
        }
    }


    @PostMapping("/register")
    public String register(@RequestBody Usuario usuario) {
        usuario = usuarioService.createUser(usuario);
        if(usuario != null) {
            return "Usuario creado exitosamente";
        }
        return "Error al crear el usuario";
    }
}