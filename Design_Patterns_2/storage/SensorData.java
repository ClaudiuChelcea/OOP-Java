package Design_Patterns_2.storage;

/**
 * Represents the sensing data sent to the storage component
 */
public class SensorData {
    private int stepsCount;
    private long timestamp;

    @Override
    public String toString() {
        return String.format("stepsCount=%d, timestamp=%d", stepsCount, timestamp);
    }

    public SensorData(int stepsCount, long timestamp) {
        this.stepsCount = stepsCount;
        this.timestamp = timestamp;
    }

    SensorData return_this() {
        return this;
    }

    int return_step_count() {
        return this.stepsCount;
    }

    long return_timestamp() {
        return this.timestamp;
    }
}
