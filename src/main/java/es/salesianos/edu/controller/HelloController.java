package es.salesianos.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import es.salesianos.edu.model.Actor;
import es.salesianos.edu.repository.Repository;
import es.salesianos.edu.spring.Motor;

@Controller
public class HelloController {
	
	@Autowired
	private Motor motor;
	
	@Autowired 
	private Repository repo;
	
	@RequestMapping(path="/hello",method=RequestMethod.POST)
	private void hello(@RequestParam String name) {
		motor.arrancar();
		//String name = req.getParameter("name");
		Actor actor = new Actor();
		actor.setNomActor(name);
		actor.setApellidos("apellido");
		actor.setLugarNacimiento("Gallur");
		repo.insert(actor);
	}
}
