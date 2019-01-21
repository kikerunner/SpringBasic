package es.salesianos.edu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import es.salesianos.edu.spring.Motor;


public class HelloServlet extends HttpServlet {
	
	
	@Autowired
	Motor motor;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		motor.arrancar();
		super.doPost(req, resp);
	}
}
