import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {


    @Test
    void employeeIDTest() {
        Employee werknemer1 = new Employee( 478, "Joost");
        assertFalse(werknemer1.getEmployeeID(7834));
        assertTrue(werknemer1.getEmployeeID(478));

    }

    @Test
    void employeeNameTest() {
        Employee werknemer1 = new Employee( 478, "Joost");
        assertFalse(werknemer1.getEmployeeName("Merel"));
        assertTrue(werknemer1.getEmployeeName("Joost"));
    }
}