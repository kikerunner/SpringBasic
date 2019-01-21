package es.salesianos.edu.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Maletero {
	
	@Autowired
	private CamaraTrasera camaraTrasera;

	public CamaraTrasera getCamaraTrasera() {
		return camaraTrasera;
	}

	public void setCamaraTrasera(CamaraTrasera camaraTrasera) {
		this.camaraTrasera = camaraTrasera;
	}
	
	

}
