package OOP.LAB_REFLECTION.P5_CodingTracker;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tracker {
    @Author(name = "Eli")
    public static void printMethodsByAuthor(Class<?> cl){
        Map<String, List<String>> methodByAuthors = new HashMap<>();
        Method[] methods = cl.getDeclaredMethods();

        for (Method method : methods) {
            Author annotation = method.getAnnotation(Author.class);

            if (annotation != null){
                methodByAuthors.putIfAbsent(annotation.name(), new ArrayList<>());
                methodByAuthors.get(annotation.name()).add(method.getName() + "()");
            }
        }
    }
}
