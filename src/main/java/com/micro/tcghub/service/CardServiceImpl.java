package com.micro.tcghub.service;

import com.micro.tcghub.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.micro.tcghub.repository.CardRepository;

import java.util.List;

@Service
public class CardServiceImpl implements CardService{

    private final CardRepository cardRepository;

    @Autowired
    public CardServiceImpl(CardRepository cardRepository){
        this.cardRepository = cardRepository;
    }

    @Override
    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

    @Override
    public Card addCard(Card card) {
        return cardRepository.save(card);
    }
}
