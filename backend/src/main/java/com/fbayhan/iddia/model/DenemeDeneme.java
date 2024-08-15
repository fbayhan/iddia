package com.fbayhan.iddia.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tahsin")
public class DenemeDeneme {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}
