package com.mseb.bill.management.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer userId;
    private String name;
    private String address;
    private String city;
    private String state;
    private String mobile;
    private String email;
    private String password;
    private String username;
}
