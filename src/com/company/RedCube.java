package com.company;

public class RedCube extends ColorFigure {
    @Override
    public void paint() {
        System.out.println("paint");
    }

    @Override
    public void draw() {
        System.out.println("draw");
    }
}
