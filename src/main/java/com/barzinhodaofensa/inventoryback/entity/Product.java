package com.barzinhodaofensa.inventoryback.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Product {

    @Id
    private String id;
    private String name;
    private int quantity;
    private String details;
    private long price;

}
