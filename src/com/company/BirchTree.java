package com.company;

public class BirchTree extends DeciduousTree {
    // TODO в данном случае переопределение излишее, так как вы все равно вызываете родительский метод
    // TODO это имело смысл если бы кроме вызова родительского метода вы бы еще какие-то действия делали
    @Override
    public boolean hasLeaves() {
        return super.hasLeaves();
    }

    @Override
    public String toString() {
        return "BirchTree{}";
    }

    @Override
    public boolean hasFruits() {
        return false;
    }
}
