package es.salesianos.edu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Coche {
	
	static Motor motor;
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-context.xml");
	    motor = (Motor) context.getBean("motor");
	    Frenos frenos = (Frenos) context.getBean("frenos");
	    Luces lucesCortas = (Luces) context.getBean("lucesCortas");
	    Luces lucesLargas = (Luces) context.getBean("lucesLargas");
	    motor.arrancar();
	    frenos.braking();
	    System.out.println(lucesCortas.getIluminacion());
	    System.out.println(lucesLargas.getIluminacion());
	}
}
