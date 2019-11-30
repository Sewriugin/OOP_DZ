package com.company;

public class Business implements Photostudio, KyeCutting {

    @Override
    public void getLicense() {
        System.out.println("Добавляю на Яндекс карты_1");
    }

    @Override
    public void makeSignboard() {
        System.out.println("Добавляю на Яндекс карты_2");
    }

    @Override
    public void findKeyMaster() {
        System.out.println("Добавляю на Яндекс карты_3");
    }

    public void addToYandexMap() {
        System.out.println("Photostudio");
    }
    public void KeyCutting() {
        System.out.println("KeyCutting");
    }
//
//    public Business() {
//    }
}