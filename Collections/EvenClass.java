package Collections;

import java.util.LinkedHashSet;

public class EvenClass extends LinkedHashSet<Integer> {
    @Override
    public boolean add(Integer integer) {
        if(integer % 2 == 0)
            return super.add(integer);
        else
            return false;
    }
}
