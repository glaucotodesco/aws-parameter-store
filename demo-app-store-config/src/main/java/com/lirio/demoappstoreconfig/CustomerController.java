package com.lirio.demoappstoreconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RefreshScope
@RestController
@RequestMapping
public class CustomerController {

    @Value("${customer.name}")
    private String name;

    @Value("${customer.age}")
    private String age;

    @Value("${customer.pass}")
    private String pass;

    @GetMapping
    public List<String> get() {
        return List.of(name, age, pass);
    }

}


//https://enlear.academy/how-to-use-aws-parameter-store-39a123f1c57a
//https://medium.com/@diegolirio/centralizando-as-configura%C3%A7%C3%B5es-na-aws-com-parameter-store-e-spring-boot-part-1-dbfbdb57861c