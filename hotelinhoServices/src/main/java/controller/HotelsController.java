package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotels")
public class HotelsController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String getAllHotels(){
		System.out.println("in getAllHotels");
		return " ";
	}
	

}
