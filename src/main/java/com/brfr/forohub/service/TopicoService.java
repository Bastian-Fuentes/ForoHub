package com.brfr.forohub.service;

import com.brfr.forohub.model.Topico;
import com.brfr.forohub.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public List<Topico> getAllTopics() {
        return topicoRepository.findAll();
    }

    public Topico createTopic(Topico topico) {
        return topicoRepository.save(topico);
    }

    public void deleteTopic(Long id) {
        topicoRepository.deleteById(id);
    }

    public Topico findById(Long id) {
        Optional<Topico> topico = topicoRepository.findById(id);
        if (topico.isPresent()){
            return topico.get();
        }
        return null;
    }
    public List<Topico> findByCurso(Long cursoId) {
        return topicoRepository.findByCursoId(cursoId);
    }
    public void deleteTopico(Long id) {
        topicoRepository.deleteById(id);
    }
}