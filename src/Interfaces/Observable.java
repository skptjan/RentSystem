package Interfaces;

public interface Observable {
    public void add(Observer o);
    public void remove(Observer o);
    public void notifyObservers();
}
