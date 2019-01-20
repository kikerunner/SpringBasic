package es.salesianos.edu.spring;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("luces")
public class Luces {
	
	private String iluminacion;

	public String getIluminacion() {
		return iluminacion;
	}

	public void setIluminacion(String iluminacion) {
		this.iluminacion = iluminacion;
	}

}
