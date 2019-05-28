package com.main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController  
public class HomeController {  
	
	
	
	@Autowired
	LocationService ls;
	
	
	@CrossOrigin(origins = "*", maxAge = 3600)
	@RequestMapping("/hello")  
    public String hello(){  
		
		return ls.getLocation();
          
    }  
	
	  @SuppressWarnings("rawtypes")
	@RequestMapping(
	            value = "/**",
	            method = RequestMethod.OPTIONS
	    )
	    public ResponseEntity handle() {
	        return new ResponseEntity(HttpStatus.OK);
	    }
}  