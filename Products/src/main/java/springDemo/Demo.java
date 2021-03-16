package springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		AmazonCompany o = (AmazonCompany) context.getBean("company");
		System.out.println(o.ItemNumber("shirt"));
		AmazonCompany o1 = (AmazonCompany) context.getBean("company1");
		System.out.println(o1.ItemNumber("shoe"));
		AmazonCompany o2 = (AmazonCompany) context.getBean("company2");
		System.out.println(o2.ItemNumber("Watch"));
		AmazonCompany o3 = (AmazonCompany) context.getBean("company3");
		System.out.println(o3.ItemNumber("sport shoe"));
	}
}
