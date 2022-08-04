package com.ranjit.crud.interfaces;

import com.ranjit.crud.entity.ToDo;

import java.util.List;

public interface ToDoService {
    public ToDo saveToDo(ToDo toDo);

    List<ToDo> getAllToDos();
}
