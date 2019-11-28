package com.company;

public abstract class DeciduousTree implements Tree {
    @Override
    public String toString() {
        return "DeciduousTree{}";
    }

    @Override
    public boolean hasLeaves() {
        return false;

    }
    public abstract boolean hasFruits();

}
