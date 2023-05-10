package com.gaz.app.sb.appdemodbv1.service;

import java.util.List;

import com.gaz.app.sb.appdemodbv1.entity.Cliente;

public interface ClienteService {
	
	Cliente getCliente(Long id);
	
	List<Cliente> getClientes();
	
	List<Cliente> getByRazonSocial(String razonSocial);
	
	Cliente grabar(Cliente clientesave);
	
	Cliente update(Cliente clienteupdate);
	
	void deleteClienteF(Long id); //  2%
	
	void deleteClienteL(Long id); // 98% cambiar un estado en la Base de Datos.


}
