/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier Sahil Shingala
 * @student_number 991758927
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        Random rand = new Random(); // Initialize Random object
        Card[] magicHand = new Card[7];
        
        // Fill the magic hand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); // Set value to a random number between 1 and 13
            c.setSuit(Card.SUITS[rand.nextInt(4)]); // Set suit to a random suit from SUITS array
            magicHand[i] = c;
            System.out.println(magicHand[i]);
        }
        
        // Ask the user for card value and suit
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int userValue = input.nextInt();
        System.out.print("Enter a suit (0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int userSuitIndex = input.nextInt();
        
        // Create the user's card from their input
        Card playersCard = new Card();
        playersCard.setValue(userValue);
        playersCard.setSuit(Card.SUITS[userSuitIndex]);
        
        // Search magicHand for the user's card
        boolean found = false;
        for (Card c : magicHand) {
            if (c.getValue() == playersCard.getValue() && c.getSuit().equals(playersCard.getSuit())) {
                found = true;
                break;
            }
        }
        
        // Report the result
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
        
        // Add one luck card (hardcoded 2 of Clubs)

    }
}
