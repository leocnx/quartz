package top.auok.quartz.bean;

import org.springframework.stereotype.Service;

@Service("sayService")
public class SayServiceImpl implements SayService {

	@Override
	public void sayHello() {
		System.out.println("hello.");
	}

}
