package ru.baymukhametov.FirstProject.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.baymukhametov.FirstProject.Entity.MyTask;
import ru.baymukhametov.FirstProject.Service.TaskService;

import java.util.List;

@RestController
@RequestMapping
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/")
    public MyTask createTask(MyTask task) {
        return task = taskService.createTask(task);

    }

    @GetMapping
    public List<MyTask> getAllTasks() {
        return taskService.getAllTasks();
    }


    @DeleteMapping("/{id}")
    public void deleteTask(Long id) {
        taskService.deleteTask(id);
    }


    @PutMapping
    public MyTask toggleComplete(@PathVariable Long id) {
        return taskService.toggleCompleted(id);
    }

}