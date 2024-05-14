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
     * @return 
     */
    public String createAccount() {
        // Prompt the user to enter their personal information
        System.out.println("Enter your personal information:");
        System.out.print("Name:Tahura Tabassum ");
        String name = System.console().readLine();
        System.out.print("Email: tahura@example.com ");
        String email = System.console().readLine();
        System.out.print("Phone number:123-456-7890S ");
        String phoneNumber = System.console().readLine();
        if (name == null || name.isEmpty() || email == null || email.isEmpty() || phoneNumber == null || phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("Name, email, and phone number are required.");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email is invalid.");
        }
        if (!phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}")) {
            throw new IllegalArgumentException("Phone number is invalid. It should be in the format XXX-XXX-XXXX.");
        }
        // Create a new account with the user's personal information
        try {
            createAccountBusiness.createAccount(name, email, phoneNumber);
            System.out.println("Account created successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return phoneNumber;
        
    }
}
