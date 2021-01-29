package com.khirod.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.khirod.comp.KhirodProj;

public class Test {
	public static void main(String[] args) {
		
		Resource res=null;
		
		BeanFactory factory=null;
		
		KhirodProj khp=null;
		
		res=new FileSystemResource("src/com/khirod/cfg/applicationContext.xml");
		
		factory=new XmlBeanFactory(res);
		
		khp=factory.getBean("kh",KhirodProj.class);
		
		System.out.println(khp);
	}

}
