package com.example.democompany.employer;

public class Worker2 extends Employer<Role>{
    public Worker2(String name, int age) {
        super(name, age, Role.Worker2);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " is doing job too");

    }
}
