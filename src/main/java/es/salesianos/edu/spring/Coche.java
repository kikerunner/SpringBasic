package es.salesianos.edu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Coche {
	
	@Autowired
	private Motor motor;
	@Autowired
	@Qualifier("lucesCortas")
	private Luces lucesCortas;
	@Autowired
	@Qualifier("lucesLargas")
	private Luces lucesLargas;
	@Autowired
	private Frenos frenos;
	
	public static void main(String[] args) {
		new Coche();
	}
	
	public Coche() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-context.xml");
	    AutowireCapableBeanFactory acbFactory = context.getAutowireCapableBeanFactory();
		acbFactory.autowireBean(this);
	    getMotor().arrancar();
	    getFrenos().braking();
	    System.out.println(getLucesCortas().getIluminacion());
	    System.out.println(getLucesLargas().getIluminacion());
	    
	}
	
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public Luces getLucesCortas() {
		return lucesCortas;
	}
	
	public void setLucesCortas(Luces lucesCortas) {
		this.lucesCortas = lucesCortas;
	}
	
	public void setLucesLargas(Luces lucesLargas) {
		this.lucesLargas = lucesLargas;
	}
	
	public Luces getLucesLargas() {
		return lucesLargas;
	}
	public Frenos getFrenos() {
		return frenos;
	}
	public void setFrenos(Frenos frenos) {
		this.frenos = frenos;
	}
}
