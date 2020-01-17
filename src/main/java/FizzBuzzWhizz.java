public class FizzBuzzWhizz {

    private static String FIZZ = "Fizz";
    private static String BUZZ = "Buzz";
    private static String WHIZZ = "Whizz";

    public String compute(int number) {
        int fizzDivider = 3;
        int buzzDivider = 5;
        int whizzDivider = 7;

        if (number % fizzDivider == 0) {
            return FIZZ;
        } else if (number % buzzDivider == 0) {
            return BUZZ;
        } else if (number % whizzDivider == 0) {
            return WHIZZ;
        }
        return String.valueOf(number);
    }
}
