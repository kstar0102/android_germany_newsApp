package com.germeny.myapplication.auth.model;

public class UserPModel {
    private int caractorimage, markimage, bangimage, userproimage;
    private String name, email;

    public UserPModel(int caractorimage, int markimage, int bangimage, int userproimage, String name, String email) {
        this.caractorimage = caractorimage;
        this.markimage = markimage;
        this.bangimage = bangimage;
        this.userproimage = userproimage;
        this.name = name;
        this.email = email;
    }

    public int getCaractorimage() {
        return caractorimage;
    }

    public void setCaractorimage(int name) {
        this.caractorimage = caractorimage;
    }

    public int getMarkimage() {
        return markimage;
    }

    public void setMarkimage(int name) {
        this.markimage = markimage;
    }

    public int getBangimage() {
        return bangimage;
    }

    public void setBangimage(int name) {
        this.bangimage = bangimage;
    }

    public int getUserproimage() {
        return userproimage;
    }

    public void setUserproimage(int name) {
        this.userproimage = userproimage;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

