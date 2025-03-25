package com.inuaMkulima.inuaMkulima.entity;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String productName;
    public String productType;

    public Products() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Products(String productName, String productType) {
        this.productName = productName;
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                '}';
    }
}
