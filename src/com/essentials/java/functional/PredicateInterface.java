package src.com.essentials.java.functional;


import java.util.function.Predicate;

/*
 *
 * Predicate interface, represents a predicate (boolean-valued function) of one argument
 *
 * */
public class PredicateInterface extends FunctionBase {
    @Override
    public void function() {
        System.out.println("Predicate represents a predicate (boolean-valued function) of one argument.");
        System.out.println("normal function " + isPhoneNumberValid("000101010"));
        System.out.println("normal function " + isPhoneNumberValid("45010101015"));

        System.out.println("Predicate function " + isPhoneNumberPredicate.test("45010101015"));
        System.out.println("Combined AND predicate function " + combinedPredicateAnd.test("45010101015"));
        System.out.println("Combined OR predicate function " + combinedPredicateOr.test("45010101015"));

    }

    static Predicate<String> isPhoneNumberPredicate = phoneNumber -> phoneNumber.startsWith("45") && phoneNumber.length() == 11;
    static Predicate<String> containsNumberThree = phoneNumber -> phoneNumber.contains("3");
    static Predicate<String> combinedPredicateOr = isPhoneNumberPredicate.or(containsNumberThree);
    static Predicate<String> combinedPredicateAnd = isPhoneNumberPredicate.and(containsNumberThree);

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("45") && phoneNumber.length() == 11;
    }
}
