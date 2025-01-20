package com.brfr.forohub.service;

import com.brfr.forohub.model.Usuario;
import com.brfr.forohub.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;
    public List<Usuario> getAllUsuario() {
        return usuarioRepository.findAll();
    }
    public Usuario createUser(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    public Optional<Usuario> buscarPorId(Long id) {
        return usuarioRepository.findById(id);
    }
    public Optional<Usuario> buscarPorCorreo(String email) {
        return Optional.ofNullable(usuarioRepository.findByEmail(email));
    }
    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}