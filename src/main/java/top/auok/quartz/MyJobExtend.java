package top.auok.quartz;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import top.auok.quartz.bean.SayService;

public class MyJobExtend extends QuartzJobBean {

	@Resource
	private SayService sayService;

	private static Logger log = Logger.getLogger(MyJobExtend.class);

	@Override
	protected void executeInternal(JobExecutionContext ctx) throws JobExecutionException {
		log.info("i am Extend-mode bean, invoked by quartz.");
		sayService.sayHello();
	}

}
