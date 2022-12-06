package com.keyla.apicharadas.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="/charadas")
@RestController
public class CharadasController {

	@PostMapping(value="/cadastro")
	public String cadastraCharadas(@RequestParam(value = "titulo") String titulo,
			@RequestParam(value = "pergunta") String pergunta, @RequestParam(value = "resposta") String resposta) {
		return "Charada cadastrada!";
	}
	
	
}
