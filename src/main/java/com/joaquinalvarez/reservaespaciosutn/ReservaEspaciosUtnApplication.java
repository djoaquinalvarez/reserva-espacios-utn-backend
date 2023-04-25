package com.joaquinalvarez.reservaespaciosutn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ReservaEspaciosUtnApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservaEspaciosUtnApplication.class, args);
	}

}
