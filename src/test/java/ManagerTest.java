import manager.Manager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    @Test
    public void addFilm() {
        Manager manager = new Manager();
        manager.addFilm("Фильм 1");
        String[] expected = {"Фильм 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {
        Manager manager = new Manager();
        manager.addFilm("Фильм 1");
        manager.addFilm("Фильм 2");
        manager.addFilm("Фильм 3");
        manager.addFilm("Фильм 4");
        manager.addFilm("Фильм 5");
        String[] expected = {"Фильм 1", "Фильм 2", "Фильм 3", "Фильм 4", "Фильм 5"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {
        Manager manager = new Manager(2);
        manager.addFilm("Фильм 1");
        manager.addFilm("Фильм 2");
        manager.addFilm("Фильм 3");
        manager.addFilm("Фильм 4");
        manager.addFilm("Фильм 5");
        String[] expected = {"Фильм 5", "Фильм 4"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
