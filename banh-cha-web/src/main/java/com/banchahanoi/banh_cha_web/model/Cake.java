package com.banchahanoi.banh_cha_web.model;

public class Cake {
    private int id;
    private String CakeType;  // loại bánh
    private double price;
    private String fillting;  // nhân bánh

    public Cake(int id ,  String CakeType , double price , String fillting ){
        this.CakeType=CakeType;
        this.id=id;
        this.price=price;
        this.fillting=fillting;
    }

    public int getId() {
        return id;
    }

    public String getCakeType() {
        return CakeType;
    }

    public String getFillting() {
        return fillting;
    }

    public double getPrice() {
        return price;
    }
}



