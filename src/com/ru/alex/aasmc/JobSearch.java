package com.ru.alex.aasmc;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstObserver = new Subscriber("Alex Alex");
        Observer secondObserver = new Subscriber("Peter Peter");

        jobSite.addObserver(firstObserver);
        jobSite.addObserver(secondObserver);

        jobSite.addVacancy("Third Java Position");

        jobSite.removeVacancy("First Java Position");
    }
}
