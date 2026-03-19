package colectionClass;

import java.util.*;

public class CollectionRunner {

    public static void main(String[] args) {
        List<Card> decOfCards = new ArrayList<>();
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                decOfCards.add(new Card(suit, face));
            }
        }

        Collections.shuffle(decOfCards);
        Collections.sort(decOfCards);


        Card card = new Card(Card.Suit.SPADES, Card.Face.Queen);
        int i = Collections.binarySearch(decOfCards, card);
        if (i >= 0) {
            System.out.println("Card was found at position " + i);
        } else {
            System.out.println("Card was not found");
        }

        List<Card> cardList = new ArrayList<>(decOfCards);
        Collections.fill(cardList, card);
        Collections.addAll(cardList, card, card, card);
        Collections.copy(cardList, decOfCards);
        int frequency = Collections.frequency(cardList, card);
        System.out.println("Frequency of " + card + " is " + frequency);

        System.out.println("Min: " + Collections.min(cardList));
        System.out.println("Max: " + Collections.max(cardList));

        //printOutPut(cardList);

        // System.out.println("\n\nCards after shuffle");
        // printOutPut(decOfCards);

        //System.out.println("Cards after sorting");
        //   printOutPut(decOfCards);

    }

    private static void printOutPut(List<Card> decOfCards) {
        for (int i = 0; i < decOfCards.size(); i++) {
            System.out.printf("%-20s %s", decOfCards.get(i), (i + 1) % 4 == 0 ? "\n" : " ");
        }
    }

}
