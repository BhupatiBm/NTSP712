package com.nt.cfgs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {persistanceConfig.class,aop.class,service.class})
public class ApplicationConfig {

}
