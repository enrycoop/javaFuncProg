package callbacks;

import java.util.function.Consumer;

public class Callback {
    public static void main(String[] args) {

        hello("Jhon",
                null,
                x -> System.out.println("No lastname provided for "+ x)
        );
    }

    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if (lastName != null){
            System.out.println(lastName);
        }
        else{
            callback.accept(firstName);
        }
    }
}
