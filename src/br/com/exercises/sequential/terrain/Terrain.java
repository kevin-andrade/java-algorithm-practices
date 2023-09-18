package br.com.exercises.sequential.terrain;

public class Terrain {
    private double landWidth;
    private double landLength;
    private double squareMeterValue;

    public Terrain(double landWidth, double landLength, double squareMeterValue) {
        this.landWidth = landWidth;
        this.landLength = landLength;
        this.squareMeterValue = squareMeterValue;
    }

    public double getLandWidth() {
        return landWidth;
    }

    public double getLandLength() {
        return landLength;
    }

    public double getSquareMeterValue() {
        return squareMeterValue;
    }

    public void setSquareMeterValue(double squareMeterValue) {
        this.squareMeterValue = squareMeterValue;
    }

    public double areaLandResult() {
        return this.landWidth * this.landLength;
    }

    public double priceLand() {
        return areaLandResult() * this.squareMeterValue;
    }

    @Override
    public String toString() {
        return "Land area = " + areaLandResult() + "\n" +
                "Approximate appraised price of the land = " + priceLand();
    }

}
