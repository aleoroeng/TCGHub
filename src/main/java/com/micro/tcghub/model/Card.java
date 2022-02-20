package com.micro.tcghub.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;
    String name;
}
