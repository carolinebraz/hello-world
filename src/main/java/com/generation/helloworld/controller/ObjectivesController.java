package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjectivesController {
	
	@GetMapping
	public String objectives() {
		return "<p><b>	-- Objetivos de Aprendizagem da Semana --	</b></p>"
				+ "<p>	Desafios de Código	</p>"
				+ "<p>	Comunicação		</p>"
				+ "<p>	Spring Boot		</p>"
				+ "<p>	Insomnia		</p>";
	}

}