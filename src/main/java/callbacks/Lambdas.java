package callbacks;

import java.util.Locale;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        Function<String,String> uppercaseName = name -> name.toUpperCase();

    }
}
