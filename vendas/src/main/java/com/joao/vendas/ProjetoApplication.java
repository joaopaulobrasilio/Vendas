package com.joao.vendas;

import com.joao.vendas.model.Cliente;
import com.joao.vendas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjetoApplication {

	@Bean
	public CommandLineRunner run (@Autowired ClienteRepository repository){
		return args ->{

			Cliente cliente = Cliente.builder().cpf("11820157946").nome("Joao Paulo").build();
			repository.save(cliente);

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}

}
