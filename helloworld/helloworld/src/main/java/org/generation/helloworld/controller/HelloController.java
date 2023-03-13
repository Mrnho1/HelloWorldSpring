package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// indica ao spring que essa é uma classe controladora
@RestController
// indica um endpoint para nossa aplicação
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping String hello() {
		return "Alo Mundão, vamos aprender Spring Booot!!";
	}
	
//Criando uma sub rota
	@GetMapping("/bsm")
	public String bsm() {
		return "-Persistência<br/>"
				+ " -Mentalidade de Crescimento<br/> "
				+ "-Orientação ao Futuro<br/> "
				+ "-Responsabilidade Pessoal<br/> "
				+ "-Trabalho em Equipe<br/> "
				+ "-Comunicação<br/> "
				+ "-Comunicação Não Violenta<br/> "
				+ "-Atenção aos Detalhes<br/> "
				+ "-Proatividade";
	}
	
	
	@GetMapping("/skill")
	public String habilidades() {
		return "Desejo aprender como manipular dados usando a ferramenta Spring Boot e ter minha primeira experiência com API";
	}
}
