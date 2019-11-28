package com.company;

public class Square extends FlatFigure {
    @Override
    public void draw() {
        System.out.println("draw");

    }

    @Override
    public void flatten() {
        System.out.println("flatten");
    }


}
