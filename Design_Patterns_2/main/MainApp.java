package Design_Patterns_2.main;

import Design_Patterns_2.dataprocessing.SpecialisedStepCountStrategyFactory;
import Design_Patterns_2.storage.*;

import java.util.Locale;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Choose a strategy: type 'basic' or 'filtered'");
        Scanner scanner = new Scanner(System.in);
        String strategyType = scanner.next().toLowerCase(Locale.ROOT).trim().toString();
        scanner.close();

        var mystrategy = Aggregator.strategies.BasicStepCountStrategy;
        if(strategyType.equals("filtered")) {
            mystrategy = Aggregator.strategies.FilteredStepCountStrategy;
        } else {
            System.out.println("!!!!------------!!!! " + strategyType + " !!!!------------!!!!");
        }

        DataRepository dataRepository = new DataRepository();
        // use the StepCountStrategyFactory to create a strategy
        SpecialisedStepCountStrategyFactory stepCountStrategyFactory = new SpecialisedStepCountStrategyFactory();

        // add observers to the dataRepository
        dataRepository.addObserverAggregator(new Aggregator(mystrategy));
        dataRepository.addObserverConsoleLogger(new ConsoleLogger());
        dataRepository.addObserverServerCommunicationController(new ServerCommunicationController());

        long baseTimestamp = System.currentTimeMillis();

        /* In implementarea mea, o sa adun pasii, ca nu sunt sigur daca trebuie sa ii adun sau sa ii inlocuiesc  ¯\_(ツ)_/¯ */
        dataRepository.addData(new SensorData(10, baseTimestamp + 1));
        System.out.println();

        dataRepository.addData(new SensorData(20, baseTimestamp + 2));
        System.out.println();

        dataRepository.addData(new SensorData(30, baseTimestamp + 3));
        System.out.println();

        dataRepository.addData(new SensorData(4000, baseTimestamp + 4));
        System.out.println();

        dataRepository.addData(new SensorData(50, baseTimestamp + 5));
        System.out.println();

        dataRepository.addData(new SensorData(-100, baseTimestamp + 6));
        System.out.println();

        dataRepository.addData(new SensorData(500, baseTimestamp + 600));
        System.out.println();
    }
}
