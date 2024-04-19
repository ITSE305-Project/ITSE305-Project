/**
* The CreateAccountData class is responsible for storing and retrieving data from a data source.
*/
public class CreateAccountData {
   // The data source object (e.g. a database or file)
   private DataSource dataSource;

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

       // Save the new account to the data source
       Account account = new Account(name, email, phoneNumber);
       dataSource.saveAccount(account);
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


/**
* The DataSource interface defines methods for saving and retrieving accounts.
*/
interface DataSource {
   void saveAccount(Account account);
   Account getAccount(String email);
}