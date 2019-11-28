package com.company;

public abstract class FlatFigure extends Figure {
    public abstract void flatten();
    //Figure draw = new Figure() {

    @Override
    public void draw() {
        System.out.println("draw");
    }
}

