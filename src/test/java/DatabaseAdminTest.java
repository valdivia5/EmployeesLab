import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;


import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest{

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin ("Chicho Morales", "CIS65653", 300);
    }

    @Test
    public void hasGotName(){
        assertEquals("Chicho Morales", databaseAdmin.getName());
    }

    @Test
    public void hasGotNINumber(){
        assertEquals("CIS65653", databaseAdmin.getNInumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(300, databaseAdmin.getSalary());
    }
}
