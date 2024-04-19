 /**
 * The CreateAccountPresenter class is responsible for handling user input and displaying output to the user.
 */
public class CreateAccountPresenter {
    // The business layer object
    private CreateAccountBusiness createAccountBusiness;

    /**
     * Constructs a CreateAccountPresenter object with a CreateAccountBusiness object.
     *
     * @param createAccountBusiness The CreateAccountBusiness object.
     */
    public CreateAccountPresenter(CreateAccountBusiness createAccountBusiness) {
        this.createAccountBusiness = createAccountBusiness;
    }

    /**
     * Displays a prompt to the user to enter their personal information and creates a new account.
     */
    public void createAccount() {
        // Prompt the user to enter their personal information
        System.out.println("Enter your personal information:");
        System.out.print("Name: ");
        String name = System.console().readLine();
        System.out.print("Email: ");
        String email = System.console().readLine();
        System.out.print("Phone number: ");
        String phoneNumber = System.console().readLine();

        // Create a new account with the user's personal information
        try {
            createAccountBusiness.createAccount(name, email, phoneNumber);
            System.out.println("Account created successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}