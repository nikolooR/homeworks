package io.codelex.oop.shapes;

abstract class Shape {
    private int numSides;

    public Shape(int numSides){
        this.numSides = numSides;
    }

    public int getNumSides(){
        return numSides;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}
