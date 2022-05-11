package com.test.API.repo;

import com.test.API.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo  extends JpaRepository<TodoItem, Long> {

}
