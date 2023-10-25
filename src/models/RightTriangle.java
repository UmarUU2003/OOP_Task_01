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
    public static double area(int firstLegLength, int secondLegLength){
        return (double) (firstLegLength * secondLegLength) / 2;
    }
    public static double area(long firstLegLength, long secondLegLength){
        return (double) (firstLegLength * secondLegLength) / 2;
    }

    public static double area(float firstLegLength, float secondLegLength){
        return firstLegLength * secondLegLength / 2;
    }
    public static double area(double firstLegLength, double secondLegLength){
        return firstLegLength * secondLegLength / 2;
    }
    public static double perimeter(int firstLegLength, int secondLegLength){
        double hypotenuseLength = Math.sqrt(Math.pow(firstLegLength, 2) + Math.pow(secondLegLength, 2));
        return firstLegLength + secondLegLength + hypotenuseLength;
    }
    public static double perimeter(long firstLegLength, long secondLegLength){
        double hypotenuseLength = Math.sqrt(Math.pow(firstLegLength, 2) + Math.pow(secondLegLength, 2));
        return firstLegLength + secondLegLength + hypotenuseLength;
    }
    public static double perimeter(float firstLegLength, float secondLegLength){
        double hypotenuseLength = Math.sqrt(Math.pow(firstLegLength, 2) + Math.pow(secondLegLength, 2));
        return firstLegLength + secondLegLength + hypotenuseLength;
    }

    public static double perimeter(double firstLegLength, double secondLegLength){
        double hypotenuseLength = Math.sqrt(Math.pow(firstLegLength, 2) + Math.pow(secondLegLength, 2));
        return firstLegLength + secondLegLength + hypotenuseLength;
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
