package com.germeny.myapplication.auth.model;

public class ChatHeaderModel {
    private int image;
    private String title;
    public ChatHeaderModel(int image, String title) {
        this.image = image;
        this.title = title;
    }
    public int getImage() {
        return image;
    }

    public String getTitle(){
        return title;
    }

    public void setImage(int name) {
        this.image = name;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
