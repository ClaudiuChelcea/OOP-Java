package SingletonPattern.people;

import SingletonPattern.database.Database;

import java.util.List;

public class Teacher {
    private String firstName;
    private String lastName;
    private List < String > subjects;

    public Teacher(String firstName, String lastName, List < String > subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    public Teacher(Teacher other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.subjects = other.subjects;
    }

    @Override
    public String toString() {
        return "Teacher: " + firstName + " " + lastName + "\n" +
                "Subjects: " + subjects + "\n";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List < String > getSubjects() {
        return subjects;
    }

    public void setSubjects(List < String > subjects) {
        this.subjects = subjects;
    }

    /* Return all teachers */
    public List < Teacher > getAllTeachers() {
        return Database.getDatabase().findAllTeachers();
    }

    /* Return all teachers that teach a certain subject */
    public List < Teacher > getTeachersBySubject(String subject) {
        return Database.getDatabase().findTeachersBySubject(subject);
    }

    /* Return all students */
    public List < Student > getAllStudents() {
        return Database.getDatabase().findAllStudents();
    }

    /* Return all students that study a certain subject */
    public List < Student > getStudentsBySubject(String subject) {
        return Database.getDatabase().getStudentsBySubject(subject);
    }

    /* Return all students sorted by their average grade */
    public List < Student > getStudentsByAverageGrade() {
        return Database.getDatabase().getStudentsByAverageGrade();
    }

    /* Return all students in a subject sorted by their grade on that subject */
    public List < Student > getStudentsByGradeForSubject(String subject) {
        return Database.getDatabase().getStudentsByGradeForSubject(subject);
    }
}
