package com.germeny.myapplication.auth.model;

public class SearchMainModel {
    private int image;
    private String name, email;

    public SearchMainModel(int image, String name, String email) {
        this.image = image;
        this.name = name;
        this.email = email;
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
