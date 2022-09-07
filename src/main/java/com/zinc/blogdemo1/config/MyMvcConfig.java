package com.zinc.blogdemo1.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

//扩展SpringMVC
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    //实现视图解析器接口类

    public static class MyViewResolver implements ViewResolver {

        @Bean
        public ViewResolver myViewResolver(){
            return new MyViewResolver();
        }


        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }




}
