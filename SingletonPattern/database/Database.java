package SingletonPattern.database;

import SingletonPattern.people.Student;
import SingletonPattern.people.Teacher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* Singleton pattern */
public class Database {
    private final List < Student > students = new ArrayList < > ();
    private final List < Teacher > teachers = new ArrayList < > ();
    public static Database instance;
    private static int nr_instances;

    static {
        nr_instances = 0;
        instance = null;
    }

    /* Constructor */
    private Database() {
        /* Can't create instance */
    }

    /* Return the instance of the singleton */
    public static Database getDatabase() {
        if (instance == null) {
            instance = new Database();
            nr_instances++;
        }

        return instance;
    }

    /* Get the number of instances: should be 0 or 1 */
    public static int getNumberOfInstances() {
        return nr_instances;
    }

    /* Add a teachers list to the current teachers list */
    public void addTeachers(List < Teacher > teachers) {
        this.teachers.addAll(teachers);
    }

    /* Add a students list to the current students list */
    public void addStudents(List < Student > students) {
        this.students.addAll(students);
    }

    /* Return all teachers that teach a cartain subject */
    public List < Teacher > findTeachersBySubject(String subject) {
        List < Teacher > wantedTeachers = new ArrayList < > () {};

        for (var element: teachers) {
            if (element.getSubjects().contains(subject))
                wantedTeachers.add(element);
        }
        return wantedTeachers;
    }

    /* Students list getter */
    public List < Student > findAllStudents() {
        return students;
    }

    /* Teachers list getter */
    public List < Teacher > findAllTeachers() {
        return teachers;
    }

    /* Return all the students with a certain subject */
    public List < Student > getStudentsBySubject(String subject) {
        List < Student > wantedStudents = new ArrayList < > ();

        for (var element: students) {
            if (element.getSubjects().containsKey(subject))
                wantedStudents.add(element);
        }

        return wantedStudents;
    }

    /* Return all students sorted by their average grade */
    public List < Student > getStudentsByAverageGrade() {
        List < Student > my_students = Database.getDatabase().findAllStudents();
        my_students.sort(new Comparator < Student > () {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)((o1.averageGrade() - o2.averageGrade()));
            }
        });

        return my_students;
    }

    /* Return all students in a subject sorted by their grade on that subject */
    public List < Student > getStudentsByGradeForSubject(String subject) {
        List < Student > my_list = new ArrayList < > ();

        for (var el: Database.getDatabase().findAllStudents()) {
            if (el.getSubjects().containsKey(subject))
                my_list.add(el);
        }

        my_list.sort(new Comparator < Student > () {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGradeForSubject(subject) - o2.getGradeForSubject(subject);
            }
        });

        return my_list;
    }
}
