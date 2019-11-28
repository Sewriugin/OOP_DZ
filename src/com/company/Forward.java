package com.company;

public interface Forward {
    default void scoreOften() {
        System.out.println("Забиваю часто");
    }
}
