package basics;

import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctCharLength {
    public static void main(String[] args) {
        System.out.println(findDistinctCharLength("abcdefghij klmcnopq","c"));
    }

    static int findDistinctCharLength(String str,String chars){
        str = str.replaceAll(" ","");
        String result = str.substring(str.indexOf(chars),str.lastIndexOf(chars));
        System.out.println("substring string :: " + result);
       Set<String> res =  Arrays.stream(result.split("")).collect(Collectors.toSet());
       return res.size();
    }
}
