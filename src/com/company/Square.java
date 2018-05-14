package com.company;

import java.util.Scanner;

class Square extends Shapes {
    private int side;

    void getParameter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set square side length");
        side = scanner.nextInt();
    }

    void getArea() {
        System.out.println("Square area is: " + (side * side));
    }

    void getPerimeter() {
        System.out.println("Square perimeter is: " + (4 * side));
    }
}
