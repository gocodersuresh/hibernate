package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dao.StudentDao;

@Component
public class StudentService {
	@Autowired
	StudentDao stud;

	@Transactional 
	public void list()
	{
		stud.list().forEach(System.out::println);	
	}
}
