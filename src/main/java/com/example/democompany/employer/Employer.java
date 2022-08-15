package com.example.democompany.employer;

public abstract class Employer<T> implements Person {
    private String name;
    private int age;
    private T role;

    public Employer(String name, int age, T role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return this.name;
    }

    public T getRole () {
        return role;
    }
}

