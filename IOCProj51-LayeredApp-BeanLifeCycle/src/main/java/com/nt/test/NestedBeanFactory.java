package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextException;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class NestedBeanFactory  {
	public static void main(String[] args) {
		ApplicationContext pCtx=null,cCtx=null;
		List<EmployeeVO> listvo=null;
		MainController controller=null;
		pCtx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfg/business_beans.xml");
		cCtx=new FileSystemXmlApplicationContext(new String[]{"src/main/java/com/nt/cfg/presentation_beans.xml"},pCtx);
		controller=cCtx.getBean("controller",MainController.class);
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


