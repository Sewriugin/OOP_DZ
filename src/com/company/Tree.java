package com.company;

public interface Tree {
    //TODO ключевое слово public здесь лишнее поэтому компилятор выделяет серым,
    //TODO так же не имеет смысла возвращать true. Потому что с точки зрения логики немного странно что любое
    //TODO дерево по умолчанию лиственное (имеет листья)
    public default boolean hasLeaves(){
        return true;
    }
}
