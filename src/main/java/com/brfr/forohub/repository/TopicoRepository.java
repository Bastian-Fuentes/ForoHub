package com.brfr.forohub.repository;

import com.brfr.forohub.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {
    List<Topico> findByAutorId(Long autorId);
    List<Topico> findByCursoId(Long cursoId);
    List<Topico> findByTituloContainingIgnoreCase(String titulo);
}
