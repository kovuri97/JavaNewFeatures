package com.app.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.student.beans.Student;
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext o = new AnnotationConfigApplicationContext(AppConfig.class);
		Student st =(Student)o.getBean("student");
		System.out.println("values: "+st.toString());
	}

}
