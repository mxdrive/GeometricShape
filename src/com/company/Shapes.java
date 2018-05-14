package com.company;

abstract class Shapes {
    private static int counter;

    Shapes() {
        counter++;
    }

    static int getCounter() {
        return counter;
    }

    abstract void getParameter();

    abstract void getArea();

    abstract void getPerimeter();
}
