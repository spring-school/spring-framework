package org.spring.school.context;

import org.spring.school.context.bean.TestBean;
import org.spring.school.context.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lilin <lilin@kzl.com.cn>
 * @date 2022-01-11 10:51:07
 */
public class TestContext {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		TestBean bean = context.getBean(TestBean.class);
		System.out.println(bean);
	}
}
