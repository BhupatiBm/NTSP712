package com.nt.test;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class clientApp {
	
	public static void main(String[] args) {
		String msg1=null,msg2=null,msg3=null,msg4=null,msg5=null;
		JButton btn1=null,btn2=null,btn3=null,btn4=null;
		Frame frame=null;
		FileSystemXmlApplicationContext ctx=null;
		Locale locale=null;
		ctx= new FileSystemXmlApplicationContext("src/main/java/com/nt/cfg/applicationcontext.xml");
		locale=new Locale(args[0],args[1]);
		msg1=ctx.getMessage("btn.cap1", new Object[] {}, "msg1", locale);
		msg2=ctx.getMessage("btn.cap2", new Object[] {},"msg2", locale);
		msg3=ctx.getMessage("btn.cap3", new Object[] {},"msg3", locale);
		msg4=ctx.getMessage("btn.cap4", new Object[] {},"msg4", locale);
		msg5=ctx.getMessage("btn.cap2", new Object[] {},"msg5", locale);
		frame= new JFrame();
		btn1=new JButton(msg1);
		btn2=new JButton(msg2);
		btn3=new JButton(msg3);
		btn4=new JButton(msg4);
		frame.setLayout(new FlowLayout());
		frame.add( btn1);frame.add( btn2);
		frame.add( btn3);frame.add( btn4);
		frame.pack();
		frame.setVisible(true);
		ctx.close();
	}

}
