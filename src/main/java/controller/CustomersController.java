package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import business.Business;
import dao.model.CustomerDTO;
import model.CustomerBO;

@RestController
@RequestMapping("/customers")
public class CustomersController {
	@Autowired
	private Business business;

	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public CustomerBO addNewCustomer(@RequestBody CustomerBO customerBO) {
		business.addNewCustomer(customerBO);
		return customerBO;
	}
}
