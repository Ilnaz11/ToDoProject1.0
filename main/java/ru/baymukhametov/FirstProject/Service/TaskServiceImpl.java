package ru.baymukhametov.FirstProject.Service;

import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;
import ru.baymukhametov.FirstProject.Entity.MyTask;
import ru.baymukhametov.FirstProject.Repository.TaskRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;


    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public MyTask createTask(MyTask task) {
        return taskRepository.save(task);
    }

    @Override
    public List<MyTask> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public void deleteTask(MyTask myTask) {
        taskRepository.delete(myTask);
    }
    @Override
    public boolean toggleCompleted(Long taskId) {
        MyTask task = taskRepository.findById(taskId)
                .orElseThrow(() -> new RuntimeException("Task not found"));
        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);
        return task.isCompleted();
    }
}