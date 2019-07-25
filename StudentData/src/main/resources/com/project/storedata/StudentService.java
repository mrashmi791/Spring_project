package com.project.storedata;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@autowired
	
	private StudentRepository repo;
		
	
	public List<Student> listAll() {
		return (list<Student>) repo.findAll();
	}

}
