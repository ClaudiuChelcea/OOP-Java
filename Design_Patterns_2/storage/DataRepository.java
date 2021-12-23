package Design_Patterns_2.storage;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Persists sensor data. Observable, its observers are notified when data is added it to.
 */
public class DataRepository extends Observable {

    List<Aggregator> aggregators = new ArrayList<>();
    List<ConsoleLogger> consoleLoggers = new ArrayList<>();
    List<ServerCommunicationController> serverCommunicationControllers = new ArrayList<>();
    List<SensorData> sensorData = new ArrayList<>();

    public void addData(SensorData dataRecord) {
        sensorData.add(dataRecord);
        for(var el : aggregators) {
            el.update(this);
        }
        for(var el : consoleLoggers) {
            el.update(this);
        }
        for(var el : serverCommunicationControllers) {
            el.update(this);
        }
    }

    public void addObserverAggregator(Aggregator obj) {
        aggregators.add(obj);
    }

    public void addObserverConsoleLogger(ConsoleLogger obj) {
        consoleLoggers.add(obj);
    }

    public void addObserverServerCommunicationController(ServerCommunicationController obj) {
        serverCommunicationControllers.add(obj);
    }

    public List<SensorData> getStoredData() {
        return sensorData;
    }
}


