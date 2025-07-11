package ru.baymukhametov.FirstProject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Setter;

@Entity
public class MyTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @Setter
    private boolean completed;

    public MyTask(String description, boolean completed) {
        this.description = description;
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

}
