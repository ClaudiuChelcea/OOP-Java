package Design_Patterns_2.dataprocessing;

public class SpecialisedStepCountStrategy implements StepCountStrategy {

    @Override
    public int getTotalSteps() {
        return 0;
    }

    @Override
    public String getStrategyDescription() {
        return null;
    }
}
