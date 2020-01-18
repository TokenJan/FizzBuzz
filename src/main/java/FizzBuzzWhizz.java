public class FizzBuzzWhizz {

    private static String FIZZ = "Fizz";
    private static String BUZZ = "Buzz";
    private static String WHIZZ = "Whizz";
    private static String EMPTY_STRING = "";
    private static int fizzDivider = 3;
    private static int buzzDivider = 5;
    private static int whizzDivider = 7;
    private static String THREE = "3";
    private static String FIVE = "5";
    private static String SEVEN = "7";
    private String result = EMPTY_STRING;
    private boolean skipFizz = false;
    private boolean skipBuzz = false;
    private boolean skip6 = false;
    private boolean skip4And5 = false;

    public String compute(int number) {

        String numStr = String.valueOf(number);

        // rule 7
        if (numStr.contains(SEVEN)) {
            skipBuzz = true;
            skip6 = true;
        }

        // rule 6
        if (numStr.contains(FIVE) && !skip6) {
            skipFizz = true;
            skip4And5 = true;
        }

        // rule 4 and rule 5
        if (numStr.contains(THREE) && !skip4And5) {
            return FIZZ;
        }

        // rule 2 and rule 3
        computeBasicFizzBuzzRule(number, skipFizz, skipBuzz);

        // rule 1
        if (EMPTY_STRING.equals(result)) {
            return String.valueOf(number);
        }

        return result;
    }

    private void computeBasicFizzBuzzRule(int number, boolean skipFizz, boolean skipBuzz) {
        if (number % fizzDivider == 0 && !skipFizz) {
            result += FIZZ;
        }

        if (number % buzzDivider == 0 && !skipBuzz) {
            result += BUZZ;
        }

        if (number % whizzDivider == 0) {
            result += WHIZZ;
        }
    }
}
