package List;

import java.util.List;

public class Names {
    public static void main(String[]args){
        List<String> names = List.of("otani", "matsui", "sasaki", "takahashi");
        List<String> result = names.stream().filter(name -> name.startsWith("o")).toList();
        System.out.println(result);
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
