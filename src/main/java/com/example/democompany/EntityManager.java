package com.example.democompany;

import com.example.democompany.employer.Employer;
import com.example.democompany.employer.Person;

import java.lang.reflect.Array;

public class EntityManager<T> {
    private T[] entities;
    int size;

    public EntityManager(int maxSize, Class<Person> clazz) {
        this.entities = (T[]) Array.newInstance(clazz, maxSize);
    }

    public void addEntity(T entity) {
        entities[size] = entity;
        size++;
    }

    public int getSize() {
        return size;
    }

    public T[] getEntities() {
        return entities;
    }
}
