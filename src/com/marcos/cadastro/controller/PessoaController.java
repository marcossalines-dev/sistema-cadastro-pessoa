package com.marcos.cadastro.controller;

import com.marcos.cadastro.entity.Pessoa;
import com.marcos.cadastro.service.PessoaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.ResponseEntity;
import java.util.Optional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping
    public Pessoa salvar(@Valid @RequestBody Pessoa pessoa) {
        return pessoaService.salvar(pessoa);
    }

    @GetMapping
    public List<Pessoa> listarTodos() {
        return pessoaService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> buscarPorId(@PathVariable Integer id) {

        Optional<Pessoa> pessoa = pessoaService.buscarPorId(id);

        if (pessoa.isPresent()) {
            return ResponseEntity.ok(pessoa.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<Pessoa> atualizar(@PathVariable Integer id, @Valid @RequestBody Pessoa pessoa) {
        Optional<Pessoa> pessoaAtualizada = pessoaService.atualizar(id, pessoa);
        if (pessoaAtualizada.isPresent()) {
            return ResponseEntity.ok(pessoaAtualizada.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        boolean pessoaDeletada = pessoaService.deletar(id);
        if (pessoaDeletada) {
            return ResponseEntity.noContent().build();
        } else {
          return ResponseEntity.notFound().build();
        }
    }
}

