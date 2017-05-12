package top.auok.quartz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// init spring ioc container
		new ClassPathXmlApplicationContext("applicationContext.xml");
	}
}
