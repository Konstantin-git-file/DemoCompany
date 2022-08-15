package com.example.democompany.employer;

public class Worker1 extends Employer<Role> {
    public Worker1(String name, int age) {
        super(name, age, Role.Worker1);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " is doing job");

    }
}