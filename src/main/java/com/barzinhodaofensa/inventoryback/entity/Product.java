package com.barzinhodaofensa.inventoryback.entity;

import lombok.Data;

@Data
public class Product {

    private String id;
    private String name;
    private int quantity;
    private String details;
    private long price;

}
