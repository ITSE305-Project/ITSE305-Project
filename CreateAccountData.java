import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
* The CreateAccountData class is responsible for storing and retrieving data from an in-memory data source.
*/
public class CreateAccountData {
   // The in-memory data source
   private List<Account> accounts = new ArrayList<>();

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

       // Save the new account to the in-memory data source
       Account account = new Account(name, email, phoneNumber);
       accounts.add(account);
   }

   /**
    * Retrieves an account with the given email address.
    *
    * @param email The email address of the account to retrieve.
    * @return The account with the given email address, or an empty Optional if no such account exists.
    */
   public Optional<Account> getAccount(String email) {
       return accounts.stream().filter(account -> account.getEmail().equals(email)).findFirst();
   }
}

/**
* The Account class represents a user account.
*/
class Account {
   private String name;
   private String email;
   private String phoneNumber;

   public Account(String name, String email, String phoneNumber) {
       this.name = name;
       this.email = email;
       this.phoneNumber = phoneNumber;
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getEmail() {
       return email;
   }

   public void setEmail(String email) {
       this.email = email;
   }

   public String getPhoneNumber() {
       return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
       this.phoneNumber = phoneNumber;
   }
}
