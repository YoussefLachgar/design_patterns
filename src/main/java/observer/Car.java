package observer;

import java.util.ArrayList;
import java.util.List;

public class Car implements Subject {
    private String name;
    private String availablity;

    private List<Observer> observerList;
    public Car(String name){
        this.name = name;
        this.observerList = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer: observerList) {
            observer.update(availablity);
        }
    }

    public void setAvailablity(boolean available){
        availablity = this.name + (available ? " Available" : " Not available");
        notifyAllObservers();
    }
}
