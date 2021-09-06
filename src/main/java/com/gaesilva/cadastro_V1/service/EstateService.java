package com.gaesilva.cadastro_V1.service;

import org.springframework.stereotype.Service;

import com.gaesilva.cadastro_V1.domain.Estate;
import com.gaesilva.cadastro_V1.dto.EstateDto;
import com.gaesilva.cadastro_V1.dto.EstateFactory;
import com.gaesilva.cadastro_V1.repository.EstateRepository;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class EstateService {

	private EstateRepository estateRepository;
	private EstateFactory estateFactory;

	public EstateService(EstateRepository estateRepository, EstateFactory estateFactory) {
		this.estateRepository = estateRepository;
		this.estateFactory = estateFactory;
	}

	public Estate save(EstateDto imobiliariaDto) {
		log.info("[Inicia] EstateService - save");
		Estate imobiliaria = estateFactory.create(imobiliariaDto);
		log.info("[Fim] EstateService - save");
		return this.estateRepository.save(imobiliaria);
	}

	public EstateDto buscaPorCnpj(String cnpj) {
		log.info("[Inicia] EstateService - save");
		//String bal = cnpj;
		Estate imobialiara = this.estateRepository.findByCnpj(cnpj);
		EstateDto dto = estateFactory.parse(imobialiara);
		log.info("[Fim] EstateService - save");
		return dto;
	}

	public int media(int a, int b) {
		log.info("[Inicia] EstateService - media");
		int soma = a + b;
		int media = soma / 2;
		log.info("[Fim] EstateService - media");
		return media;
	}

}
