package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hallo")
public class halloController {

	@GetMapping
	public String hello() {
		return "Persistencia, Trabalho em equipe e Atenção aos detalhes";
	}
}
