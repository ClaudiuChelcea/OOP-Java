package Design_Patterns_2.dataprocessing;

public class SpecialisedStepCountStrategyFactory implements StepCountStrategyFactory {
    @Override
    public StepCountStrategy createStepCountStrategy() {
        return new SpecialisedStepCountStrategy();
    }
}
