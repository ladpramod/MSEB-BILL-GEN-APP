package com.mseb.bill.management.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "userdata")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @MongoId
    private String userId;
    private String name;
    private String address;
    private String city;
    private String state;
    private String mobile;
    private String email;
    private String password;
    private String username;
}
