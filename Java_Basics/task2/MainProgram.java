package Java_Basics.task2;

public class MainProgram {
    public static void main(String[] args) {
        Course curs = new Course();
        Student[] studentArray = new Student[]{new Student("Alex", 1),
                new Student("Maria", 3),
                new Student("George", 2),
                new Student("Claudiu", 2)};

        curs.setStudent_array(studentArray);

        for (Student my_student : curs.filterYear(2))
        {
            if(my_student != null)
                System.out.println(my_student);
        }

        /* Task 3 */
        Student student1 = new Student("Alex",3);
        Student student2 = new Student("Alex", 3);
        System.out.println(student1.equals(student2));
    }
}
