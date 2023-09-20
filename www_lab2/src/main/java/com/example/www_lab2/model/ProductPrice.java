package com.example.www_lab2.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "product_price")
public class ProductPrice {
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product productId;
    @Id
    @Column(name = "pice_date_time")
    private Date priceDateTime;
    private String note;
    private double price;

    public ProductPrice(Product productId, Date priceDateTime, String note, double price) {
        this.productId = productId;
        this.priceDateTime = priceDateTime;
        this.note = note;
        this.price = price;
    }

    public ProductPrice() {
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Date getPriceDateTime() {
        return priceDateTime;
    }

    public void setPriceDateTime(Date priceDateTime) {
        this.priceDateTime = priceDateTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductPrice{" +
                "productId=" + productId +
                ", priceDateTime=" + priceDateTime +
                ", note='" + note + '\'' +
                ", price=" + price +
                '}';
    }
}
