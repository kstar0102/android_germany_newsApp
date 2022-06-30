package com.germeny.myapplication.auth.model;

public class PhotoModel {
    private int photo1, photo2, photo3;

    public PhotoModel(int photo1, int photo2, int photo3) {
        this.photo1 = photo1;
        this.photo2 = photo2;
        this.photo3 = photo3;
    }

    public int getPhoto1() {
        return photo1;
    }

    public int getPhoto2() {
        return photo2;
    }

    public int getPhoto3() {
        return photo3;
    }

    public void setPhoto1(int name) {
        this.photo1 = photo1;
    }

    public void setPhoto2(int name) {
        this.photo2 = photo2;
    }

    public void setPhoto3(int name) {
        this.photo3 = photo2;
    }

}
