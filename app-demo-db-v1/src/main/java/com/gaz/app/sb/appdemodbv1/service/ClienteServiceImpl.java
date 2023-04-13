package com.gaz.app.sb.appdemodbv1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gaz.app.sb.appdemodbv1.entity.Cliente;
import com.gaz.app.sb.appdemodbv1.repository.ClienteRepository;


@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	


	@Override
	public Cliente getCliente(Long id) {
		
	 return clienteRepository.findById(id).orElseThrow();
		
	}

	@Override
	public List<Cliente> getClientes() {
		
		return clienteRepository.findAll();
	}

	@Override
	public Cliente grabar(Cliente clientesave) {
	
		return clienteRepository.save(clientesave);
	}

	
}
