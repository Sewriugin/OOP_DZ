package com.company;

public interface Tree {
    public default boolean hasLeaves(){
        return true;
    }
}
