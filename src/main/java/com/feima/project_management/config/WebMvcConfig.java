package com.feima.project_management.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //设置静态资源的访问地址，表示static下的静态资源可以跳过SpringMVC的拦截进行访问
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");

    }
}
