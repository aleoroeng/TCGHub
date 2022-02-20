package com.micro.tcghub.controller;

import com.micro.tcghub.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.micro.tcghub.service.CardService;

import java.util.List;

@RestController
public class CardController {

    private final CardService cardService;

    @Autowired
    public CardController(CardService cardService){
        this.cardService = cardService;
    }

    @GetMapping(path = "cards")
    public List<Card> getAllCards(){
        return cardService.getAllCards();
    }

    @PostMapping(path = "card")
    public Card addCard(@RequestBody Card card){
        return cardService.addCard(card);
    }
}
