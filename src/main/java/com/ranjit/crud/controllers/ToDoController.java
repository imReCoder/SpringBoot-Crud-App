package com.ranjit.crud.controllers;

import com.ranjit.crud.entity.ToDo;
import com.ranjit.crud.interfaces.ToDoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoController {
    Logger logger = LoggerFactory.getLogger(ToDoController.class);

    @Autowired
    private ToDoService toDoService;

    @GetMapping("/")
    private String rootRoute(){
        return "<h1>Server is running</h1>";
    };

    @PostMapping("/save")
    private ToDo saveToDo(@RequestBody ToDo todo){
        System.out.println(todo.getName());
        return toDoService.saveToDo(todo);
    }

    @GetMapping("/todos")
    private List<ToDo> getAllToDos(){
        return toDoService.getAllToDos();
    }
}
