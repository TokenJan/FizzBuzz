public class FizzBuzzWhizz {

    private static String FIZZ = "Fizz";
    private static String BUZZ = "Buzz";
    private static String WHIZZ = "Whizz";
    private String EMPTY_STRING = "";

    public String compute(int number) {

        int fizzDivider = 3;
        int buzzDivider = 5;
        int whizzDivider = 7;
        String result = EMPTY_STRING;
        String numStr = String.valueOf(number);

        if (numStr.contains("3")) {
            return FIZZ;
        }

        if (number % fizzDivider == 0) {
            result += FIZZ;
        }

        if (number % buzzDivider == 0) {
            result += BUZZ;
        }

        if (number % whizzDivider == 0) {
            result += WHIZZ;
        }
        if (EMPTY_STRING.equals(result)) {
            return String.valueOf(number);
        }

        return result;
    }
}
