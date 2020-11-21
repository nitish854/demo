package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PersonService;

/**
 * Basic Spring web service controller that handles all GET requests.
 */
@RestController
@RequestMapping("/")
public class HelloWorldController {
	
	@Autowired
	PersonService personService;

    private static final String MESSAGE_FORMAT = "Hello %s!";

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity helloWorldGet(@RequestParam(value = "name", defaultValue = "World") String name) {
        return ResponseEntity.ok(createResponse(name.concat(" custom message")));
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity helloWorldPost(@RequestParam(value = "name", defaultValue = "World") String name) {
        return ResponseEntity.ok(createResponse(name.concat(" custom message")));
    }
    
    @RequestMapping(path="persons", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getAllPersons() {
        return ResponseEntity.ok(personService.findAll());
    }
    
    @RequestMapping(path="locations", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getAllLocations() {
        return ResponseEntity.ok(personService.findAllC());
    }
    
    @RequestMapping(path="insertpersons", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity InsertPersons() {
        return ResponseEntity.ok(personService.addPerson());
    }

    private Map createResponse(String name) {
    	Map m = new HashMap();
    	m.put("Output", String.format(MESSAGE_FORMAT, name));
        return m;
    }
}
