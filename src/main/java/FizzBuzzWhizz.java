/**
 * @author jiahuan.yang
 */
public class FizzBuzzWhizz {

    private static String FIZZ = "Fizz";
    private static String BUZZ = "Buzz";
    private static String WHIZZ = "Whizz";

    public String compute(int number) {
        String result = "";
        boolean skipFizz = false;
        boolean skipBuzz = false;
        boolean skip6 = false;
        boolean skip4And5 = false;
        boolean containThree = contains(number, "3");
        boolean containFive = contains(number, "5");
        boolean containSeven = contains(number, "7");

        // rule 7
        if (containSeven) {
            skipBuzz = true;
            skip6 = true;
        }

        // rule 6
        if (containFive && !skip6) {
            skipFizz = true;
            skip4And5 = true;
        }

        // rule 4 and rule 5
        if (containThree && !skip4And5) {
            return FIZZ;
        }

        // rule 2 and rule 3
        result = computeBasicFizzBuzzRule(number, skipFizz, skipBuzz);

        return result.isEmpty() ? String.valueOf(number) : result;
    }

    private boolean contains(int number, String target) {
        return String.valueOf(number).contains(target);
    }

    private String computeBasicFizzBuzzRule(int number, boolean skipFizz, boolean skipBuzz) {
        String result = "";
        boolean isDivisible3 = number % 3 == 0;
        boolean isDivisible5 = number % 5 == 0;
        boolean isDivisible7 = number % 7 == 0;

        if (isDivisible3 && !skipFizz) {
            result += FIZZ;
        }

        if (isDivisible5 && !skipBuzz) {
            result += BUZZ;
        }

        if (isDivisible7) {
            result += WHIZZ;
        }
        return result;
    }
}
