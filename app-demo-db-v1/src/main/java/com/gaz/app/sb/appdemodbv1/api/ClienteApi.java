package com.gaz.app.sb.appdemodbv1.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gaz.app.sb.appdemodbv1.entity.Cliente;
import com.gaz.app.sb.appdemodbv1.service.ClienteService;

@RestController
@RequestMapping
public class ClienteApi {
	
	@Autowired
	private ClienteService clienteService; //Id -> Field
	// Se invocan las Interfaces que implentan las clases -> ClienteService
	// No se invocan las clases, para inyectar los @Beans.

	@GetMapping("/clientes") 
	public Cliente getCliente() {

		return clienteService.getCliente();
	}

	@GetMapping ("/listaClientes")
	public List<Cliente> listaClientes() {
		
		return clienteService.getClientes();
	}

}
