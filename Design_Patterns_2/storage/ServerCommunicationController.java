package Design_Patterns_2.storage;

import java.util.Observable;
import java.util.Observer;
import Design_Patterns_2.communication.*;

public class ServerCommunicationController implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Server changes");
    }

    static int counter = 0;

    public void update(DataRepository dataRepository) {
        var data = dataRepository.getStoredData();
        var last_obj = data.get(data.size() - 1);
        System.out.println(new ServerMessage(last_obj.return_step_count(), counter, last_obj.return_timestamp()));
        counter++;
    }
}
