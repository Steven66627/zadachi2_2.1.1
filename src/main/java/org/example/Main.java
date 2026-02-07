package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tuck tuck = new Tuck();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Меню:");
            System.out.println("1. Показать задачи");
            System.out.println("2. Добавить задачу");
            System.out.println("3. Удалить задачу");
            System.out.println("0. Выход");
            System.out.print("Ввод: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    tuck.showTasks();
                    break;
                case 2:
                    System.out.print("Ввод задачи: ");
                    String task = scanner.nextLine();
                    tuck.addTask(task);
                    break;
                case 3:
                    if (tuck.isEmpty()) {
                        System.out.println("Нет задач");
                    } else {
                        System.out.print("Номер задачи которую нужно удалить: ");
                        int num = Integer.parseInt(scanner.nextLine());
                        if (tuck.removeTask(num)) {
                            System.out.println("Задача удалена");
                        } else {
                            System.out.println("Неверный номер");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Некорректный выбор");
            }
        }
        scanner.close();
    }
}

class Tuck {
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