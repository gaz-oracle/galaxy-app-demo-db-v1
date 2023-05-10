package com.gaz.app.sb.appdemodbv1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.BeanUtils;
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

	@Override
	public List<Cliente> getByRazonSocial(String razonSocial) {

		return clienteRepository.getByRazonSocial("%" + razonSocial + "%");
	}

	@Override
	public Cliente update(Cliente clienteupdate) {
		Cliente resCliente = clienteRepository.findById(clienteupdate.getId()).orElseThrow();

		if (!Objects.isNull(resCliente)) {
			BeanUtils.copyProperties(clienteupdate, resCliente);
			clienteRepository.save(resCliente);
		}

		return null;
	}

	@Override
	
	 public void deleteClienteF(Long id) {
		
		clienteRepository.deleteById(id);
		
	}

	@Override
	public void deleteClienteL(Long id) {
		//clienteRepository.saveAll(id);
	}

}
