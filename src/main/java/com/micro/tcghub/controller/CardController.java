package com.micro.tcghub.controller;

import com.micro.tcghub.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.micro.tcghub.service.CardService;

@RestController
public class CardController {

    private final CardService cardService;

    @Autowired
    public CardController(CardService cardService){
        this.cardService = cardService;
    }

    @GetMapping(path = "cards")
    public Page<Card> getAllCards(	@RequestParam(name = "page", required = true) int page, 
    								@RequestParam(name = "size", required = true) int size){
        return cardService.getAllCards(PageRequest.of(page, size));
    }

    @PostMapping(path = "card")
    public Card addCard(@RequestBody Card card){
        return cardService.addCard(card);
    }
}
