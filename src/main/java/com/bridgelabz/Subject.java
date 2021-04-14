package com.bridgelabz;

//This is observable class

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public void register(Observer observer){
       observers.add(observer);

    }

    public void update(Data data){
        for(Observer observer : observers){
            Observer.onUpdate(data);
        }

    }
}
