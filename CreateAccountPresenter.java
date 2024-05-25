/**
 * The CreateAccountPresenter class is responsible for handling user input and displaying output to the user.
 */
public class CreateAccountPresenter {
    
    public static void main(String[] args) {
        // Create a CreateAccountBusiness object
        CreateAccountBusiness createAccountBusiness = new CreateAccountBusiness(null);

        // Create a CreateAccountPresenter object
        CreateAccountPresenter createAccountPresenter = new CreateAccountPresenter(createAccountBusiness);

        // Call the createAccount method
        createAccountPresenter.createAccount();
    }
    
    // The business layer object
    public CreateAccountBusiness createAccountBusiness;

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
        System.out.print("Name: ");
        String name = System.console().readLine();
        System.out.print("Email: ");
        String email = System.console().readLine();
        System.out.print("Phone number: ");
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
