package com.nt.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.config.BusinessConfig;
import com.nt.config.PresentationConfig;
import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class NestedBeanFactoryTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext pCtx=null,cCtx=null;
		MainController controller=null;
		List<EmployeeVO> listVO=null;
		//create Parent IOC container
		pCtx=new AnnotationConfigApplicationContext(BusinessConfig.class);
		//create Child IOC container
		cCtx=new AnnotationConfigApplicationContext(PresentationConfig.class);
		cCtx.setParent(pCtx);
		
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
