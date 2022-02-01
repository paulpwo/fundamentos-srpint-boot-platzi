package com.fundamentosplatzi.srpinboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency {
    @Override
    public void saludar() {
        System.out.println("Saludar desde el componente Two");
    }
}
