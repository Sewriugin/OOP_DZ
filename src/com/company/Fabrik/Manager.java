package com.company.Fabrik;

public class Manager extends Staff{
    String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void hire() {
        System.out.println("Сотрудник + name + нанят/уволен");
    }

    @Override
    public void fire() {
        System.out.println("Сотрудник + name + нанят/уволен");
    }
}
