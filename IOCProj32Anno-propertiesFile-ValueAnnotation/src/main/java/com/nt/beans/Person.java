package com.nt.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import lombok.ToString;

@Named("person")
@ToString
public class Person {

	@Qualifier("name")
	private String name;
	@Value("25")
	private int age;
	@Value("${per.height}")
	private float height;
	
	
	

}
