package com.surtidomintic2022.mvcprojetsystem.repositories;

import com.surtidomintic2022.mvcprojetsystem.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
