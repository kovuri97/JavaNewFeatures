package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;

import com.student.beans.Course;
import com.student.beans.Student;

@Configuration
public class AppConfig {
	public AppConfig() {
		System.out.println("From AppConfig");
	}
	@Scope("singleton")
	@DependsOn("course")
	@Bean(name="student")
	public Student getStudent() {
		System.out.println("Student object is created");
	Student s = new Student();
	s.setName("Neelima");
	s.setRollnum(1);
	s.setCity("Hyderabad");
	return s;
		
	}
	@Bean(name="course")
	public Course getCourse() {
		System.out.println("Course object is created");
		Course c= new Course();
		c.setName("Science");
		c.setCourseid(112);
		return c;
	}
}
