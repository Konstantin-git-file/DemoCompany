package com.example.democompany;

import com.example.democompany.employer.Employer;
import com.example.democompany.employer.Person;
import com.example.democompany.employer.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("CompanyComponent")
public class Company extends EntityManager<Person> {
//    @Value("THeSimpsons")
    private String name;

//    @Autowired
    private Employer<Role> director;

//    public Company() {
//        super(15, Employer.class);
//    }

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
