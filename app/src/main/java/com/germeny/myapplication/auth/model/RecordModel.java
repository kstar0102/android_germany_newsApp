package com.germeny.myapplication.auth.model;

public class RecordModel  {
    private String name, des;

    public RecordModel(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public String getDes() {
        return des;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDes(String des) {
        this.des = des;
    }
}

