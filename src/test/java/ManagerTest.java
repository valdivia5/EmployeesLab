import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager ("Jesucristo","CS304846", 150, "Concha Tester");
    }

    @Test
    public void canGetName(){
        assertEquals("Jesucristo", manager.getName());
    }

}
