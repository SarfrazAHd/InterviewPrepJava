package basics;

import java.text.SimpleDateFormat;

public class SimpleFormatter {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss:ms");
        System.out.println(df.format(System.currentTimeMillis()));
    }
}
