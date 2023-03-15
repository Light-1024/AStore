package com.sjaiaa.astore.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


/**
 * @author sjaiaa
 * @date 2023/3/11 21:29
 * @discription
 */
@Entity
@Data
@Getter
@Setter
@Table(name="accounts")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private String power;
    private float money;
    private String name;
}
