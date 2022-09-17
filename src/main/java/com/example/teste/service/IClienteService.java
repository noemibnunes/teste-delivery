package com.example.teste.service;

import java.util.Optional;

import com.example.teste.model.entity.Cliente;

public interface IClienteService {

	Cliente autenticarCliente(String email, String senha);
	Cliente cadastrarCliente(Cliente cliente);
	void validarEmail(String email);
	Optional<Cliente> obterPorId(Long id);
}
