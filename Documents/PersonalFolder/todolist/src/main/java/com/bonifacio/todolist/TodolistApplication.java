package com.bonifacio.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //anotation - interface que executa algo (tem funcao por tras)
public class TodolistApplication {

	//metodo principal - para executar a aplicacao
	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

}
