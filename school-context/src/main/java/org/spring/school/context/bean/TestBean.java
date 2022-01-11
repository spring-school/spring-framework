package org.spring.school.context.bean;

import org.springframework.stereotype.Component;

/**
 * @author lilin <lilin@kzl.com.cn>
 * @date 2022-01-11 10:51:55
 */
@Component
public class TestBean {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
