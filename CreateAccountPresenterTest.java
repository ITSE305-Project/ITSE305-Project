import org.junit.Test;
import static org.junit.Assert.*;

public class CreateAccountPresenterTest {
    @Test
    public void testCreateAccount() {
        CreateAccountBusiness createAccountBusiness = new CreateAccountBusiness(new CreateAccountData());
        CreateAccountPresenter createAccountPresenter = new CreateAccountPresenter(createAccountBusiness);

        String phoneNumber = createAccountPresenter.createAccount();

        assertEquals("123-456-7890", phoneNumber);
    }
}