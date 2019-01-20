package es.salesianos.edu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Coche {
	
	static Motor motor;
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-context.xml");
	    motor = (Motor) context.getBean("motor");
	    Frenos frenos = (Frenos) context.getBean("frenos");
	    motor.arrancar();
	    frenos.braking();
	}
}
