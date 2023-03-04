package com.credibanco.assessment.card.service;

import com.credibanco.assessment.card.dto.CardDTO;

import java.util.List;

public interface CardService {
    CardDTO enrollCard(CardDTO cardDTO);
    CardDTO findCardByPAN(CardDTO cardDTO);
    List<CardDTO> getCards();
    CardDTO saveCard(CardDTO cardDTO);
    CardDTO deleteCard(CardDTO cardDTO);
    CardDTO createTransaction(CardDTO cardDTO);
    CardDTO voidTransaction(CardDTO cardDTO);
}
