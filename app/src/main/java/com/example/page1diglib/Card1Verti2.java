package com.example.page1diglib;

public class Card1Verti2 {
    String AText,neetText,lecText,vidText,queText;
    int lecimg,vidImg,queImg;

    public Card1Verti2(String AText, String neetText, String lecText, String vidText, String queText, int lecimg, int vidImg, int queImg) {
        this.AText = AText;
        this.neetText = neetText;
        this.lecText = lecText;
        this.vidText = vidText;
        this.queText = queText;
        this.lecimg = lecimg;
        this.vidImg = vidImg;
        this.queImg = queImg;
    }

    public String getAText() {
        return AText;
    }

    public String getNeetText() {
        return neetText;
    }

    public String getLecText() {
        return lecText;
    }

    public String getVidText() {
        return vidText;
    }

    public String getQueText() {
        return queText;
    }

    public int getLecimg() {
        return lecimg;
    }

    public int getVidImg() {
        return vidImg;
    }

    public int getQueImg() {
        return queImg;
    }
}
