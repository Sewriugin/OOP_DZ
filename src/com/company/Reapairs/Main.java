package com.company.Reapairs;
                            //ДЗ - Repair (ремонт)
public class Main {
    public static void main(String[] args) {
        Roof roof = new Roof(1);
        roof.repair();
        Door door = new Door(2);
        door.repair();
        Window window = new Window(3);
        window.repair();
    }
}
