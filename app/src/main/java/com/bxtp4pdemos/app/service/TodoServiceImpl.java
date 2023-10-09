package com.bxtp4pdemos.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bxtp4pdemos.app.entity.ToDo;
import com.bxtp4pdemos.app.repository.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService {

   @Autowired
   private TodoRepository todoRepository;

   @Override
   public ToDo saveTodo(ToDo todo) {
      return todoRepository.saveAndFlush(todo);
   }

   @Override
   public List<ToDo> getTodos() {
      return (List<ToDo>) todoRepository.findAll();
   }

   @Override
   public ToDo getTodoById(Long todoId) {
      Optional<ToDo> todo = todoRepository.findById(todoId);
      if (todo.isPresent()) {
         return todo.get();
      } else {
         return null;
      }
   }

   @Override
   public ToDo updateTodo(ToDo todo, Long todoId) {
      Optional<ToDo> todoToUpdate = todoRepository.findById(todoId);
      if (!todoToUpdate.isPresent()) {
         return null;
      }

      todoToUpdate.get().setTitle(todo.getTitle());
      todoToUpdate.get().setDescription(todo.getDescription());
      todoToUpdate.get().setCompleted(todo.isCompleted());
      return todoRepository.save(todoToUpdate.get());
   }

   @Override
   public void deleteTodo(Long todoId) {
      Optional<ToDo> todo = todoRepository.findById(todoId);
      if (todo.isPresent()) {
         todoRepository.delete(todo.get());
      }
   }
}