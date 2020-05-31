package Notification;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;

public class NotificationsManager extends Observable {

    private List<String> notificationHistory = new LinkedList<String>();

    private List<NotificationObserver> observers= new ArrayList<NotificationObserver>();

    public void addObserver(NoticicationConsolePrinter observer){
        this.observers.add(observer);
    }

    public void removeObserver(NotificationObserver observer){
        this.observers.remove(observer);
    }

    public void newNotification (String message){
        notificationHistory.add(message);
        for(NotificationObserver observer : observers)
            observer.update(message);
    }

}
