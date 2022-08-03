package OOP.EXERCISE_ABSTRACTION;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P6_GreedyTimes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity  = Long.parseLong(scanner.nextLine());
        String[] itemAndQuantity  = scanner.nextLine().split("\\s+");

        Map<String, LinkedHashMap<String,Long>> bag = new LinkedHashMap<>();
        long gold = 0;
        long gem  = 0;  //камъни
        long cash  = 0;

        for (int i = 0; i < itemAndQuantity.length; i += 2) {
            String name = itemAndQuantity[i];
            long broika = Long.parseLong(itemAndQuantity[i + 1]);

            String typesItems = "";

            if (name.length() == 3) {
                typesItems = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                typesItems = "Gem";
            } else if (name.toLowerCase().equals("gold")) {
                typesItems = "Gold";
            }

            if (typesItems.equals("")) {
                continue;
            } else if (bagCapacity < bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + broika) {
                continue;
            }

            switch (typesItems) {
                case "Gem":
                    if (!bag.containsKey(typesItems)) {
                        if (bag.containsKey("Gold")) {
                            if (broika > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(typesItems).values().stream().mapToLong(e -> e).sum() + broika > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(typesItems)) {
                        if (bag.containsKey("Gem")) {
                            if (broika > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(typesItems).values().stream().mapToLong(e -> e).sum() + broika > bag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(typesItems)) {
                bag.put((typesItems), new LinkedHashMap<String, Long>());
            }

            if (!bag.get(typesItems).containsKey(name)) {
                bag.get(typesItems).put(name, 0L);
            }


            bag.get(typesItems).put(name, bag.get(typesItems).get(name) + broika);
            if (typesItems.equals("Gold")) {
                gold += broika;
            } else if (typesItems.equals("Gem")) {
                gem += broika;
            } else if (typesItems.equals("Cash")) {
                cash += broika;
            }
        }

        for (var x : bag.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));
        }
    }
}
