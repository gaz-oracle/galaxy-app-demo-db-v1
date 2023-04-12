package com.gaz.app.sb.appdemodbv1.api;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gaz.app.sb.appdemodbv1.entity.Cliente;

@RestController
@RequestMapping
public class ClienteApi {

	@GetMapping("/clientes") // Metodo Predeterminado, sin un end-point en el @GetMapping .
	public Cliente getCliente() {

		return Cliente.builder().id(1L).razonSocial("TELMEXVISA").rfc("TEL7898").build();
	}

	@GetMapping ("/listaClientes")
	public List<Cliente> listaClientes() {
		
		List<Cliente> clientes = new ArrayList<>();
		
		clientes.add(Cliente
				.builder()
				.id(1L)
				.razonSocial("TELMEXVISA")
				.rfc("TEL7898")
				.build());
		
		clientes.add(Cliente
				.builder()
				.id(2L)
				.razonSocial("TOTALMEGA")
				.rfc("TOL6543")
				.build());
		
		clientes.add(Cliente
				.builder()
				.id(3L)
				.razonSocial("MOVILDELMAYO")
				.rfc("MOV5559")
				.build());
		
		return clientes;
	}

}
