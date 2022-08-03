package OOP.LAB_ABSTRACTION.Point_in_Rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] coordinates = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Point bottomLeft = new Point(coordinates[0], coordinates[1]);

        int xTopRight = coordinates[2];
        int yTopRight = coordinates[3];

        Point topRight = new Point(xTopRight, yTopRight);
        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int countCoordinates = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < countCoordinates; i++) {
            int[] pointCoordinates = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            Point current = new Point(pointCoordinates[0],pointCoordinates[1]);
            System.out.println(rectangle.contains(current));
        }
    }
}
