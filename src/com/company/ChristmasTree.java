package com.company;

public class ChristmasTree extends ConioferTree {

    // TODO в данном случае переопределение излишее, так как вы все равно вызываете родительский метод
    // TODO это имело смысл если бы кроме вызова родительского метода вы бы еще какие-то действия делали
    @Override
    public String toString() {
        return "ChristmasTree{}";
    }

    // TODO если подчеркивает Зеленым значит ошибка в слове скорее всего, он орфографию тоже проверяет
    // TODO по логкие дерево в России растет
    @Override
    public boolean isGrowlnRussia() {
        return false;
    }
}
