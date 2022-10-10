package com.test.Springbootdataapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.test.model.Session;  
import com.test.service.SessionService;  


@RestController
public class SessionController {

	@Autowired
	private SessionService sessionService;

	@RequestMapping("/sessions")
	public List<Session> getAllSession() {
		return sessionService.getAllSessions();
	}

	@RequestMapping(value = "/add-session", method = RequestMethod.POST)
	public void addUser(@RequestBody Session session) {
		sessionService.addUser(session);
	}

	@RequestMapping(value = "/get-session", method = RequestMethod.GET)
	public Session getSession(@RequestParam int id) {
		Session sessionTemp = sessionService.getUserSession(id);
		return sessionTemp;
	}
	
}
