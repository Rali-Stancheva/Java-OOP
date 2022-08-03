package OOP.EXERCISE_ABSTRACTION.P2_CardRank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");

        CardRank[] suits = CardRank.values();
        for (CardRank rank : suits) {
            System.out.printf("Ordinal value: %d; Name value: %s\n",rank.ordinal(),rank);
        }
    }
}
