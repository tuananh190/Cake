package com.banchahanoi.banh_cha_web.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cake") // tên bảng DB
public class Cake {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id tự tăng
    private Long id;

    private String cakeType;  // loại bánh
    private double price;
    private String filling;   // nhân bánh

    public Cake() {
    }

    public Cake(Long id, String cakeType, double price, String filling) {
        this.id = id;
        this.cakeType = cakeType;
        this.price = price;
        this.filling = filling;
    }

    // getters & setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCakeType() {
        return cakeType;
    }

    public void setCakeType(String cakeType) {
        this.cakeType = cakeType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }
}
