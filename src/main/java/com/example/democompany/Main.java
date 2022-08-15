package com.example.democompany;

import com.example.democompany.employer.Manager;
import com.example.democompany.employer.Employer;
import com.example.democompany.employer.Worker1;
import com.example.democompany.employer.Worker2;

public class Main {
    public static void main(String[] args) {
        Employer member1 = new Worker1("Homer Simpsons", 39);
        Employer member2 = new Worker2("Marge Simpsons", 35);
        Employer member3 = new Manager("Bart Simpsons",10);

        Company company = new Company("The Simpsons", 5);
        company.addEntity(member1);
        company.addEntity(member2);
        company.addEntity(member3);
        company.startWork();

    }
}
