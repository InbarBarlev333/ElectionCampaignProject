package Notification;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NotificationConsoleReversePrinter implements NotificationObserver, NoticicationPrinter{

    @Override
    public void update(Object arg){
        @SuppressWarnings("unchecked")
        List<String> notifications = (List<String>) arg;
        printAll(notifications);
    }

    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public void printAll(List<String> notifications){
        System.out.println("Print reversal insertion order:");
        ArrayList<String> notificationsRevList = new ArrayList<String>(notifications);
        Collections.reverse(notificationsRevList);
        for(String notification : notificationsRevList){
            System.out.println(notification);
        }
    }
}
