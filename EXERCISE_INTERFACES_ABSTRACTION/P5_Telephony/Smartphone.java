package OOP.EXERCISE_INTERFACES_ABSTRACTION.P5_Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder builder = new StringBuilder();

        for (String url : this.urls) {
            if (url.matches("^[^0-9]+$")) {
                builder.append(String.format("Browsing: %s!", url))
                        .append(System.lineSeparator());
            } else {
                builder.append("Invalid URL!")
                        .append(System.lineSeparator());
            }
        }
        return builder.toString();
    }

    @Override
    public String call() {
        StringBuilder builder = new StringBuilder();

        for (String number : numbers) {
            if (number.matches("^[0-9]+$")){
                builder.append(String.format("Calling... %s",number))
                        .append(System.lineSeparator());
            }else {
                builder.append("Invalid number!")
                        .append(System.lineSeparator());
            }
        }
        return builder.toString();
    }
}
