 /**
 * The CreateAccountBusiness class is responsible for validating user input and interacting with the data layer.
 */
public class CreateAccountBusiness {
    // The data layer object
    private CreateAccountData createAccountData;

    /**
     * Constructs a CreateAccountBusiness object with a CreateAccountData object.
     *
     * @param createAccountData The CreateAccountData object.
     */
    public CreateAccountBusiness(CreateAccountData createAccountData) {
        this.createAccountData = createAccountData;
    }

    /**
     * Creates a new account with the given personal information.
     *
     * @param name            The user's name.
     * @param email           The user's email address.
     * @param phoneNumber     The user's phone number.
     * @throws IllegalArgumentException If the personal information is invalid.
     */
    public void createAccount(String name, String email, String phoneNumber) throws IllegalArgumentException {
        // Validate the personal information
        if (name == null || name.isEmpty() || email == null || email.isEmpty() || phoneNumber == null || phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("Name, email, and phone number are required.");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email is invalid.");
        }
        if (!phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}")) {
            throw new IllegalArgumentException("Phone number is invalid. It should be in the format XXX-XXX-XXXX.");
        }

        // Create a new account with the validated personal information
        createAccountData.createAccount(name, email, phoneNumber);
    }
}