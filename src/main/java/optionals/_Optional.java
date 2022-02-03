package optionals;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
        Object nullValue = Optional.ofNullable(null)
                .orElseGet(  () -> "Default value");
        Object value = Optional.ofNullable("hello")
                .orElseGet(  () -> "Default value");

        System.out.println("nullValue :" + nullValue + "\nvalue : "+ value);

        Optional.ofNullable("Hello!! ").ifPresent( s ->
                System.out.println("Received "+ s)) ;

        Optional.ofNullable(null).ifPresentOrElse(
                s -> System.out.println("Received "+ s),
                () -> System.out.println("NO VALUE RECEIVED..." )); ;

    }
}
