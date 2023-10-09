package com.bxtp4pdemos.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bxtp4pdemos.app.entity.ToDo;
import com.bxtp4pdemos.app.service.TodoService;

@RestController
public class TodoController {

   @Autowired
   private TodoService todoService;

   @GetMapping("/todos")
   public List<ToDo> getToDos() {
      return todoService.getTodos();
   }

   @GetMapping("/todos/{id}") 
   public ToDo getToDo(@PathVariable Long id) { 
      return todoService.getTodoById(id);
   }

   @PostMapping("/todos")
   public ToDo createToDo(@RequestBody ToDo todo) {
      System.console().printf("title: %s\n", todo.getTitle());
      return todoService.saveTodo(todo);
   }

   @PutMapping("/todos/{id}")
   public ToDo updateToDo(@RequestBody ToDo todo, @PathVariable Long id) {
      return todoService.updateTodo(todo, id);
   }

   @DeleteMapping("/todos/{id}")
   public void deleteToDo(@PathVariable Long id) {
      todoService.deleteTodo(id);
   }
}