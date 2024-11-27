package project1.testing.Application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import project1.testing.UniversityConfig;
import project1.testing.UniversityServiceSupport;

public class UniversityApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UniversityConfig.class);
		UniversityServiceSupport bean = context.getBean(UniversityServiceSupport.class);

		bean.getinformationAboutPayment();
	}
}
