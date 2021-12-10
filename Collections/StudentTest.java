package Collections;

import org.junit.jupiter.api.*;

public class StudentTest {
    private Student my_test_student;

    @BeforeEach
    public void setUp() {
        my_test_student = new Student();
    }

    @AfterEach
    public void exit() {
        my_test_student = null;
    }

    @Test
    @DisplayName("Equals")
    public void testEquals() {
        Student new_student = new Student();
        Assertions.assertEquals(true, this.my_test_student.equals(new_student));
    }
}
