package com.example.LocalSense.service;

import com.example.LocalSense.cadastro.CadastroCliente;
import com.example.LocalSense.repositories.CadastroClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroClienteService {

    @Autowired
    private CadastroClienteRepository cadastroClienteRepository;

    public CadastroCliente criarCliente(CadastroCliente cliente) {
        // Validações ou lógica extra podem ser adicionadas aqui
        return cadastroClienteRepository.save(cliente);
    }

    public CadastroCliente buscarPorCpf(Integer cpf) {
        return cadastroClienteRepository.findByCpf(cpf)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado com o CPF: " + cpf));
    }

    public List<CadastroCliente> listarTodos() {
        return cadastroClienteRepository.findAll();
    }

    public CadastroCliente atualizarCliente(Integer cpf, CadastroCliente clienteAtualizado) {
        CadastroCliente clienteExistente = buscarPorCpf(cpf); // Reutiliza o método buscarPorcpf
        clienteExistente.setNomeCompleto(clienteAtualizado.getNomeCompleto());
        clienteExistente.setEmail(clienteAtualizado.getEmail());
        // Atualize outros campos necessários...
        return cadastroClienteRepository.save(clienteExistente);
    }

    public void deletarCliente(Integer cpf) {
        buscarPorCpf(cpf); // Garante que o cliente existe antes de deletar
        cadastroClienteRepository.deleteById(cpf);
    }
}

