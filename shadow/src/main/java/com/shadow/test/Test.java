package com.shadow.test;

import com.shadow.config.Config;
import com.shadow.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(Config.class);

		UserDao dao = annotationConfigApplicationContext.getBean(UserDao.class);
		dao.test();
		// UserDao dao1 = annotationConfigApplicationContext.getBean(UserDao.class);
		// System.out.println(dao.hashCode() + "=========" + dao1.hashCode());
		System.out.println(dao.hashCode());
	}
}
