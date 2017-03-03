package com.xywei.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = { "com.xywei.service", "com.xywei.dao" })
public class JavaBeanConfig {

}
