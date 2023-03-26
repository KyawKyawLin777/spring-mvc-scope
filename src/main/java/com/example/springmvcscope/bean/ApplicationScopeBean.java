package com.example.springmvcscope.bean;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
@Data
public class ApplicationScopeBean {

    private Integer value;
}
