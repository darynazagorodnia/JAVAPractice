package StackQueue;

import colectionClass.Card;
import colectionClass.CardComparator;

import java.util.*;

public class StackQueueLauncher {
    public static void main(String[] args) {

        //passengerProcession();

        Queue<Card> cardDeck = new PriorityQueue<>(52, new CardComparator());
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                cardDeck.offer(new Card(suit, face));
            }
        }

        Deque<Card> cards = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            cards.offerLast(cardDeck.poll());
        }

        //  for (int i = 0; i < 10; i++) {
        //    System.out.println(cards.removeFirst());
        //}

        Card card = new Card(Card.Suit.SPADES, Card.Face.Ten);
        cards.removeFirstOccurrence(card);
        cards.removeLastOccurrence(card);


    }


    private static void passengerProcession() {
        Stack<Passenger> bus = new Stack<>();
        Passenger passenger = new Passenger("Ivanova", "Katerina");
        bus.push(new Passenger("Vasko", "Alex"));
        bus.push(new Passenger("Mikhailov", "Viktor"));
        bus.push(new Passenger("Petrov", "Dmitrii"));
        bus.push(passenger);
        bus.push(new Passenger("Ivanov", "Ivan"));

        System.out.println("Passenger found at position " + bus.search(passenger));

        System.out.println("Last enter passenger " + bus.peek());
        while (!bus.empty()) {
            System.out.println("Passenger: " + bus.pop());
        }

    }

    private static class Passenger {

        private static int number;
        private String name;
        private String surname;

        public Passenger(String surname, String name) {
            this.surname = surname;
            this.name = name;
        }


        public int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public String toString() {
            return "Passenger is " + name + " " + surname;
        }
    }
}

