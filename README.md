Review for   Shakeel Mohammad      202009190

TransferMoneyData.java

No input validation in constructor: The Account class constructor does not validate the input parameters. It is essential to ensure that the provided IBAN and balance are valid to maintain data consistency.

Lack of error handling: The getAccount() method in the TransferMoneyData class returns null if the account is not found. This can lead to NullPointerExceptions if the calling code does not handle this case properly. It would be better to throw an exception indicating that the account was not found.

TransferMoneyPresentation.java

Lack of error handling: The code does not handle potential errors that might occur during user input. For example, if the user enters a non-numeric value for the transfer amount, the program will throw an InputMismatchException, which is not currently handled.

No validation of input: The code does not validate the user input to ensure that it meets certain criteria. For instance, the IBAN numbers should be checked for their correct length and format. Additionally, the transfer amount should be validated to ensure it is positive and within certain limits.

TransferMoneyBusiness.java

No input validation: The code does not validate the input parameters, such as the senderIBAN, recipientIBAN, and amount. It is essential to ensure that these values are valid to maintain data consistency and prevent potential security issues.





** Review for Tahura Tabassum 20188991 by Shakeel

CreateAccountPresenter:
Add some input validation in CreateAccountPresenter for user inputs like name, email, and phone number to prevent invalid data from being passed to the business layer. It should show some error message if the input does not match the requirements.

Logging: Consider adding logging statements in critical sections of code to track application behavior and errors. Such as when the account is being created or when user has created successfully. It shows the dynamics of the service.

The Account class created by Tabassum and Shakeel are clashing. As you are responsible for creation of accounts, The Classes should be merged to avoid duplication. You can do this by adding the iban and balance to the account class variables and using the methods and constructers defined in the TransferMoneyData.java. This will hopefully solve the Account issue.

CreateAccountData and CreateAccountBusiness:
The tests fail for both of these because of the DataSource. The error shows the reason as because the datsSource is set to null. These require some attention.







