package lab1.task2;

import java.sql.Array;

public class Course {
    // cu proprietățile: title (String), description (String), students (array de clase Student - exemplu arrays).
    // cu metoda: filterYear care întoarce o listă de studenți care sunt într-un an dat ca parametru.
    private String title;
    private String description;
    private Student[] student_array;

    /* Constructor */
    Course()
    {
        this.title = "";
        this.description = "";
        this.student_array = new Student[20];
    }

    /* Getters & Setters */

    public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setStudent_array(Student[] student_array)
    {
        int count = 0;
        for(Student my_student : student_array)
        {
            this.student_array[count] = student_array[count];
            count++;
        }
    }

    public Student[] getStudent_Array()
    {
        return this.student_array;
    }

    /* Methods */

    /**
     * Return the number of students in a certain year
     * @param an the year for the students we want to return
     * @return an array with the students
     */
    public Student[] filterYear(int an)
    {
        Student[] new_Student_Array = new Student[100];
        int count = 0;

        while(this.student_array[count] != null)
        {
            if(student_array[count].getYear() == an)
            {
                new_Student_Array[count] = student_array[count];
            }
            count++;
        }

        return new_Student_Array;
    }
}
