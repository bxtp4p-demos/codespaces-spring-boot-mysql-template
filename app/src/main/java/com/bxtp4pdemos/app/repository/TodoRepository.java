package com.bxtp4pdemos.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bxtp4pdemos.app.entity.ToDo;

@Repository 
public interface TodoRepository extends JpaRepository<ToDo, Long> {
}
