package basics;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SpecailCharacter {
    public static void main(String[] args) {
        String str = ")This&is$*&*a%Special+Character_String#with!Numbers@8765<";
        String result = str.replaceAll("[^a-zA-Z0-9]"," ");
        System.out.println(result);

    }
}


