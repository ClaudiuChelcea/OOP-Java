package Abstractization.task2;

import Abstractization.task1.Task;

import java.util.ArrayList;

public class Queue implements Container {
    /* Hold objects */
    ArrayList<Task> my_objects = new ArrayList<>();

    /**
     *  Removes a Task from the Container.
     *  Returns: the removed Task, if the Container is not empty; null, otherwise
     *
     */
    public Task pop() {
        if (!my_objects.isEmpty()) {
            Task my_removed_object = my_objects.get(0);
            my_objects.remove(0);
            return my_removed_object;
        } else return null;
    }

    public ArrayList<Task> getTasks() {
        return my_objects;
    }

    public void push(Task task) {
        my_objects.add(task);
    }

    public void transferFrom(Container container) {
        for (var el :((Stack) container).my_objects)
            this.my_objects.add(el);
    }
}
