package com.gaesilva.cadastro_V1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gaesilva.cadastro_V1.domain.Estate;
import com.gaesilva.cadastro_V1.dto.EstateDto;
import com.gaesilva.cadastro_V1.service.EstateService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
@Api(value = "Api")
public class EstateController {

	@Autowired
	private EstateService estateService;

	@GetMapping("/estate/{cnpj}")
	public ResponseEntity<EstateDto> findByCnpj(@PathVariable(value = "cnpj") String cnpj) {
		EstateDto dto = this.estateService.buscaPorCnpj(cnpj);
		return ResponseEntity.ok(dto);
	}

	@ApiOperation(value = "cadastra Imobiliarias")
	@PostMapping("/estate/cadastra")
	public Estate create(@RequestBody EstateDto dto) {
		return estateService.save(dto);
	}

	@GetMapping("/estate/media")
	public int media(@RequestParam("primeiroValor") int a, @RequestParam("segundoValor") int b) {
		return estateService.media(a, b);
	}

}
