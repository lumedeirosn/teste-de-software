package com.lumedeirosn;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class TriangleUnitTest {
    private Triangle triangle;

    @Before
    public void constructTriangle() {
        triangle = new Triangle();
    }
    

    @Test
    public void testcategorizeTriangleWithNegativeIntegers() {
        triangle.setA(-1).setB(1).setC(1);
        Assert.assertEquals("Invalido", triangle.categorizeTriangle());

        triangle.setA(1).setB(-1).setC(1);
        Assert.assertEquals("Invalido", triangle.categorizeTriangle());

        triangle.setA(1).setB(1).setC(-1);
        Assert.assertEquals("Invalido", triangle.categorizeTriangle());
    }

    @Test
    public void testcategorizeTriangleWithIntegersGreaterThan10Power5() {
        triangle.setA( (int)Math.pow(10, 5) ).setB(1).setC(1);
        Assert.assertEquals("Invalido", triangle.categorizeTriangle());

        triangle.setA(1).setB( (int)Math.pow(10, 5) ).setC(1);
        Assert.assertEquals("Invalido", triangle.categorizeTriangle());

        triangle.setA(1).setB(1).setC( (int)Math.pow(10, 5) );
        Assert.assertEquals("Invalido", triangle.categorizeTriangle());
    }

    @Test
    public void testCategorizeTriangleWithValidClassButNotBuildTriangle() {
        triangle.setA(1).setB(1).setC(2);
        Assert.assertEquals("Invalido", triangle.categorizeTriangle());
    }

    @Test
    public void testCategorizeValidClassThatBuildTriangle() {
        triangle.setA(3).setB(3).setC(3);
        Assert.assertEquals("Valido-Equilatero\nRetangulo: N", triangle.categorizeTriangle());

        triangle.setA(5).setB(5).setC(3);
        Assert.assertEquals("Valido-Isoceles\nRetangulo: N", triangle.categorizeTriangle());

        triangle.setA(2).setB(8).setC(9);
        Assert.assertEquals("Valido-Escaleno\nRetangulo: N", triangle.categorizeTriangle());

        triangle.setA(3).setB(5).setC(4);
        Assert.assertEquals("Valido-Escaleno\nRetangulo: S", triangle.categorizeTriangle());
    }
}
