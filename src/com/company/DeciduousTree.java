package com.company;

public abstract class DeciduousTree implements Tree {
    @Override
    public String toString() {
        return "DeciduousTree{}";
    }

    // TODO как раз-таки лиственное дерево имеет листья поэтому метод hasLeaves должен возвращать true
    @Override
    public boolean hasLeaves() {
        return false;

    }

    public abstract boolean hasFruits();

}
