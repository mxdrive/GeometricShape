package com.company;

import java.util.Scanner;

class ChooseShape {

    void input() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose shape:\n1 for square\n2 for quadrilateral\n3 for circle\n4 for trapezoid\n5 for triangle" +
                    "\n0 for exit");
            int i = scanner.nextInt();
            if (i == 0) break;
            switch (i) {
                case 1:
                    Square square = new Square();
                    square.getParameter();
                    square.getArea();
                    square.getPerimeter();
                    break;
                case 2:
                    Quadrilateral quadrilateral = new Quadrilateral();
                    quadrilateral.getParameter();
                    quadrilateral.getArea();
                    quadrilateral.getPerimeter();
                    break;
                case 3:
                    Circle circle = new Circle();
                    circle.getParameter();
                    circle.getArea();
                    circle.getPerimeter();
                    break;
                case 4:
                    Trapezoid trapezoid = new Trapezoid();
                    trapezoid.getParameter();
                    trapezoid.getArea();
                    trapezoid.getPerimeter();
                    break;
                case 5:
                    Triangle triangle = new Triangle();
                    triangle.getParameter();
                    triangle.getArea();
                    triangle.getPerimeter();
                    break;
            }
        }
        System.out.println("Quantity of created objects: " + Shapes.getCounter());
    }
}
