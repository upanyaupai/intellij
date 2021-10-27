package com.example;

public class Noodle1 {

    private double lengthInCentimeters;
    private double widthInCentimeters;
    private String shape;
    private String ingredients;
    private String texture = "brittle";

    Noodle1(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public boolean isTasty() {

        return true;

    }

    public static void main(String[] args) {

        Rameen yasaiRamen = new Rameen();
        //System.out.println(yasaiRamen.ingredients);
        System.out.println(yasaiRamen.isTasty());

    }

}