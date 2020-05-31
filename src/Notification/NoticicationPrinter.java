package Notification;

import java.util.List;

public interface NoticicationPrinter {

    public void update(Observable o, Object arg);

    public void printAll(List<String> notifications);

}