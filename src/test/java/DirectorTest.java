import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director("Fauferrimo", "FAU01010101", 16000, "Garbage supervisor", 9000000);
    }

    @Test
    public void hasGotName() {
        assertEquals("Fauferrimo", director.getName());
    }

    @Test
    public void hasGotNINumber() {
        assertEquals("FAU01010101", director.getNInumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(16000, director.getSalary());
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Garbage supervisor", director.getDeptName());
    }

    @Test
    public void hasGotBudget() {
        assertEquals(9000000, director.getBudget());
    }
}
