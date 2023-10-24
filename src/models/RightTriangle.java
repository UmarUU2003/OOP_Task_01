package models;

public class RightTriangle {
    private double hypotenuseLength;
    private double firstLegLength;
    private double secondLegLength;

    public RightTriangle(double firstLegLength, double secondLegLength) {
        this.firstLegLength = firstLegLength;
        this.secondLegLength = secondLegLength;
        hypotenuseLength = Math.sqrt(Math.pow(firstLegLength, 2) + Math.pow(secondLegLength, 2));
    }

    public double getHypotenuseLength() {
        return hypotenuseLength;
    }

    public double getFirstLegLength() {
        return firstLegLength;
    }

    public double getSecondLegLength() {
        return secondLegLength;
    }
}
