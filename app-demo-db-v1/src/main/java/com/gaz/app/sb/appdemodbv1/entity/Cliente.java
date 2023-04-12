package com.gaz.app.sb.appdemodbv1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
	
	private Long id;
	private String razonSocial;
    private String rfc;

}
