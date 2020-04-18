package com.nt.hander;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.Local;



public class CountryHandler implements handler {

	@Override
	public String handler(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Locale[] locales=null;
	List<String> CountryList=null;
		//b.logic to get all the languages
		locales=Locale.getAvailableLocales();
		CountryList=new ArrayList();
		for(Locale l:locales) {
			CountryList.add(l.getDisplayCountry());
		}
		//keep the result in equest scope
		req.setAttribute("result",CountryList);
		//return lvn
		return "disp_country";
	}

}
