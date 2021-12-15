package com.example.gmail;

public class ItemModel {
    private String gmail;
    private String info;



    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public ItemModel(String gmail, String info) {
        this.gmail = gmail;
        this.info = info;
    }
}
