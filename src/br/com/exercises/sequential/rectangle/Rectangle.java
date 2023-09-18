package br.com.exercises.sequential.rectangle;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Rectangle {
    private double rectangleBase;
    private double rectangleHeight;

    public Rectangle(double rectangleBase, double rectangleHeight) {
        this.rectangleBase = rectangleBase;
        this.rectangleHeight = rectangleHeight;
    }

    public double getRectangleBase() {
        return rectangleBase;
    }

    public void setRectangleBase(double rectangleBase) {
        this.rectangleBase = rectangleBase;
    }

    public double getRectangleHeight() {
        return rectangleHeight;
    }

    public void setRectangleHeight(double rectangleHeight) {
        this.rectangleHeight = rectangleHeight;
    }

    public double areaRectangleResult() {
        return this.rectangleBase * this.rectangleHeight;
    }

    public double perimeterRectangleResult() {
        double perimeter = 2 * (this.rectangleBase + this.rectangleHeight);
        return perimeter;
    }

    public double diagonalRectangleResult() {
        double diagonal = sqrt((pow(this.rectangleBase, 2) + pow(this.rectangleHeight, 2)));
        return diagonal;
    }

    @Override
    public String toString() {
        return "Rectangle area = " + areaRectangleResult() + "\n" +
                "Rectangle perimeter = " + perimeterRectangleResult() + "\n" +
                "Rectangle diagonal = " + diagonalRectangleResult();
    }
}
