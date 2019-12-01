package com.company.Fabrik;

public class Main {
    public static void main(String[] args) {
        // TODO так как в классе Factory создан конструктор public Factory(Machine machine, Worker[] workers, Manager manager)
        // TODO мы уже не можем использовать default (пустой) конструктор, если только сами его не создадим руками
        //Factory factory = new Factory();
        // TODO поэтому передаем 3 параметра как от нас и требуется
        // TODO пока что передал null значения, как заглушки, но вместо null нужно создать необходимые параметры и передавать их
        Factory factory = new Factory(null, null, null);
        //factory.machine();
        System.out.println(factory.machine);
    }

}
