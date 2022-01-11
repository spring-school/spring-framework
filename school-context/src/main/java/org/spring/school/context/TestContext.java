package org.spring.school.context;

import org.spring.school.context.bean.TestBean;
import org.spring.school.context.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lilin <lilin@kzl.com.cn>
 * @date 2022-01-11 10:51:07
 */
public class TestContext {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		 try {
			 context.getBean(TestBean.class);
		 }catch (Throwable throwable){
			 System.out.println(throwable.getMessage());
		 }
	}
}
