package com.brfr.forohub.service;

import com.brfr.forohub.model.Respuesta;
import com.brfr.forohub.repository.RespuestaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RespuestaService {

    private final RespuestaRepository respuestaRepository;

    public RespuestaService(RespuestaRepository respuestaRepository) {
        this.respuestaRepository = respuestaRepository;
    }
    public List<Respuesta> obtenerTodasLasRespuestas() {
        return respuestaRepository.findAll();
    }
    public Optional<Respuesta> buscarPorId(Long id) {
        return respuestaRepository.findById(id);
    }
    public List<Respuesta> buscarPorTopico(Long topicoId) {
        return respuestaRepository.findByTopicoId(topicoId);
    }
    public Respuesta crearRespuesta(Respuesta respuesta) {
        return respuestaRepository.save(respuesta);
    }
    public Respuesta actualizarRespuesta(Long id, Respuesta respuestaActualizada) {
        return respuestaRepository.findById(id).map(respuesta -> {
            respuesta.setMensaje(respuestaActualizada.getMensaje());
            respuesta.setSolucion(respuestaActualizada.isSolucion());
            return respuestaRepository.save(respuesta);
        }).orElseThrow(() -> new RuntimeException("Respuesta no encontrada"));
    }
    public void eliminarRespuesta(Long id) {
        respuestaRepository.deleteById(id);
    }
}
