package functionalInterface;

import java.util.function.Predicate;

public class _Predicates {
    public static void main(String[] args) {
        String goodNum = "+39 12352371367";
        String badNum = "+38 12352371367";

        System.out.println(isPhoneNumvalid(goodNum));
        System.out.println(isPhoneNumvalid(badNum));

        System.out.println(isPhoneNumValidPredicate.test(goodNum));
        System.out.println(isPhoneNumValidPredicate.test(badNum));

        System.out.println(
                isPhoneNumValidPredicate.and(contain0)
                        .negate()
                        .test(goodNum)
        );


    }

    // Common way ...
    static boolean isPhoneNumvalid (String phoneNum){
        return phoneNum.startsWith("+39") &&
                phoneNum.length() == 15;
    }
    
    // Functional Programming way
    static Predicate<String> isPhoneNumValidPredicate = phoneNum ->
            phoneNum.startsWith("+39") &&
                    phoneNum.length() == 15;

    //Chain Predicate
    static  Predicate<String> contain0 = phoneNum ->
            phoneNum.contains("0");
}
