package com.gaz.app.sb.appdemodbv1.service;

import java.util.List;

import com.gaz.app.sb.appdemodbv1.entity.Cliente;

public interface ClienteService {
	
	Cliente getCliente(Long id);
	
	List<Cliente> getClientes();
	
	Cliente grabar(Cliente clientesave);



}
