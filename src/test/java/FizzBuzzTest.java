import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_Fizz_given_3() {
        assert "Fizz".equals(fizzBuzz.call(3));
    }

    @Test
    public void should_return_Buzz_given_5() {
        assert "Buzz".equals(fizzBuzz.call(5));
    }

    @Test
    public void should_return_Whizz_given_7() {
        assert "Whizz".equals(fizzBuzz.call(7));
    }

    @Test
    public void should_return_Fizz_given_13() {
        assert "Fizz".equals(fizzBuzz.call(13));
    }

    @Test
    public void should_return_Buzz_given_15() {
        assert "Buzz".equals(fizzBuzz.call(15));
    }

    @Test
    public void should_return_FizzWhizz_given_21() {
        assert "FizzWhizz".equals(fizzBuzz.call(21));
    }

    @Test
    public void should_return_Fizz_given_30() {
        assert "Fizz".equals(fizzBuzz.call(30));
    }

    @Test
    public void should_return_BuzzWhizz_given_35() {
        assert "BuzzWhizz".equals(fizzBuzz.call(35));
    }

    @Test
    public void should_return_Fizz_given_73() {
        assert "Fizz".equals(fizzBuzz.call(73));
    }

    @Test
    public void should_return_Fizz_given_75() {
        assert "Fizz".equals(fizzBuzz.call(75));
    }

    @Test
    public void should_return_BuzzWhizz_given_105() {
        assert "BuzzWhizz".equals(fizzBuzz.call(105));
    }
}