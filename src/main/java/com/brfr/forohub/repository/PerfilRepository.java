package com.brfr.forohub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.brfr.forohub.model.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long> {
}
