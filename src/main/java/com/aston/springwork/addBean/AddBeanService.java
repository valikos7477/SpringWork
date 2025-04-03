package com.aston.springwork.addBean;

import org.springframework.stereotype.Service;

@Service
public class AddBeanService {
    public String getMessage() {
        return "Hello Service Bean";
    }
}
