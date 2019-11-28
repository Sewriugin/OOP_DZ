package com.company;

public class Player implements Goalkeeper, Defender, Midfielder, Forward{

    @Override
    public void scoreRarely() {

    }

    @Override
    public void scoreVeryRarely() {
        System.out.println("Забиваю очень редко");
    }

    @Override
    public void scoreOften() {

    }
}
