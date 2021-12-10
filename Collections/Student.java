package Collections;

public class Student implements Comparable<Student> {
    private String name = "";
    private String surname = "";
    private long id = 0;
    private double averageGrade = 0f;

    public Student() {
    }

    public Student(String name, String surname, long id, double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public int compareTo(Student o) {
        if(this.averageGrade > o.averageGrade)
            return 1;
        else if(this.averageGrade < o.averageGrade)
            return -1;
        else if(this.surname.compareTo(o.surname) > 0)
            return 1;
        else if(this.surname.compareTo(o.surname) < 0)
            return -1;
        else if(this.name.compareTo(o.name) > 0)
            return 1;
        else if(this.name.compareTo(o.name) < 0)
            return -1;
        else return 1;
    }

    private int get_Hashcode() {
        int hash = 7;
        hash = 31 * hash + (int) id;
        hash = 31 * hash + (name == null ? 0 : name.hashCode());
        hash = 31 * hash + (surname == null ? 0 : surname.hashCode());
        return hash;
    }

    @Override
    public int hashCode() {
        return get_Hashcode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.name == ((Student)obj).name && this.surname == ((Student)obj).name && this.averageGrade == ((Student)obj).averageGrade && this.id == ((Student)obj).id;    }

    @Override
    public String toString() {
        return "Student " + this.surname + " " + this.name + " with id " + this.id + " has an average grade of " + this.averageGrade +"!";
    }
}

