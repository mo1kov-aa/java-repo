package Task3001;

public class Utils{
    public void UpdateTaskToInProgress (TaskList list){
        list.setStatus(TaskStatus.INPROGRESS);
    }

    public void UpdateTaskToDone(TaskList list){
        list.setStatus(TaskStatus.ISDONE);
    }
}
