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

    public double area(){
        return getFirstLegLength() * getSecondLegLength() / 2;
    }
    public double perimeter(){
        return getHypotenuseLength() + getFirstLegLength() + getSecondLegLength();
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

    public void setFirstLegLength(double firstLegLength) {
        this.firstLegLength = firstLegLength;
        hypotenuseLength = Math.sqrt(Math.pow(firstLegLength, 2) + Math.pow(secondLegLength, 2));
    }

    public void setSecondLegLength(double secondLegLength) {
        this.secondLegLength = secondLegLength;
        hypotenuseLength = Math.sqrt(Math.pow(firstLegLength, 2) + Math.pow(secondLegLength, 2));
    }
}
