import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

class TransferMoneyPresentationTest {

    @Test
    void testUserInput() {
        // Simulate user input for testing
        String input = "123123123\n112233123\n500.0\nPayment for services\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Run the main method
        TransferMoneyPresentation.main(null);

        // Add assertions here if needed
        // For example, check if the output matches expected results
    }
}
