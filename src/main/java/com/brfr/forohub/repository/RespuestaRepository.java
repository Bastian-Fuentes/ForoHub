package com.brfr.forohub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.brfr.forohub.model.Respuesta;

import java.util.List;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
    List<Respuesta> findByTopicoId(Long topicoId);
    List<Respuesta> findByAutorId(Long autorId);
}
