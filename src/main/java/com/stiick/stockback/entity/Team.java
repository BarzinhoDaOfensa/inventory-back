package com.stiick.stockback.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

@Data
public class Team {

    @Id
    private String id;
    private String name;
    private List<String> users;
    private String admin;
    private Date createdAt;
    
}
