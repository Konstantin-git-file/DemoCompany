package com.example.democompany.employer;


public class Manager extends Employer <Role> {

    private String language;

    public Manager(String name, int age) {
        super(name, age, Role.Manager);
        this.language = language;
    }

    @Override
    public void work(){
        writeCode();
    }

    private void writeCode() {
        System.out.println(this.getName() + " is doing manager job");
    }
}
