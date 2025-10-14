import java.util.Random;

public class Card {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            Random rand = new Random();

            String suit = "";
            String rank = "";

            int placeholder = rand.nextInt(1, 14);

            if (placeholder == 1) {
                rank = "Ace";
            } else if (placeholder == 2) {
                rank = "Two";
            } else if (placeholder == 3) {
                rank = "Three";
            } else if (placeholder == 4) {
                rank = "Four";
            } else if (placeholder == 5) {
                rank = "Five";
            } else if (placeholder == 6) {
                rank = "Six";
            } else if (placeholder == 7) {
                rank = "Seven";
            } else if (placeholder == 8) {
                rank = "Eight";
            } else if (placeholder == 9) {
                rank = "Nine";
            } else if (placeholder == 10) {
                rank = "Ten";
            } else if (placeholder == 11) {
                rank = "Jack";
            } else if (placeholder == 12) {
                rank = "Queen";
            } else if (placeholder == 13) {
                rank = "King";
            }

            int placeholder2 = rand.nextInt(1, 5);

            if (placeholder2 == 1) {
                suit = "Spades";
            } else if (placeholder2 == 2) {
                suit = "Clubs";
            } else if (placeholder2 == 3) {
                suit = "Diamonds";
            } else if (placeholder2 == 4) {
                suit = "Hearts";
            }

            System.out.println(rank + " of " + suit);
        }
    }
}
