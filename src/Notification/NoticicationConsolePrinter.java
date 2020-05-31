package Notification;

import java.util.List;

public class NoticicationConsolePrinter implements NotificationObserver, NoticicationPrinter {

    @Override
    public void update(Object arg) {
        System.out.println(arg);

      /*@SuppressWarnings("unchecked")
       List<String> notifications =(List<String>) arg;
       printAll(notifications);*/
    }

    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public void printAll(List<String> notifications){
        System.out.println("Message Board:");
        for(String notification : notifications){
            System.out.println(notification);
        }

        System.out.println("");
    }


}
