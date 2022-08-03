package OOP.EXERCISE_ABSTRACTION.P3_CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String rank = scan.nextLine();
        String suit = scan.nextLine();

        RankPowers rankPowers = RankPowers.valueOf(rank);
        SuitPowers suitPowers = SuitPowers.valueOf(suit);

        int powerCards = rankPowers.getPower() + suitPowers.getPower();
        System.out.printf("Card name: %s of %s; Card power: %d\n",rankPowers,suitPowers,powerCards);
    }
}
