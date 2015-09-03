package controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import business.HotelinhoBusinessServices;
import model.CustomerBO;
import model.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/users")
public class CustomersController {
	@Autowired
	private HotelinhoBusinessServices business;

	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public CustomerBO addNewCustomer(@RequestBody CustomerBO customerBO) {
		business.addNewCustomer(customerBO);
		return customerBO;
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public CustomerBO logIn(@RequestParam String username, @RequestParam String password) throws ResourceNotFoundException{
		//System.out.println(values.get("username")+ " "+values.get("password"));
		
		return business.login(username,password);
		
		
	}
	
	
	
	
	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handleResourceNotFoundException(ResourceNotFoundException error) {
		return error.getMessage();

	}
	
}
