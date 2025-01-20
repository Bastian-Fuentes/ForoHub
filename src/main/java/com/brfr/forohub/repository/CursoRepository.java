package com.brfr.forohub.repository;

import com.brfr.forohub.model.Curso;
import com.brfr.forohub.model.Curso.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
    List<Curso> findByNombreContainingIgnoreCase(String nombre);
    List<Curso> findByCategoria(Categoria categoria);
}

