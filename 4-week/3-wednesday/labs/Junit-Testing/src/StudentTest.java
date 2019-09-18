import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public void getFullName() {
        Student student = new Student("Leslie", "Knope", 'A');
        String expected = "Leslie";
        String actual = student.getFullName();
        assertEquals(expected,actual);
    }

    @Test
    public void getGrade() {
        Student mike = new Student("Leslie", "Knope", 'C');
        char expected = 'C';
        char actual = mike.getGrade();
        assertEquals(expected,actual);
    }
}