package OOP.EXERCISE_ABSTRACTION.P4_TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] colorsInput = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(scan.nextLine());

        List<Lights> trafficLights = new ArrayList<>();
        for (String s : colorsInput) {
            Lights lights = new Lights(Color.valueOf(s));
            trafficLights.add(lights);
        }

        for (int i = 0; i < n; i++) {
            trafficLights.forEach(e->{
                e.changeColor();
                System.out.print(e.getColor() + " ");
            });
            System.out.println();
        }
    }
}
