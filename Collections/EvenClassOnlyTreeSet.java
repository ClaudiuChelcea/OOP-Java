package Collections;

import java.util.TreeSet;

public class EvenClassOnlyTreeSet extends TreeSet<Integer> {
    @Override
    public boolean add(Integer integer) {
        if(integer % 2 == 0)
            return super.add(integer);
        else
            return false;
    }
}
