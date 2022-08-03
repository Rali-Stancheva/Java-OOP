package OOP.EXERCISE_ABSTRACTION.P1_CardSuit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");

        CardSuits[] suits = CardSuits.values();
        for (CardSuits suit : suits) {
            System.out.printf("Ordinal value: %d; Name value: %s\n",suit.ordinal(),suit);
        }
    }
}
