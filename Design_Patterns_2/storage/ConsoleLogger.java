package Design_Patterns_2.storage;

import java.util.Observable;
import java.util.Observer;

public class ConsoleLogger implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Console logger printing changes");
    }

    public void update(DataRepository observable) {
        var data = observable.getStoredData();
        if(data.size() <= 1) {
          var tmp = new SensorData(0, 0);
            System.out.println("Changed from: " + tmp + " to " + data.get(data.size() - 1));
        } else {
            System.out.println("Changed from: " + data.get(data.size() - 2) + " to " + data.get(data.size() - 1));
        }
    }
}
