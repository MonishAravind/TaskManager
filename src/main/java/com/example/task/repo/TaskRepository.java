package com.example.task.repo;

import com.example.task.entity.PriorityLevel;
import com.example.task.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {

    List<Task> findByPriorityLevel(PriorityLevel priorityLevel);

}
