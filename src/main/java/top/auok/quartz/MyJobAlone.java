package top.auok.quartz;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import top.auok.quartz.bean.SayService;

@Component("myJobAlone")
public class MyJobAlone {

	@Resource
	private SayService sayService;

	private static Logger log = Logger.getLogger(MyJobAlone.class);

	public void execute() {
		log.info("i am Alone-mode bean, invoked by quartz.");
		sayService.sayHello();
	}
}
