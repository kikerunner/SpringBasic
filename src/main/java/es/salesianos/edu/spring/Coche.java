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
	
	@Autowired
	@Qualifier("MangualGearBox")
	private GearBox automatic;
	
	@Autowired
	@Qualifier("AutomaticGearBox")
	private GearBox manual;
	
	@Autowired
	private Maletero maletero;
	
	public static void main(String[] args) {
		Coche coche = new Coche();
		coche.initialize();
	}
	
	public Coche() {
	    
	}
	
	private void initialize() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-context.xml");
	    AutowireCapableBeanFactory acbFactory = context.getAutowireCapableBeanFactory();
		acbFactory.autowireBean(this);
	    getMotor().arrancar();
	    getFrenos().braking();
	    System.out.println(getLucesCortas().getIluminacion());
	    System.out.println(getLucesLargas().getIluminacion());
	    System.out.println(getAutomatic().getMarchas());
	    System.out.println(getManual().getMarchas());
	    getMaletero().getCamaraTrasera().camaraGrabando();
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
	
	public void setManual(GearBox manual) {
		this.manual = manual;
	}
	public void setAutomatic(GearBox automatic) {
		this.automatic = automatic;
	}
	public Luces getLucesLargas() {
		return lucesLargas;
	}
	public Frenos getFrenos() {
		return frenos;
	}
	public GearBox getManual() {
		return manual;
	}
	public GearBox getAutomatic() {
		return automatic;
	}
	public void setFrenos(Frenos frenos) {
		this.frenos = frenos;
	}

	public Maletero getMaletero() {
		return maletero;
	}

	public void setMaletero(Maletero maletero) {
		this.maletero = maletero;
	}	
}
