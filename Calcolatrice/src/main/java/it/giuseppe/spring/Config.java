package it.giuseppe.spring;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import it.giuseppe.Calcolatrice;
import it.giuseppe.Operazione;

@Configuration
@ComponentScan(basePackageClasses = Calcolatrice.class)

public class Config {
	@Bean

	public Operazione Operazione() {
		
		Operazione operazione = new Operazione (0, 0);
		
		operazione.getOperazione();
		
		return operazione;
	}
	
	
		
		
	}

