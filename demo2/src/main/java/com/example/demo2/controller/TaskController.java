package com.example.demo2.controller;

import com.example.demo2.model.TableTest1Entity;
import com.example.demo2.repository.DemoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class TaskController {
    private final DemoRepository demoRepository;

    public TaskController(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }


    @PostMapping("/tasks")
    public TableTest1Entity create(@RequestBody TableTest1Entity TestEntity) {

        return demoRepository.save(TestEntity);
//        return demoRepository.findById(Long.valueOf(1));
    }
}
