package com.khirod.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.khirod.comp.WishMessageGenerator;

public class Test {
	
	public static void main(String[] args) {
		
		String result=null;
		
		Resource res=null;
		
		BeanFactory factory=null;
		
		WishMessageGenerator wish=null;
		
		Object obj=null;
		
		res=new FileSystemResource("src/com/khirod/cfg/applicationContext.xml");
		
		factory=new XmlBeanFactory(res);
		
		obj=factory.getBean("wmg");
		
		wish=(WishMessageGenerator)obj;
		
		
		
		
	result=wish.generateWishMessage("khirod");
	
	System.out.println(result);
	System.out.println(wish.getDate());
	
	
	
	
	}

}
