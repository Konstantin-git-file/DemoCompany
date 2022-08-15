package com.example.democompany;

import com.example.democompany.employer.Employer;
import com.example.democompany.employer.Person;

public class Company extends EntityManager<Person> {
    private String name;

    public Company(String companyName, int maxEmployerCount) {
        super(maxEmployerCount, Person.class);
        this.name = companyName;
    }

    public void startWork() {
        for (int i = 0; i < this.getSize(); i++) {
            Person[] persons = this.getEntities();
            Person person = persons[i];
            person.work();
        }
    }

    public String getName(){
        return name;
    }
}
