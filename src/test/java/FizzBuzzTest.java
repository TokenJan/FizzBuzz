import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzzWhizz fizzBuzzWhizz;

    @Before
    public void setup() {
        fizzBuzzWhizz = new FizzBuzzWhizz();
    }

    @Test
    public void should_return_fizz_when_it_call_3() {
        String result = fizzBuzzWhizz.compute(3);
        assert result.equals("Fizz");
    }

    @Test
    public void should_return_buzz_when_it_call_5() {
        String result = fizzBuzzWhizz.compute(5);
        assert result.equals("Buzz");
    }

    @Test
    public void should_return_whizz_when_it_call_7() {
        String result = fizzBuzzWhizz.compute(7);
        assert result.equals("Whizz");
    }

    @Test
    public void should_return_number_when_it_call_8() {
        String result = fizzBuzzWhizz.compute(8);
        assert result.equals("8");
    }

    @Test
    public void should_return_fizzbuzz_when_it_call_15() {
        String result = fizzBuzzWhizz.compute(15);
        assert result.equals("Buzz");
    }

    @Test
    public void should_return_fizzwhizz_when_it_call_21() {
        String result = fizzBuzzWhizz.compute(21);
        assert result.equals("FizzWhizz");
    }

    @Test
    public void should_return_buzzwhizz_when_it_call_35() {
        String result = fizzBuzzWhizz.compute(35);
        assert result.equals("BuzzWhizz");
    }

    @Test
    public void should_return_fizzbuzzwhizz_when_it_call_105() {
        String result = fizzBuzzWhizz.compute(105);
        assert result.equals("BuzzWhizz");
    }

    @Test
    public void should_return_fizz_when_it_call_13() {
        String result = fizzBuzzWhizz.compute(13);
        assert result.equals("Fizz");
    }
    @Test
    public void should_return_fizz_when_it_call_30() {
        String result = fizzBuzzWhizz.compute(30);
        assert result.equals("Fizz");
    }

    @Test
    public void should_return_fizz_when_it_call_75() {
        String result = fizzBuzzWhizz.compute(75);
        assert result.equals("Fizz");
    }

    @Test
    public void should_return_fizz_when_it_call_73() {
        String result = fizzBuzzWhizz.compute(73);
        assert result.equals("Fizz");
    }
}