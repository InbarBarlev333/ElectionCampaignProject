package Notification;

    public class Observable {
    private boolean changed;
    private java.util.Vector<java.util.Observer> obs;

    public Observable() { /* compiled code */ }

    public synchronized void addObserver(java.util.Observer observer) { /* compiled code */ }

    public synchronized void deleteObserver(java.util.Observer observer) { /* compiled code */ }

    public void notifyObservers() { /* compiled code */ }

    public void notifyObservers(java.lang.Object o) { /* compiled code */ }

    public synchronized void deleteObservers() { /* compiled code */ }

    protected synchronized void setChanged() { /* compiled code */ }

    protected synchronized void clearChanged() { /* compiled code */ }

}
