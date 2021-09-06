package com.gaesilva.cadastro_V1.dto;

import org.springframework.stereotype.Service;

import com.gaesilva.cadastro_V1.domain.Estate;

@Service
public class EstateFactory {
	

	public Estate create (EstateDto dto) {
		Estate imobiliaria = new Estate();
		imobiliaria.setTradingName(dto.getTradingName());
		imobiliaria.setTelephone(dto.getTelephone());
		imobiliaria.setCompanyName(dto.getCompanyName());
		imobiliaria.setCnpj(dto.getCnpj());
		imobiliaria.setEnd(dto.getEnd());
		return imobiliaria;
				
	}


	
	public EstateDto parse  (Estate estate) {
		EstateDto dto = new EstateDto();
		dto.setCnpj(estate.getCnpj());
		dto.setTradingName(estate.getTradingName());
		dto.setTelephone(estate.getTelephone());
		dto.setCompanyName(estate.getCompanyName());
		dto.setCnpj(estate.getCnpj());
		dto.setEnd(estate.getEnd());
		return dto;
	}

}
