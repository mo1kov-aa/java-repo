package Task3001;

import java.util.ArrayList;

public class TaskList extends Utils{
  private String title;
  private  ArrayList <String> taskList = new ArrayList<>();
  private String task;
  private  TaskStatus status;

  public TaskList(){
      this.title="not_specified";
      this.status = TaskStatus.NULL;
  }

  public TaskList(String title){
      this.title = title;
      this.status = TaskStatus.NULL;
  }

  public void addTask(String task){
      this.taskList.add(task);
      updateStatus(taskList);
  }

  public void updateStatus(ArrayList taskList){
      if(taskList.size() > 0) {
          setStatus(TaskStatus.INPROGRESS);
      }
  }

  public String getTitle() {
      return title;
  }

  public void setTitle(String title) {
      this.title = title;
  }

  public TaskStatus getStatus() {
      return status;
  }

  public void setStatus(TaskStatus status) {
      this.status = status;
  }

  public void ShowInfo(){
      System.out.println(this.title);
      System.out.println(this.taskList);
      System.out.println(this.status);
      System.out.println("\n");
  }

}
