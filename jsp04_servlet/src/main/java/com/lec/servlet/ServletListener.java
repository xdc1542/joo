package com.lec.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// 개발자가 초기화하고 싶은 로직 구현
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// Listner가 종료될 때 개발자가 구현할 로직을 작성
	}
}
