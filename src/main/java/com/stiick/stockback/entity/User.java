package com.stiick.stockback.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private List<String> teams;
    
}
