import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Chacho Morales", "ACM1PT", 500);
    }

    @Test
    public void hasGotName(){
        assertEquals("Chacho Morales", developer.getName());
    }

    @Test
    public void hasGotNInumber(){
        assertEquals("ACM1PT", developer.getNInumber());
    }
    @Test
    public void canGetSalary(){
        assertEquals(500, developer.getSalary());
    }

}
