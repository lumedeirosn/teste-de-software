package com.lumedeirosn;

public class Triangle {
    private int a;
    private int b; 
    private int c;
    private boolean existence;
    private boolean rectangularity;

    Triangle() {
        super();
    }

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle setA(int a) {
        this.a = a;
        return this;
    }

    public Triangle setB(int b) {
        this.b = b;
        return this;
    }

    public Triangle setC(int c) {
        this.c = c;
        return this;
    }

    /**
     * @apiNote It considers the conditions of existence present in the question.
     */
    boolean isTriangle() {
        if (a > 0 && a < 100000 && b > 0 && b < 100000 && c > 0 && c < 100000) {
            return a + b > c && a + c > b && b + c > a;
        } else {
            return false;
        }
    }

    boolean testRectangularity() {
        int hypo = a, ca1 = b, ca2 = c;
        if (b > a && b > c){
            hypo = b;
            ca1 = a;
        } else if (c > a) {
            hypo = c;
            ca2 = a;
        }
        return hypo*hypo == ca1*ca1 + ca2*ca2;
    }

    String categorizeTriangle() {
        this.rectangularity = testRectangularity();
        this.existence = isTriangle();

        if (existence) {
            StringBuilder category = new StringBuilder();
            if (a == b && a == c && b == c) {
                category.append("Valido-Equilatero");
            } else if (a == b || a == c || b == c) {
                category.append("Valido-Isoceles");
            } else {
                category.append("Valido-Escaleno");
            }
            category.append(String.format("\nRetangulo: %s", rectangularity ? "S" : "N"));
            return category.toString();
        } else {
            return new String("Invalido");
        }
    }
}
