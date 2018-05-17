package com.company;

import java.util.Scanner;

class ChooseShape {

    void input() {
        boolean ifContinue = true;

        while (ifContinue) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose shape:\n1 for square\n2 for quadrilateral\n3 for circle\n4 for trapezoid\n5 for triangle" +
                    "\n0 for exit");
            int i = -1;
            try {
                i = scanner.nextInt();
            } catch (Exception ignored) {
            }

            Shapes shapes = null;
            switch (i) {
                case 0:
                    ifContinue = false;
                    break;
                case 1:
                    shapes = new Square();
                    break;
                case 2:
                    shapes = new Quadrilateral();
                    break;
                case 3:
                    shapes = new Circle();
                    break;
                case 4:
                    shapes = new Trapezoid();
                    break;
                case 5:
                    shapes = new Triangle();
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
            if (shapes != null) {
                shapes.getParameter();
                shapes.getArea();
                shapes.getPerimeter();
            }

        }
        System.out.println("Quantity of created objects: " + Shapes.getCounter());
    }
}
