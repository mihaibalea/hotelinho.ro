package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import business.Business;

@RestController
@RequestMapping("/hotels")
public class HotelsController {
	@Autowired
	private Business business;

	@RequestMapping(method = RequestMethod.GET)
	public String getAllHotels() {
		System.out.println("This print is from getAllHotels");
		return " ";
	}

}
