package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;
import com.service.StudentService;

public class TestStudent {
public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:/spring1.xml");
	StudentService st=(StudentService)ctx.getBean(com.service.StudentService.class);
	
	st.list();
	
}
}
