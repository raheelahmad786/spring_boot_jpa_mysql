package com.test.service;

import java.util.List;    
import java.util.ArrayList;    
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Service; 
import com.test.model.Session;  
import com.test.repository.SessionRepository;    


@Service
public class SessionService {

	@Autowired
	private SessionRepository sessionRepository;

	public List<Session> getAllSessions() {
		List<Session> userRecords = new ArrayList<>();
		sessionRepository.findAll().forEach(userRecords::add);
		return userRecords;
	}

	public void addUser(Session session) {
		sessionRepository.save(session);
	}
	
	public void deleteUser(Session session) {
		sessionRepository.delete(session);
	}
	
	public Session getUserSession(int id) {
		Session tempsession = sessionRepository.findById(id).get();
		return tempsession;
	}
}
