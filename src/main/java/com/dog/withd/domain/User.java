package com.dog.withd.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Data
public class User {
    private int idx;
    private String email;
    private String name;
    private String tel;
    private String password;
    private Date reg_date;
    private Date update;
    private String auth;


}
