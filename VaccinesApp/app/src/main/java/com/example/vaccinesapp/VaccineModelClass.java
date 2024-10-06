package com.example.vaccinesapp;

public class VaccineModelClass {

    private String title;
    private int image;

    public VaccineModelClass(String title, int image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }
}
