package br.com.misaw.sistematizacaopoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
@SpringBootApplication()
public class SistematizacaoPooApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistematizacaoPooApplication.class, args);
	}
}