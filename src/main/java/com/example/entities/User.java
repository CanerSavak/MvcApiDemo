package com.example.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;
    @NotEmpty(message = "Isim bos bırakılamaz.")
    private String name;

    @Email
    @NotEmpty(message = "Email bos bırakılamaz.")
    private String email;
    @NotEmpty(message = "Telefon bos bırakılamaz.")
    private String telephone;
    @NotEmpty(message = "Konu bos bırakılamaz.")
    private String subject;
    @NotEmpty(message = "Icerik bos bırakılamaz.")
    private String idea;



}
