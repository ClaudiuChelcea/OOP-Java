package Collections;

import java.util.*;

public class Main {

    /* Get a minimum number greater than 2 */
    private static int get_min_random_int(int min, int max) {
        int low = min - 1;
        while(low <= min) {
            low = new Random().nextInt(max);
        }

        return low;
    }

    public static void main(String[] args) {
        List<Student> my_student_list = new ArrayList<>();

        my_student_list.add(new Student("Claudiu", "Chelcea", 4, 10));
        my_student_list.add(new Student("Mara", "Mateescu", 3, 4));
        my_student_list.add(new Student("Stefan", "Talea", 5, 6.7));
        my_student_list.add(new Student("Ana", "Popa", 1, 5));
        my_student_list.add(new Student("Cristina", "Cariga", 2, 5));

        System.out.println("\nUnsorted:");
        for(var student : my_student_list) {
            System.out.println(student);
        }

        System.out.println("\nSorted:");
        Collections.sort(my_student_list);
        for(var student : my_student_list) {
            System.out.println(student);
        }

        System.out.println("\nSort descenting");
        Collections.sort(my_student_list, (student1, student2) -> { return (int)(student2.getAverageGrade() - student1.getAverageGrade()); });
        for(var student : my_student_list) {
            System.out.println(student);
        }

        System.out.println("\nUse priority queue");
        PriorityQueue<Student> my_queue = new PriorityQueue<>(Comparator.comparingLong(Student::getId));
        for(var el : my_student_list)
            my_queue. add(el);
        my_queue.forEach((x)-> System.out.println(x));

        /* HASHMAP */
        System.out.println("\nHashmap");
        HashMap<Student, LinkedList<String>> my_map = new HashMap();
        String[] materii = new String[]{"Mate1", "Mate2", "Mate3", "POO", "IOCLA", "PC", "SD", "PL", "EEA", "ELTH", "EGC", "SO", "USO", "FIZICA"};
        for(var el : my_student_list) {
            HashMap<String, Integer> materii_unice = new HashMap();
            int numar_materii = Main.get_min_random_int(2, materii.length);
            for(int i = 0; i < numar_materii;++i) {
                int index_materie =  Main.get_min_random_int(2, materii.length);
                materii_unice.put(materii[index_materie], i);
            }

            /* Get everything from the hashtable into a list */
            LinkedList<String> my_list = new LinkedList<>();
            for(Map.Entry<String, Integer> element : materii_unice.entrySet()) {
                my_list.add(element.getKey());
            }

            /* Add to the main hashtable */
            my_map.put(el, my_list);
        }

        /* Print everything */
        for(Map.Entry<Student,LinkedList<String>> element : my_map.entrySet()) {
            System.out.println(element.getKey());
            System.out.println("Materii:");
            for(var el : element.getValue()) {
                System.out.print(el + " ");
            }
            System.out.println("\n");
        }

        System.out.println("\nEvenClass");
        EvenClass myevenclass = new EvenClass();
        for(int i = 0; i < 10; ++i)
            myevenclass.add(i);
        Iterator<Integer> iterator = myevenclass.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nHashSet");
        EvenClassOnlyHashSet myhashset = new EvenClassOnlyHashSet();
        myhashset.addAll(myevenclass);
        var hashiterator = myhashset.iterator();
        while(hashiterator.hasNext()) {
            System.out.println(hashiterator.next());
        }

        System.out.println("\nTreeSet");
        EvenClassOnlyTreeSet mytreeset = new EvenClassOnlyTreeSet();
        mytreeset.addAll(myevenclass);
        for(var el : mytreeset)
            System.out.println(el);

        /*
         * Cel putin in cazul meu, ordinea de printare este aceeasi pentru toate cele 3 tipuri
         */

        /* EXERCITIU LAMBDACHECKER!!!!!!!!!!!!!!!!!!!!!!!!
        // TODO: citire de la tastatura
        Scanner input = new Scanner(System.in);

        int nr = input.nextInt();

        HashMap<Integer, Integer> my_new_map = new HashMap<>();
        for(int i = 0; i < nr; ++i) {
            int get_input = input.nextInt(); // 2
            int get_current_value = 0;
            if(my_new_map.get(get_input) == null) {}
            else get_current_value = my_new_map.get(get_input);
            ++get_current_value;
            my_new_map.put(get_input, get_current_value);
        }

        input.close();

        // TODO: afisare la consola
        for(Map.Entry start : my_new_map.entrySet()) {
            System.out.print(start.getKey() + ": " + start.getValue() + " ");
        }

        */
    }
}
