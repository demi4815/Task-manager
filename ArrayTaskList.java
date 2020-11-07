package ua.edu.sumdu.ta.Karina.pr3;

public class ArrayTaskList extends AbstractTaskList
{
    public ArrayTaskList()
    {
        mTask = null;
        mLength = 0;
        numberOfLists++;
    }

    @Override
    public void add(Task task)
    {
        assert(task != null);

        if (count >= mLength)
        {
            resize();
        }
        task.title = startOfTitle + " " + task.title;
        mTask[count] = task;
        count++;
    }

    public void resize()
    {
        Task[] data = new Task[mLength + value];

        if (mLength >= 0) System.arraycopy(mTask, 0, data, 0, mLength);

        mTask = null;
        mTask = data;
        mLength = mLength + value;
    }

    @Override
    public void remove(Task task)
    {
        assert(task != null);

        int index = -1;

        for (int i = 0; i  < mLength; i++)
        {
            if(mTask[i].equals(task))
            {
                index = i;
                break;
            }
        }

        if (index >= 0)
        {
            Task[] data = new Task[mLength - 1];

            System.arraycopy(mTask, 0, data, 0, index);

            //for (int i = index + 1; i < mLength; i++) data[i-1] = mTask[i];
            if (mLength - index + 1 >= 0) System.arraycopy(mTask, index + 1, data, index + 1 - 1, mLength - index + 1);

            mTask = null;
            mTask = data;
            mLength--;
        }
    }

    @Override
    public Task getTask(int index)
    {
        assert(index >= 0 && index < mLength);
        return mTask[index];
    }

}
