package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication()
//@EnableJpaRepositories(basePackages = "com.example.demo2.repository")
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);

//        TableTest1Entity Test1Entity = new TableTest1Entity();

  //      Test1Entity.setId(7);
  //      Test1Entity.setName("Nick");
    //    Test1Entity.setLastname("VN");

  //      TaskController controller = new TaskController();
       //     controller.create(Test1Entity);


    }

}




