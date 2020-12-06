package com.xzz.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//全面接管springboot中的mvc配置，只保留了最基础的基本配置
//@EnableWebMvc
public class MyMVCConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        当请求指定的路径时，跳转到指定视图
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/emp").setViewName("emp");
    }

}
