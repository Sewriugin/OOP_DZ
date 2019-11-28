package com.company;

public interface Goalkeeper {
    public default void scoreVeryRarely(){
        System.out.println("Забиваю очень редко");
    }
}
