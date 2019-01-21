package es.salesianos.edu.spring;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("gearbox")
public class GearBox {
	
	private List<String> Marchas;

	public List<String> getMarchas() {
		return Marchas;
	}

	public void setMarchas(List<String> marchas) {
		Marchas = marchas;
	}

}
