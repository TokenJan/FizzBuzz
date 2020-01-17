import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzzWhizz fizzBuzzWhizz;

    @Before
    public void setup() {
        fizzBuzzWhizz = new FizzBuzzWhizz();
    }

    @Test
    public void should_return_fizz_when_it_could_be_divided_by_three() {
        String result = fizzBuzzWhizz.compute(3);
        assert result.equals("Fizz");
    }

    @Test
    public void should_return_buzz_when_it_could_be_divided_by_five() {
        String result = fizzBuzzWhizz.compute(5);
        assert result.equals("Buzz");
    }

    @Test
    public void should_return_whizz_when_it_could_be_divided_by_seven() {
        String result = fizzBuzzWhizz.compute(7);
        assert result.equals("Whizz");
    }

    @Test
    public void should_return_number_when_it_could_not_be_divided_by_three_or_five_or_seven() {
        String result = fizzBuzzWhizz.compute(8);
        assert result.equals("8");
    }
}