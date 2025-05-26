package steadfast.knight.taskmanager;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TaskManagerTest {

    @Test
    void testAddAndGetTasks() {
        TaskManager manager = new TaskManager();
        manager.addTask("Buy milk");
        manager.addTask("Read book");

        List<Task> tasks = manager.getTasks();
        assertEquals(2, tasks.size());
        assertEquals("Buy milk", tasks.get(0).getDescription());
    }

    @Test
    void testMarkTaskCompleted() {
        TaskManager manager = new TaskManager();
        manager.addTask("Clean room");
        manager.markTaskCompleted(0);
        assertTrue(manager.getTasks().get(0).isCompleted());
    }

    @Test
    void testDeleteTask() {
        TaskManager manager = new TaskManager();
        manager.addTask("Do homework");
        manager.deleteTask(0);
        assertEquals(0, manager.getTasks().size());
    }
}
