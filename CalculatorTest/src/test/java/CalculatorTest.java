import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testSumyDwochLiczbDodatnich() {
        assertThat(Calculator.add_numbers(3, 10)).isEqualTo(13);
        assertThat(Calculator.add_numbers(5, -2)).isEqualTo(3);
        assertThat(Calculator.add_numbers(-3, -7)).isEqualTo(-10);
        assertThat(Calculator.add_numbers(5, 0)).isEqualTo(5);
    }

    @Test
    public void testIsEven() {
        assertThat(Calculator.is_even(4)).isTrue();
        assertThat(Calculator.is_even(10)).isTrue();
        assertThat(Calculator.is_even(0)).isTrue();
        assertThat(Calculator.is_even(3)).isFalse();
        assertThat(Calculator.is_even(-1)).isFalse();
        assertThat(Calculator.is_even(1000000)).isTrue();
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertThat(Calculator.celsius_to_fahrenheit(0)).isEqualTo(32.0);
        assertThat(Calculator.celsius_to_fahrenheit(100)).isEqualTo(212.0);
        assertThat(Calculator.celsius_to_fahrenheit(-10)).isEqualTo(14.0);
        assertThat(Calculator.celsius_to_fahrenheit(1000)).isEqualTo(1832.0);
    }

    @Test
    public void testFactorial() {
        assertThat(Calculator.factorial(0)).isEqualTo(1);
        assertThat(Calculator.factorial(1)).isEqualTo(1);
        assertThat(Calculator.factorial(2)).isEqualTo(2);
        assertThat(Calculator.factorial(5)).isEqualTo(120);
        assertThat(Calculator.factorial(10)).isEqualTo(3628800);

        assertThatThrownBy(() -> Calculator.factorial(-5))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void testIsPrime() {
        assertThat(Calculator.is_prime(2)).isTrue();
        assertThat(Calculator.is_prime(3)).isTrue();
        assertThat(Calculator.is_prime(5)).isTrue();
        assertThat(Calculator.is_prime(7)).isTrue();

        assertThat(Calculator.is_prime(4)).isFalse();
        assertThat(Calculator.is_prime(6)).isFalse();
        assertThat(Calculator.is_prime(8)).isFalse();
        assertThat(Calculator.is_prime(9)).isFalse();

        assertThat(Calculator.is_prime(1)).isFalse();
        assertThat(Calculator.is_prime(-5)).isFalse();

        assertThat(Calculator.is_prime(7919)).isTrue();
    }
}
