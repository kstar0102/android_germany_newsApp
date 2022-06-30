package com.germeny.myapplication.auth.model;

public class HomeModel {
    private int image;
    private String name, time, des;

    public HomeModel(int image, String name, String time, String des) {
        this.image = image;
        this.name = name;
        this.time = time;
        this.des = des;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int name) {
        this.image = name;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public String getDes() {
        return des;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
