package org.example;

import java.util.ArrayList;

public class Tuck {
    private final ArrayList<String> tasks;

    public Tuck() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public boolean removeTask(int index) {
        if (index >= 1 && index <= tasks.size()) {
            tasks.remove(index - 1);
            return true;
        } else {
            return false;
        }
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Нет задач");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public boolean isEmpty() {
        return tasks.isEmpty();
    }
}
