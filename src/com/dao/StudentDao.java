package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.model.Student;

@Component
public class StudentDao {
	@PersistenceContext
	EntityManager em;

	public List<Student> list()
	{
		return em.createQuery("Select s from Student s").getResultList();	
	}
}
