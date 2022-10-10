package com.test.repository;

import org.springframework.data.repository.CrudRepository;  
import com.test.model.Session;    

public interface SessionRepository extends CrudRepository<Session, String>{

}
