package es.salesianos.edu.spring;

import org.springframework.stereotype.Component;

@Component("frenos")
public class Frenos {
	public void braking() {
		System.out.println("Estoy frenando");
	}
}
