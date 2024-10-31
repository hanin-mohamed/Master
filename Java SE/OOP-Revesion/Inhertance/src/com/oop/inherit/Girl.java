package com.oop.inherit;

public class Girl extends Person{

    private String favShow;
    private String favColor;


    public Girl() {
    }

    public Girl(String favShow, String favColor) {
        this.favShow = favShow;
        this.favColor = favColor;
    }


    public String getFavShow() {
        return favShow;
    }

    public void setFavShow(String favShow) {
        this.favShow = favShow;
    }

    public String getFavColor() {
        return favColor;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    @Override
    public String sayHello() {
        return "Hello, I am a Girl";
    }

}
