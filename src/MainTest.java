import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void PersonCheck() {
        Person testPersons = new Person("Gunnar", "Bakkal Harun Catli Akkurt Bahadir Erdal Bilgin", 11);
        assertEquals(new PersonComparator(10).compare(testPersons, testPersons), 0);
        assertEquals(new PersonComparator(2).compare(testPersons, testPersons), 0);
    }
}