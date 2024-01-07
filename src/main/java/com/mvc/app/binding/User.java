package com.mvc.app.binding;

import lombok.Data;

@Data
public class User {
    private Integer userId;
    private String name;
    private String email;
    private Long phone;
}
