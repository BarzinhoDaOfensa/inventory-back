package com.stiick.stockback.entity;

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
    private String userOwned;
    private String teamOwned:

}
