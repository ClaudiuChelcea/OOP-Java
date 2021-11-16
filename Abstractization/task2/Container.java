package Abstractization.task2;

import Abstractization.task1.Task;

import java.util.ArrayList;

public interface Container {
    /* Hold objects */
    ArrayList<Task> my_objects = new ArrayList<>();

    /**
     * Removes a Task from the Container.
     *
     * @return the removed Task, if the Container is not empty;
     *         null, otherwise
     */
    Task pop();

    /**
     * Inserts a Task in the Container.
     *
     * @param task the inserted Task
     */
    void push(Task task);

    /**
     * Returns the number of elements from the Container.
     *
     * @return The number of elements in this container.
     */
    default public int size() {
        return my_objects.size();
    }

    /**
     * Verifies if the Container is empty or not.
     *
     * @return true,  if the Container is empty
     *         false, otherwise
     */
    default public boolean isEmpty() {
        return my_objects.isEmpty();
    }

    /**
     * Transfers all the elements that exist in a Container in this Container.
     *
     * @param container the Container from which we should transfer elements.
     *                  After the transfer, container.size() == 0
     */
    public void transferFrom(Container container);
}
