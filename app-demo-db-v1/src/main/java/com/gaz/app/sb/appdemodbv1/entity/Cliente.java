package com.gaz.app.sb.appdemodbv1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="TBL_CLIENTE")
public class Cliente {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CLIENTE_ID")
	private Long id;
	
	@Column(name = "RAZONSOCIAL")
	private String razonSocial;
	
	@Column(name = "RFC")
    private String rfc;

}
