/**
 * @author jiahuan.yang
 */
public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String call(int number) {
        String result = "";
        String numberStr = String.valueOf(number);
        boolean contains5 = isContains(numberStr, "5") && !isContains(numberStr, "7");
        boolean contains7 = isContains(numberStr, "7");
        if (isDivisible(number, 3) && !contains5) {
            result += FIZZ;
        }

        if (isDivisible(number, 5) && !contains7) {
            result += BUZZ;
        }

        if (isDivisible(number, 7)) {
            result += WHIZZ;
        }

        if (numberStr.contains("3") && !contains5) {
            result = FIZZ;
        }

        return result.isEmpty()
                ? numberStr
                : result;
    }

    private boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }

    private boolean isContains(String numberStr, String digit) {
        return numberStr.contains(digit);
    }
}
