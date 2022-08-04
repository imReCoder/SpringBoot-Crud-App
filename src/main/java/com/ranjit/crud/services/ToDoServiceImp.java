package com.ranjit.crud.services;

import com.ranjit.crud.entity.ToDo;
import com.ranjit.crud.interfaces.ToDoService;
import com.ranjit.crud.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServiceImp implements ToDoService {
    @Autowired
    private TodoRepository todoRepository;

    public ToDo saveToDo(ToDo toDo){
        return todoRepository.save(toDo);
    }

    @Override
    public List<ToDo> getAllToDos() {
        return todoRepository.findAll();
    }
}
