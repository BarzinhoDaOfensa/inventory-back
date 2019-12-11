package com.stiick.stockback.entity;


import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Team {

    private String name;
    private List<User> users;
    private Date createdAt;
}
