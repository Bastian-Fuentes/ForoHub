package com.brfr.forohub.controller;

import com.brfr.forohub.model.Topico;
import com.brfr.forohub.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @GetMapping
    public List<Topico> getAllTopics() {
        return topicoService.getAllTopics();
    }

    @PostMapping
    public ResponseEntity<Topico> createTopic(@RequestBody Topico topico) {
        System.out.println(topico.getTitulo());
        return ResponseEntity.status(201).body(topicoService.createTopic(topico));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTopic(@PathVariable Long id) {
        Topico topico = topicoService.findById(id);
        if (topico != null){
            topicoService.deleteTopic(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Topico> findTopic(@PathVariable Long id) {
        Topico topico = topicoService.findById(id);
        if (topico != null){
            return ResponseEntity.ok(topico);
        }
        return ResponseEntity.notFound().build();
    }
}
