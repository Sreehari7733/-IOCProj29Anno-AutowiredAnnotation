package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Student;

public class CollectionInjectionTest {
	public static void main(String a[]) {
	DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	
	Student std=factory.getBean("std",Student.class);
	System.out.println(std);
			
	}
}
