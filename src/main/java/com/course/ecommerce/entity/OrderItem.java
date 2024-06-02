package com.course.ecommerce.entity;

public class OrderItem {
    private Integer quantity;
    private Double price;


    public Double subTotal(){
        return this.price * this.quantity;
    }
}
