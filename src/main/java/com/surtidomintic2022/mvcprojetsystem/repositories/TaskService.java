package com.surtidomintic2022.mvcprojetsystem.repositories;

import com.surtidomintic2022.mvcprojetsystem.entities.Task;

import java.util.List;

public interface TaskService {


    // Listar
    public List<Task> findAll();

    // Guardar
    public Task save(Task tarea);

    // Encontrar por id
    public Task findById(Long id);

    // Editar
    public Task update(Task task);

    // Eliminar
    public void delete (Long id);

}
