package com.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;

@Log
public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean {

	@Setter
	private Environment env;

	@Getter
	@Setter
	private String adminId;

	@Getter
	@Setter
	private String adminPwd;

	@Override
	public void afterPropertiesSet() throws Exception {
		// properties 세팅 후
		log.info("Called afterPropertiesSet()");
		setAdminId(env.getProperty("admin.id"));
		setAdminPwd(env.getProperty("admin.pwd"));
	}

	@Override
	public void destroy() throws Exception {
		log.info("Called destroy()");
	}
	
	@Override
	public void setEnvironment(Environment environment) {
		log.info("Called setEnvironment()");
		this.setEnv(environment);
	}
}
