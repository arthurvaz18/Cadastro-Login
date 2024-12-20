package com.example.LocalSense.repositories;

import com.example.LocalSense.cadastro.CadastroCliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CadastroClienteRepository extends JpaRepository<CadastroCliente, Integer> {

    Optional<CadastroCliente> findByEmail(String email);

    Optional<CadastroCliente> findByCpf(Integer cpf);

}
