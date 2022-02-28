package com.micro.tcghub.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.micro.tcghub.enums.Rarity;

@Entity
@Data
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;
    
    String name;
    
    @Enumerated(EnumType.ORDINAL)
    Rarity rarity;
    
    String set;
    
    String cardText;
}
