package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class NestedBeanFactoryTest {

	public static void main(String[] args) {
		ApplicationContext pCtx=null,cCtx=null;
		MainController controller=null;
		List<EmployeeVO> listVO=null;
		//create Parent IOC container
		pCtx=new ClassPathXmlApplicationContext("com/nt/cfgs/business-beans.xml");
		//create Child IOC container
		cCtx=new ClassPathXmlApplicationContext(new String[] {"com/nt/cfgs/presentation-beans.xml"},pCtx);
		//get Controller class obj
		controller=cCtx.getBean("controller",MainController.class);
		try {
		//invoke method
		listVO=controller.showEmpsByDesgs("CLERK","MANAGER");
		  System.out.println("Emloyees having CLERK,MANAGER desgs are");
			/*for(EmployeeVO vo:listVO) {
			  System.out.println(vo);
			}*/
		  listVO.forEach(vo->{
			  System.out.println(vo);
		  });
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//close containers
		((AbstractApplicationContext) cCtx).close();
		((AbstractApplicationContext) pCtx).close();
		
	}//main
}//class
