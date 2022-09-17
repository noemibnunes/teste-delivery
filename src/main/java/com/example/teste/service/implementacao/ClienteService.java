package com.example.teste.service.implementacao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teste.exception.EmailCadastradoException;
import com.example.teste.model.entity.Cliente;
import com.example.teste.model.repository.ClienteRepository;
import com.example.teste.service.IClienteService;

@Service
public class ClienteService implements IClienteService{

	public static final String MSG_EMAIL_CADASTRADO = "Já existe um Cliente cadastrado com este email.";

	@Autowired
	private ClienteRepository repository;
	
	@Override
	public Cliente autenticarCliente(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente cadastrarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		boolean existeEmail = repository.existsByEmail(email);
		
		if(existeEmail) {
			throw new EmailCadastradoException(MSG_EMAIL_CADASTRADO);
		}
		
	}

	@Override
	public Optional<Cliente> obterPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
