package lab1.task2;

import javax.naming.Name;

public class Student {
    private String name;
    private Integer year;

    /* Constructor & default constructor*/

    Student()
    {
        this.name = "";
        this.year = 0;
    }

    Student(String name, Integer year)
    {
        this.name = name;
        this.year = year;
    }

    /* Getters and setters */

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public Integer getYear()
    {
        return this.year;
    }

    @Override
    public String toString() {
        return "Student " + this.name + " in year " + this.year.toString() + "!";
    }
}
