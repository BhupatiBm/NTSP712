package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class NestedBeanFactory  {
	public static void main(String[] args) {
		DefaultListableBeanFactory pfactory=null,cfactory=null;
		XmlBeanDefinitionReader preader=null, creader=null;
		List<EmployeeVO> listvo=null;
		MainController controller=null;
		pfactory=new DefaultListableBeanFactory();
		preader=new XmlBeanDefinitionReader(pfactory);
		preader.loadBeanDefinitions("com/nt/cfg/business_beans.xml");
		cfactory=new DefaultListableBeanFactory(pfactory);
		creader=new XmlBeanDefinitionReader(cfactory);
		creader.loadBeanDefinitions("com/nt/cfg/presentation_beans.xml");
		controller=cfactory.getBean("controller",MainController.class);
		try {
			listvo=controller.showEmpBySal(3000, 1300);
			System.out.println("Employee having salary 3000 and 1300 are---->");
			for(EmployeeVO vo:listvo) {
				System.out.println(vo);
			}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
	}
}


