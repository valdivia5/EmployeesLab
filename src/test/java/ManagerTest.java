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
    @Test
    public void canGetNInumber(){
        assertEquals("CS304846", manager.getNInumber());
    }
    @Test
    public void canGetSalary(){
        assertEquals(150, manager.getSalary());
    }
    @Test
    public void canGetDeptName(){
        assertEquals("Concha Tester", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(50);
        assertEquals(200, manager.getSalary());
    }


}
