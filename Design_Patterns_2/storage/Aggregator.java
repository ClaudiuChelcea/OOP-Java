package Design_Patterns_2.storage;

import java.util.Observable;
import java.util.Observer;

public class Aggregator implements Observer {

    @Override
    public void update(Observable o, Object arg) {

    }

    public static enum strategies {
        BasicStepCountStrategy,
        FilteredStepCountStrategy
    }

    strategies my_strategy;

    public Aggregator(strategies my_strategy) {
        this.my_strategy = my_strategy;
    }

    boolean valid_steps(int steps, long time, long prev_time) {
        if(steps >= 1000 && (time - prev_time) > 60)
            return false;
        return true;
    }

    public void update(DataRepository o) {
        var data = o.getStoredData();
        int sum = 0;

        if (my_strategy == strategies.BasicStepCountStrategy) {
            for (var el : data) {
                sum += el.return_step_count();
            }
        } else {
            var prev = data.get(0);
            for (var el : data) {
                if (el.return_step_count() > 0 && valid_steps(el.return_step_count(), el.return_timestamp(), prev.return_timestamp()))
                    sum += el.return_step_count();
                prev = el;
            }
        }

        System.out.println("Total steps: " + sum + "!");
    }
}
