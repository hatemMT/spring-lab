package com.emaratech.home.boundary;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBean {
    @Value("${emaratech.greeting}")
    String propertyValue;

    public String loadProperty() {
        return propertyValue;
    }


}
