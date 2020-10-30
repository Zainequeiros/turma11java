package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class Lista1SpringBootController {
	
	@GetMapping
	public String objetivos() {
		return "Os objetivos de aprendizagem dessa semana eram:"
				+ "\n- Aprender os conceiros iniciais de MySQL;"
				+ "\n- Aprender os conceitos iniciais de SpringBoot"
				+ "\n- Utilizar o postman e o xampp."
				+ "\n- Absorver todo o conteúdo e aplicar de forma prática.";
	}

}
