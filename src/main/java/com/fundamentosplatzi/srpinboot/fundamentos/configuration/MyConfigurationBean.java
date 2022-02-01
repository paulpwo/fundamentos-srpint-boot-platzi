package com.fundamentosplatzi.srpinboot.fundamentos.configuration;

import com.fundamentosplatzi.srpinboot.fundamentos.bean.MyBean;
import com.fundamentosplatzi.srpinboot.fundamentos.bean.MyBeanImplement;
import com.fundamentosplatzi.srpinboot.fundamentos.bean.MyBeanImplement2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){

        return new MyBeanImplement2();


    }
}
