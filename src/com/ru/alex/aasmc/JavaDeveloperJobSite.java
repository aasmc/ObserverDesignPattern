package com.ru.alex.aasmc;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observable{
    List<String> vacancies = new ArrayList<>();
    List<Observer> observers = new ArrayList<>();

    public void addVacancy(String vacancy) {
        vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.handleEvent(vacancies));
    }
}
