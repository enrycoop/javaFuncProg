package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int i = increment(1);
        System.out.println(i);

        int ii = incrementByOne.apply(1);
        System.out.println(ii);

        int iii = addOneAndThenMultiplyTen.apply(1);
        System.out.println(iii);

        int iiii = addAndThenMultiplyBiFunc.apply(1,100);
        System.out.println(iiii);
    }


    // Common way ...
    static int increment (int num) {
        return num+1;
    }

    // Functional programming way ...
    static Function<Integer,Integer> incrementByOne = num -> num+1;

    static Function<Integer,Integer> multiplyByTen = num -> num*10;

    // Chaining Functions!
    static Function<Integer,Integer> addOneAndThenMultiplyTen =
            incrementByOne.andThen(multiplyByTen);

    // BiFunction

    static BiFunction<Integer,Integer,Integer> addAndThenMultiplyBiFunc =
            (num1, num2) -> (num1 + 1)*num2;

}
