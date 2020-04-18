package com.nt.hander;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.Local;



public class LanguageHandler implements handler {

	@Override
	public String handler(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Locale[] locales=null;
	List<String> langList=null;
		//b.logic to get all the languages
		locales=Locale.getAvailableLocales();
		langList=new ArrayList();
		for(Locale l:locales) {
			langList.add(l.getDisplayLanguage());
		}
		//keep the result in equest scope
		req.setAttribute("result",langList);
		//return lvn
		return "disp_lang";
	}

}
