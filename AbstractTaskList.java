package ua.edu.sumdu.ta.Karina.pr3;

public abstract class AbstractTaskList
{
    protected int mLength;
    final int value = 10;
    protected int count = 0;
    static int numberOfLists = 0;
    static String startOfTitle = "[EDUCTR][TA]";
    protected Task[] mTask;

    abstract void add(Task task);
    abstract void remove(Task task);
    abstract Task getTask(int index);

    public int size()
    {
        return count;
    }

}
