package com.springwebapp.springwebapp;

import com.springwebapp.springwebapp.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringwebappApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringwebappApplication.class, args);

        MyController controller = context.getBean(MyController.class);

        System.out.println("from context bean - main()Ï");

        System.out.println(controller.sayHello());
    }

}
