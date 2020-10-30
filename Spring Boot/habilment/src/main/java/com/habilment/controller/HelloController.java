package com.habilment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilment")
public class HelloController {
	
	@GetMapping
	public String habilment() {
		return "As habilidades e mentalidades usadas essa semana foram:"
				+ "\n- Mentalidade de crescimento;"
				+ "\n- Persistência;"
				+ "\n- Atenção aos detalhes.";
	}

}
