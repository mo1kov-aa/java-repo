import Task3001.TaskList;
import Task3001.TaskStatus;

public class Main {
    public static void main(String[] args) {
        TaskList newTask = new TaskList("Мои задачи 2");
        System.out.println(newTask.getStatus());
        newTask.addTask("Сходить в магазин");
        newTask.ShowInfo();
    }
}