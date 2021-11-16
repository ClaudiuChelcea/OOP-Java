package SingletonPattern.people;

import SingletonPattern.database.Database;

import java.util.*;

public class Student {
    private String firstName;
    private String lastName;
    private Map < String, Integer > subjects;

    public Student(String firstName, String lastName, Map < String, Integer > subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    public Student(Student other) {
        this.firstName = new String(other.firstName);
        this.lastName = new String(other.lastName);
        this.subjects = new HashMap<>(other.subjects);
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

    public Map < String, Integer > getSubjects() {
        return subjects;
    }

    public void setSubjects(HashMap < String, Integer > subjects) {
        this.subjects = new HashMap<String, Integer>(subjects);
    }

    /* Find the average of the student's grades */
    public double averageGrade() {
        double average = 0;
        int count_subjects = 0;
        for (var el : this.subjects.entrySet()) {
            average += el.getValue();
            count_subjects++;
        }

        return average / (double) count_subjects;
    }

    /* Return the grade for a subject */
    public int getGradeForSubject(String subject){
        return this.subjects.get(subject);
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
