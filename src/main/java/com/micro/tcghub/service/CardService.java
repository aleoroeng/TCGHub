package com.micro.tcghub.service;

import com.micro.tcghub.model.Card;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CardService {
    Page<Card> getAllCards(Pageable pageable);
    Card addCard(Card card);
}
