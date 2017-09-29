package com.company;

public class Main {
Card card;

// Her definerer jeg forskellige card types som static, da det ellers ikke virker.

static Card highCard = Card.ACE;
static Card faceCard = Card.JACK;
static Card card1 = Card.DEUCE;
static Card card2 = Card.SEVEN;

// Igen definerer jeg de to values for de to kort som static, da programmet ellers ikke vil køre.
    // Værdierne kan ændres som det passer brugeren, men card1 og card2 skal da ændres ligeså.
static int card1Val = 2;
static int card2Val = 7;

//Constructor
public Main(Card card) {
    this.card = card;
}

    public static void main(String[] args) {
       //En hånd der giver blackjack
        System.out.println("A blackjack hand: " + highCard + " and " + faceCard);
        //En hånd med to kort, her DEUCE og SEVEN
        System.out.println("A two card hand: " + card1 + " and " + card2);
        // Sammenlagt værdi af 2+7
        System.out.println("Hand Value: " + (card1Val+card2Val));
    }
}
