package com.gaz.app.sb.appdemodbv1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gaz.app.sb.appdemodbv1.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	//JPQL: Java Persistence Query Language
	@Query ("select c from Cliente c where upper(c.razonSocial) like upper(:razonSocial)")
	List<Cliente> getByRazonSocial(@Param("razonSocial") String razonSocial);



}
