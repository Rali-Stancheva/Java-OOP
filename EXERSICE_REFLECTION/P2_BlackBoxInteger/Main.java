package OOP.EXERSICE_REFLECTION.P2_BlackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        Class<BlackBoxInt> clazz = BlackBoxInt.class;

        //обект от клас -> конструктор
        Constructor<BlackBoxInt> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt blackBoxInt = constructor.newInstance();

        //взимаме полето innerValue
        Field innerValue = clazz.getDeclaredField("innerValue");

        //всички методи
        List<Method> methods = Arrays.asList(clazz.getDeclaredMethods());


        while (!input.equals("END")) {
            String[] tokens = input.split("_");
            String commands = tokens[0];
            int number = Integer.parseInt(tokens[1]);


            switch (commands) {
                case "add":
                    executeCommand(blackBoxInt, innerValue, number, "add", methods);
                    break;
                case "subtract":
                    executeCommand(blackBoxInt, innerValue, number, "subtract", methods);
                    break;
                case "multiply":
                    executeCommand(blackBoxInt, innerValue, number, "multiply", methods);
                    break;
                case "divide":
                    executeCommand(blackBoxInt, innerValue, number, "divide", methods);
                    break;
                case "leftShift":
                    executeCommand(blackBoxInt, innerValue, number, "leftShift", methods);
                    break;
                case "rightShift":
                    executeCommand(blackBoxInt, innerValue, number, "rightShift", methods);
                    break;
            }
            input = scan.nextLine();
        }
    }

    public static void executeCommand(BlackBoxInt blackBoxInt, Field innerValue, int number, String commands, List<Method> methods) throws InvocationTargetException, IllegalAccessException {
        Method currMethod = null;
        for (Method method : methods) {
            if (method.getName().equals(commands)) {
                currMethod = method;
                break;
            }
        }

        currMethod.setAccessible(true);
        currMethod.invoke(blackBoxInt, number);

        innerValue.setAccessible(true);
        System.out.println(innerValue.get(blackBoxInt));
    }
}
