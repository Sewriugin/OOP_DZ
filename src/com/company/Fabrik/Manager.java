package com.company.Fabrik;

public class Manager extends Staff{
    String name;

    public Manager(String name) {
        this.name = name;
    }

    // TODO поле name не должно быть внутри ковычек, иначе оно будет воспринято не как переменная а как обычный текст
    /*@Override
        public void hire() {
            System.out.println("Сотрудник + name + нанят/уволен");
    }*/

    // TODO Должно быть так
    @Override
    public void hire() {
        System.out.println("Сотрудник " + name + " нанят/уволен");
    }

    // TODO Здесь тоже поправить
    @Override
    public void fire() {
        System.out.println("Сотрудник + name + нанят/уволен");
    }
}
