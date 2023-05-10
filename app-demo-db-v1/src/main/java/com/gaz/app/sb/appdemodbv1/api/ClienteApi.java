package com.gaz.app.sb.appdemodbv1.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.gaz.app.sb.appdemodbv1.entity.Cliente;
import com.gaz.app.sb.appdemodbv1.service.ClienteService;

import jakarta.persistence.Id;

@RestController
@RequestMapping("/clientes")   //Metodo Predeterminado.
public class ClienteApi {
	
	@Autowired
	private ClienteService clienteService; 
	
	@GetMapping ("/{id}") 
	public Cliente getCliente(@PathVariable Long id) {

		return clienteService.getCliente(id);
	}

	@GetMapping ("/listaClientes")
	public List<Cliente> listaClientes() {
		
		return clienteService.getClientes();
	}
	
	@GetMapping ("/clientes-rz")
	public List<Cliente> getByRazonSocial(@RequestParam String razonSocial) {
		
		return clienteService.getByRazonSocial(razonSocial);
	}
	
	@PostMapping("/saveclientes") //Insert
	public Cliente saveClientes(@RequestBody Cliente cliente) {
		return clienteService.grabar(cliente);
	}
	
	@PutMapping("/{id}") //Update
	public Cliente updateClientes(@PathVariable Long id, @RequestBody Cliente cliente) {
		cliente.setId(id);
		return clienteService.grabar(cliente);
	}
	
	@DeleteMapping("/{id}") // Delete
	void deleteClienteF(@PathVariable Long id) {
		clienteService.deleteClienteF(id);
	}

}
