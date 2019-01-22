package es.salesianos.edu.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import es.salesianos.edu.model.Actor;
import es.salesianos.edu.repository.Repository;
import es.salesianos.edu.spring.Motor;


public class HelloServlet extends HttpServlet {
	
	
	@Autowired
	private Motor motor;
	
	@Autowired
	private Repository repo;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		motor.arrancar();
		String name = req.getParameter("name");
		Actor actor = new Actor();
		actor.setNomActor(name);
		actor.setApellidos("apellido");
		actor.setLugarNacimiento("Gallur");
		repo.insert(actor);
	}

	public Repository getRepo() {
		return repo;
	}

	public void setRepo(Repository repo) {
		this.repo = repo;
	}
}
