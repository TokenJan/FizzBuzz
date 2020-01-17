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

    public String compute(int number) {

        String numStr = String.valueOf(number);

        // rule 7
        if (numStr.contains(SEVEN)) {
            // rule 4 and rule 5
            if (numStr.contains(THREE)) {
                return FIZZ;
            }

            else {
                // rule 2 and rule 3
                computeRule2AndRule3Without5Dividor(number);
            }
        }

        // rule 6
        else if (numStr.contains(FIVE)) {
            computeRule2AndRule3Without3Dividor(number);
        }

        // rule 4 and rule 5
        else if (numStr.contains(THREE)) {
            return FIZZ;
        }

        else {
            // rule 2 and rule 3
            computeRule2AndRule3(number);
        }

        // rule 1
        if (EMPTY_STRING.equals(result)) {
            return String.valueOf(number);
        }

        return result;
    }

    private void computeRule2AndRule3Without3Dividor(int number) {
        if (number % buzzDivider == 0) {
            result += BUZZ;
        }

        if (number % whizzDivider == 0) {
            result += WHIZZ;
        }
    }

    private void computeRule2AndRule3Without5Dividor(int number) {
        if (number % fizzDivider == 0) {
            result += FIZZ;
        }

        if (number % whizzDivider == 0) {
            result += WHIZZ;
        }
    }

    private void computeRule2AndRule3(int number) {
        if (number % fizzDivider == 0) {
            result += FIZZ;
        }

        if (number % buzzDivider == 0) {
            result += BUZZ;
        }

        if (number % whizzDivider == 0) {
            result += WHIZZ;
        }
    }
}
