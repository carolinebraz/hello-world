package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm-gen")
public class BsmGenController {
	
	@GetMapping
	public String bsmGeneration() {
		return "<p><b>	-- Habilidades Comportamentais e Mentalidades --	</b></p>"
				+ "<p>	Persistência			</p>"
				+ "<p>	Mentalidade de Crescimento	</p>"
				+ "<p>	Responsabilidade Pessoal	</p>"
				+ "<p>	Orientação ao Futuro		</p>"
				+ "<p>	Comunicação			</p>"
				+ "<p>	Proatividade			</p>"
				+ "<p>	Orientação ao Detalhe		</p>"
				+ "<p>	Trabalho em Equipe		</p>";
	}

}
