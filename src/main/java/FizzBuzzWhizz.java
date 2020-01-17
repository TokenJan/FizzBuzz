public class FizzBuzzWhizz {

    private static String FIZZ = "Fizz";
    private static String BUZZ = "Buzz";
    private static String WHIZZ = "Whizz";

    public String compute(int number) {
        int fizzDivider = 3;
        int buzzDivider = 5;
        int whizzDivider = 7;
        String result = "";

        if (number % fizzDivider == 0) {
            result += FIZZ;
        }
        if (number % buzzDivider == 0) {
            result += BUZZ;
        }
        if (number % whizzDivider == 0) {
            result += WHIZZ;
        }
        if (result.equals("")) {
            return String.valueOf(number);
        }
        return result;
    }
}
