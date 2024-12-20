package com.example.LocalSense.controller;

import com.example.LocalSense.cadastro.CadastroCliente;
import com.example.LocalSense.service.CadastroClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroClienteController {

    @Autowired
    private CadastroClienteService cadastroClienteService;

    @GetMapping("/clientes/buscarPorEmail") //cria o endpoint GET, onde o parâmetro email será passado na URL.
    public CadastroCliente buscarPorEmail(@RequestParam String email) { //indica que o email será passado como parâmetro de consulta
        return cadastroClienteService.buscarPorEmail(email);
    }
    @GetMapping("/")
    public String home() {
        return "Bem-vindo ao sistema!";
    }
}
