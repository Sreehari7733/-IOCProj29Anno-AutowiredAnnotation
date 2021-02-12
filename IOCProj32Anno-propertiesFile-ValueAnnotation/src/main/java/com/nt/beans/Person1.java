package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.ToString;
@ToString
@Component("person1")
@PropertySource(value="com/nt/commons/person.properties")
public class Person1 {
	@Value("${per.name}")
	private String name;
	@Value("${per.age}")
	private int age;
	@Value("${per.height}")
	private float height;
	@Value("${os.name}")
	private String os;
	@Value("${Path}")
	private String path;
	
	
}
