package br.com.cielo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioBackendCieloApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DesafioBackendCieloApplication.class);

	public static void main(String[] args) {
		log.info("SERVIÇO PRONTO PARA SER CONSUMIDO!......");
		SpringApplication.run(DesafioBackendCieloApplication.class, args);
		System.out.println("SERVIÇO PRONTO PARA SER CONSUMIDO!......");
	}

}
