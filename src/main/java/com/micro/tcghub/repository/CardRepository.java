package com.micro.tcghub.repository;
import com.micro.tcghub.enums.Rarity;
import com.micro.tcghub.model.Card;

import java.util.Set;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends PagingAndSortingRepository<Card, Long> {
	Set<Card> findBySet(String set);
	Set<Card> findByCardText(String cardText);
	Set<Card> findByRarity(Rarity rarity);
}
