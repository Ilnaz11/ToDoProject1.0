package ru.baymukhametov.FirstProject.Service;

import org.springframework.stereotype.Service;
import ru.baymukhametov.FirstProject.Entity.MyTask;

import java.util.List;

@Service
public interface TaskService {

    MyTask createTask(MyTask task);
    List<MyTask> getAllTasks();
    void deleteTask(MyTask myTask);
    boolean toggleCompleted(Long id);
}
