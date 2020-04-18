package com.nt.cfgs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {service_bean.class,persistance_bean.class,aop_bean.class} )
public class application_bean {

}
