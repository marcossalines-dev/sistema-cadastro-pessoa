package com.marcos.cadastro.service;

import com.marcos.cadastro.entity.Pessoa;
import com.marcos.cadastro.repository.PessoaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa salvar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public List<Pessoa> listarTodos() {
        return pessoaRepository.findAll();
    }
    public Optional<Pessoa> buscarPorId(Integer id) {
        return pessoaRepository.findById(id);
    }
    @Transactional
    public Optional<Pessoa> atualizar(Integer id, Pessoa pessoa) {
        Optional<Pessoa> pessoaEncontrada = pessoaRepository.findById(id);
        if (pessoaEncontrada.isPresent()) {
            pessoaEncontrada.get().setNome(pessoa.getNome());
            pessoaEncontrada.get().setIdade(pessoa.getIdade());
            pessoaEncontrada.get().setSexo(pessoa.getSexo());
            pessoaEncontrada.get().setPeso(pessoa.getPeso());
            pessoaEncontrada.get().setAltura(pessoa.getAltura());
            pessoaEncontrada.get().setNacionalidade(pessoa.getNacionalidade());
            return Optional.of(pessoaRepository.save(pessoaEncontrada.get()));
        } else {
            return Optional.empty();
        }
    }
    public boolean deletar(Integer id) {
        boolean pessoaExiste = pessoaRepository.existsById(id);
        if (pessoaExiste) {
            pessoaRepository.deleteById(id);
           return true;
        } else {
         return false;
        }
    }
}