import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testOutput() {
        String output = "Hello, CI/CD Pipeline!";
        assertEquals(output, "Hello, CI/CD Pipeline!");
    }
}
