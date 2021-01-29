package com.khirod.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.khirod.comp.khirodProj;

public class Test {
	public static void main(String[] args) {
		
		Resource res=null;
		
		BeanFactory factory=null;
		
		khirodProj kpp=null;
		
		String result=null;
		
		res=new FileSystemResource("src/com/khirod/cfg/applicationContext.xml");
		
		factory=new XmlBeanFactory(res);
		
		kpp=factory.getBean("kh",khirodProj.class);
		
		System.out.println(kpp.getSadd());
		System.out.println(kpp.getSname());
		System.out.println(kpp.getSno());
		System.out.println(kpp.getSsal());
		System.out.println(kpp.getSjob());
		
		
	}

}
