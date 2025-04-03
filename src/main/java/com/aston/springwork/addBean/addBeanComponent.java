package com.aston.springwork.addBean;

import org.springframework.stereotype.Component;

@Component
public class addBeanComponent {
    public String getMessage() {
        return "Hello Component Bean";
    }
}
