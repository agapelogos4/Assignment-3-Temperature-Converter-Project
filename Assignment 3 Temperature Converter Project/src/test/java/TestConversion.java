import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestConversion
{
    @Test
    void testCelsiusToFahrenheit()
    {
        Main test = new Main();
        assertEquals(68, test.celsiusToFahrenheit(20));
    }

    @Test
    void testFahrenheitToCelsius()
    {
        Main test = new Main();
        assertEquals(20, test.fahrenheitToCelsius(68));
    }

    @Test
    void celsiusToKelvin()
    {
        Main test = new Main();
        assertEquals(293.15, test.celsiusToKelvin(20));
    }
}
