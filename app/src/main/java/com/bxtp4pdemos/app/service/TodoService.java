package com.bxtp4pdemos.app.service;

import java.util.List;

import com.bxtp4pdemos.app.entity.ToDo;

public interface TodoService {
   ToDo saveTodo(ToDo todo);

   List<ToDo> getTodos();

   ToDo getTodoById(Long todoId);

   ToDo updateTodo(ToDo todo, Long todoId);

   void deleteTodo(Long todoId);
}