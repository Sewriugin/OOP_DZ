package com.company;

public interface Midfielder {
    default void scoreOften() {
        System.out.println("Забиваю часто");
    }
}
