package com.gaz.app.sb.appdemodbv1.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.gaz.app.sb.appdemodbv1.entity.Cliente;


@Service
public class ClienteServiceImpl implements ClienteService {

	@Override
	public Cliente getCliente() {
		return
				Cliente
				.builder()
				.id(1L)
				.razonSocial("TELMEXVISA SA DE C.V.")
				.rfc("TEL7898").build();
	}

	@Override
	public List<Cliente> getClientes() {
List<Cliente> clientes = new ArrayList<>();
		
		clientes.add(Cliente
				.builder()
				.id(1L)
				.razonSocial("TEL-MEXVISA")
				.rfc("TEL7898")
				.build());
		
		clientes.add(Cliente
				.builder()
				.id(2L)
				.razonSocial("TOTAL-MEGA")
				.rfc("TOL6543")
				.build());
		
		clientes.add(Cliente
				.builder()
				.id(3L)
				.razonSocial("MOVIL-DEL-MAYO")
				.rfc("MOV5559")
				.build());
		
		return clientes;
	}
	
	

}
