package com.example.www_lab2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product_image")
public class ProductImage {
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product productId;
    @JoinColumn(name = "image_id")
    private long imageId;
    private String alternative;
    private String path;

    public ProductImage(Product productId, long imageId, String alternative, String path) {
        this.productId = productId;
        this.imageId = imageId;
        this.alternative = alternative;
        this.path = path;
    }

    public ProductImage() {
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public long getImageId() {
        return imageId;
    }

    public void setImageId(long imageId) {
        this.imageId = imageId;
    }

    public String getAlternative() {
        return alternative;
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "ProductImage{" +
                "productId=" + productId +
                ", imageId=" + imageId +
                ", alternative='" + alternative + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
