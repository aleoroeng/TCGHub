package com.micro.tcghub.service;

import com.micro.tcghub.model.Card;

import java.util.List;

public interface CardService {
    List<Card> getAllCards();
    Card addCard(Card card);
}
