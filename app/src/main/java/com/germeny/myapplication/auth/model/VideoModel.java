package com.germeny.myapplication.auth.model;

public class VideoModel {
    private int video1, video2, video3;

    public VideoModel(int video1, int video2, int video3) {
        this.video1 = video1;
        this.video2 = video2;
        this.video3 = video3;
    }

    public int getVideo1() {
        return video1;
    }

    public int getVideo2() {
        return video2;
    }

    public int getVideo3() {
        return video3;
    }

    public void setVideo1(int name) {
        this.video1 = video1;
    }

    public void setVideo2(int name) {
        this.video2 = video2;
    }

    public void setVideo3(int name) {
        this.video3 = video3;
    }

}
