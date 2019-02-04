package com.connect.plus;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(path="/home",produces="application/json")
public class Home {
	
	@GetMapping
	public ResponseEntity<String> echoWelcomeMessage(){
		ResponseEntity<String> response=new ResponseEntity<String>("Hello", HttpStatus.OK);
		return response;
	}

}
