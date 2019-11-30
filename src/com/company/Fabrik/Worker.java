package com.company.Fabrik;

public class Worker extends Staff{
    String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void hire() {
        System.out.println("Сотрудник + name + нанят/уволен");
    }

    @Override
    public void fire() {

    }
}
