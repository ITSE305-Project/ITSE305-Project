
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    TransferMoneyPresentation transferMoneyPresentation0 = new TransferMoneyPresentation();

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    CreateAccountData createAccountData0 = null;
    CreateAccountBusiness createAccountBusiness1 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness1.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)10.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness3.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("hi!", (-1.0d));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness7.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    CreateAccountData createAccountData0 = null;
    CreateAccountBusiness createAccountBusiness1 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness1.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness7.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", 97.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness8.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness7.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    CreateAccountBusiness createAccountBusiness1 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness1.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness3.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    CreateAccountBusiness createAccountBusiness1 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness1.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness6.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("hi!");
    account3.setPhoneNumber("");
    account3.setPhoneNumber("");
    account3.setName("hi!");
    account3.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness9.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness5 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    CreateAccountData createAccountData0 = null;
    CreateAccountBusiness createAccountBusiness1 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness1.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness9.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness6.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)10.0f);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setName("");
    account3.setEmail("");
    java.lang.String str13 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness6.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness4.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness4.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)1L);
    double d8 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 1.0d);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", 0.0d);
    java.lang.String str3 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness11.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness5 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness5.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness12.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    java.lang.String str5 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    java.lang.String str8 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)0);
    double d3 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    java.lang.String str5 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    java.lang.String str8 = account3.getPhoneNumber();
    java.lang.String str9 = account3.getName();
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(short)10);
    java.lang.String str11 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str14 = transferAccount2.getIBAN();
    double d15 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)100.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(-1L));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    double d9 = transferAccount2.getBalance();
    java.lang.String str10 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)100);
    transferAccount2.setBalance((double)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness9.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setName("");
    java.lang.String str11 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("");
    java.lang.String str16 = account3.getEmail();
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness11.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)1L);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", 0.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("hi!");
    account3.setPhoneNumber("");
    account3.setPhoneNumber("");
    account3.setName("hi!");
    java.lang.String str16 = account3.getEmail();
    java.lang.String str17 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness5 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness5.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness11.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    Account account3 = new Account("hi!", "hi!", "");
    account3.setName("");
    java.lang.String str6 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness8.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    Account account3 = new Account("hi!", "hi!", "");
    account3.setPhoneNumber("");
    account3.setPhoneNumber("hi!");

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    CreateAccountBusiness createAccountBusiness1 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account3 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account3);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness7.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    account3.setEmail("");
    account3.setPhoneNumber("hi!");
    java.lang.String str14 = account3.getPhoneNumber();
    java.lang.String str15 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness6.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness10.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getPhoneNumber();
    java.lang.String str8 = account3.getEmail();
    account3.setName("");
    java.lang.String str11 = account3.getPhoneNumber();
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness12.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness10.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness9.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness12.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setEmail("hi!");
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("hi!");
    account3.setPhoneNumber("");
    java.lang.String str12 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getEmail();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    java.lang.String str7 = account3.getEmail();
    account3.setEmail("");
    java.lang.String str10 = account3.getPhoneNumber();
    account3.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)100L);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("");
    boolean b8 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount16 = transferMoneyData0.getAccount("");
    boolean b18 = transferMoneyData0.accountExists("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)10L);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness9.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness5 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    java.lang.String str5 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    java.lang.String str8 = account3.getPhoneNumber();
    java.lang.String str9 = account3.getName();
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness7.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("hi!");
    boolean b8 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("hi!");
    boolean b12 = transferMoneyData0.accountExists("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness11.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getEmail();
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setEmail("");
    account3.setName("");
    java.lang.String str13 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(short)10);
    double d3 = transferAccount2.getBalance();
    double d4 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 10.0d);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness10.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("");
    boolean b8 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("");
    boolean b16 = transferMoneyData0.accountExists("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness5 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness8.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness6.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness8.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    java.lang.String str9 = account3.getPhoneNumber();
    java.lang.String str10 = account3.getName();
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness8.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)100.0f);
    transferAccount2.setBalance((double)' ');

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setEmail("");
    java.lang.String str8 = account3.getName();
    account3.setPhoneNumber("");
    java.lang.String str11 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness10.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    account3.setName("hi!");
    java.lang.String str12 = account3.getEmail();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)(-1.0f));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setName("hi!");
    account3.setEmail("hi!");
    java.lang.String str13 = account3.getName();
    java.lang.String str14 = account3.getName();
    java.lang.String str15 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setName("hi!");
    java.lang.String str11 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness11.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setName("hi!");
    java.lang.String str11 = account3.getEmail();
    java.lang.String str12 = account3.getEmail();
    java.lang.String str13 = account3.getName();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    CreateAccountBusiness createAccountBusiness1 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account3 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness4.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account3);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account16);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    java.lang.String str5 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    java.lang.String str8 = account3.getPhoneNumber();
    java.lang.String str9 = account3.getEmail();
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    CreateAccountBusiness createAccountBusiness1 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account3 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account3);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(-1.0f));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    boolean b6 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("hi!");
    boolean b10 = transferMoneyData0.accountExists("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    java.lang.String str8 = transferAccount2.getIBAN();
    double d9 = transferAccount2.getBalance();
    transferAccount2.setBalance(10.0d);
    double d12 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 10.0d);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness11.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getName();
    account3.setEmail("");
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness14 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness14.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    Account account3 = new Account("hi!", "hi!", "");
    account3.setName("hi!");
    account3.setEmail("");
    java.lang.String str8 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setEmail("");
    account3.setPhoneNumber("");

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    Account account3 = new Account("hi!", "hi!", "");
    account3.setPhoneNumber("");
    account3.setName("");

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    boolean b14 = transferMoneyData0.accountExists("hi!");
    boolean b16 = transferMoneyData0.accountExists("hi!");
    boolean b18 = transferMoneyData0.accountExists("");
    boolean b20 = transferMoneyData0.accountExists("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("");
    boolean b8 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    boolean b12 = transferMoneyData0.accountExists("");
    boolean b14 = transferMoneyData0.accountExists("");
    boolean b16 = transferMoneyData0.accountExists("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness11.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    java.lang.String str9 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str12 = account3.getName();
    java.lang.String str13 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("");
    boolean b12 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("");
    boolean b16 = transferMoneyData0.accountExists("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    account3.setEmail("");
    account3.setPhoneNumber("hi!");
    account3.setEmail("hi!");
    java.lang.String str16 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account13);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setName("hi!");
    account3.setEmail("hi!");
    java.lang.String str13 = account3.getName();
    java.lang.String str14 = account3.getName();
    java.lang.String str15 = account3.getEmail();
    account3.setName("");
    java.lang.String str18 = account3.getPhoneNumber();
    account3.setPhoneNumber("hi!");
    java.lang.String str21 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)0);
    java.lang.String str10 = transferAccount2.getIBAN();
    java.lang.String str11 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(short)10);
    transferAccount2.setBalance(0.0d);
    transferAccount2.setBalance(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)'4');
    double d11 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 52.0d);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness14 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness15 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setEmail("hi!");
    account3.setEmail("hi!");
    java.lang.String str10 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness12.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    java.lang.String str9 = account3.getName();
    account3.setEmail("hi!");
    account3.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account15 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account15);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setName("");
    account3.setEmail("hi!");
    java.lang.String str9 = account3.getPhoneNumber();
    account3.setName("hi!");
    java.lang.String str12 = account3.getName();
    java.lang.String str13 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setName("");
    account3.setEmail("");
    java.lang.String str9 = account3.getEmail();
    java.lang.String str10 = account3.getEmail();
    account3.setEmail("hi!");
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness8.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount10);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)1);
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)0);
    java.lang.String str10 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    transferAccount2.setBalance((double)(byte)100);
    double d9 = transferAccount2.getBalance();
    double d10 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 100.0d);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness9.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness5 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness5.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness14 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness14.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness5 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    java.lang.String str9 = account3.getPhoneNumber();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)' ');
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    double d9 = transferAccount2.getBalance();
    transferAccount2.setBalance(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 32.0d);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getPhoneNumber();
    account3.setName("hi!");
    java.lang.String str10 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getPhoneNumber();
    java.lang.String str8 = account3.getEmail();
    account3.setName("");
    account3.setEmail("hi!");
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    account3.setEmail("hi!");
    account3.setPhoneNumber("hi!");
    account3.setEmail("");
    java.lang.String str14 = account3.getEmail();
    java.lang.String str15 = account3.getEmail();
    java.lang.String str16 = account3.getName();
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    double d9 = transferAccount2.getBalance();
    transferAccount2.setBalance(0.0d);
    java.lang.String str12 = transferAccount2.getIBAN();
    double d13 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)1.0f);
    double d16 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness10.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    java.lang.String str10 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    account3.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(short)100);
    transferAccount2.setBalance(10.0d);
    double d5 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    java.lang.String str5 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness12.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(-1.0f));
    double d7 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-1.0d));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    boolean b8 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("hi!");
    boolean b12 = transferMoneyData0.accountExists("");
    boolean b14 = transferMoneyData0.accountExists("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", 1.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getPhoneNumber();
    account3.setEmail("");
    java.lang.String str10 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account15 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account15);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness10.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account18 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account18);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setEmail("hi!");
    account3.setName("hi!");
    account3.setName("");
    account3.setName("hi!");
    java.lang.String str16 = account3.getEmail();
    account3.setEmail("hi!");
    java.lang.String str19 = account3.getPhoneNumber();
    java.lang.String str20 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    account3.setEmail("");
    account3.setEmail("");
    account3.setEmail("hi!");
    account3.setEmail("hi!");
    java.lang.String str18 = account3.getEmail();
    account3.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(short)10);
    double d11 = transferAccount2.getBalance();
    java.lang.String str12 = transferAccount2.getIBAN();
    java.lang.String str13 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(short)0);
    double d16 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness13.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness4.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness4.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness10.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setName("");
    java.lang.String str11 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("");
    account3.setPhoneNumber("hi!");
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)10.0f);
    transferAccount2.setBalance(97.0d);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getEmail();
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setEmail("hi!");
    java.lang.String str6 = account3.getEmail();
    java.lang.String str7 = account3.getPhoneNumber();
    java.lang.String str8 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    java.lang.String str9 = account3.getPhoneNumber();
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    java.lang.String str10 = account3.getEmail();
    java.lang.String str11 = account3.getPhoneNumber();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getEmail();
    java.lang.String str7 = account3.getName();
    account3.setPhoneNumber("");
    account3.setName("hi!");
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setEmail("hi!");
    account3.setName("hi!");
    account3.setName("");
    account3.setName("hi!");
    java.lang.String str16 = account3.getEmail();
    account3.setEmail("hi!");
    java.lang.String str19 = account3.getPhoneNumber();
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getPhoneNumber();
    java.lang.String str7 = account3.getEmail();
    account3.setName("hi!");
    account3.setPhoneNumber("hi!");
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)100);
    transferAccount2.setBalance(32.0d);
    transferAccount2.setBalance((double)100);
    double d7 = transferAccount2.getBalance();
    java.lang.String str8 = transferAccount2.getIBAN();
    transferAccount2.setBalance((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    java.lang.String str9 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str12 = account3.getEmail();
    account3.setPhoneNumber("");
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setEmail("hi!");
    account3.setName("hi!");
    account3.setName("");
    account3.setName("hi!");
    account3.setEmail("hi!");

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness13.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness12.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    double d9 = transferAccount2.getBalance();
    java.lang.String str10 = transferAccount2.getIBAN();
    double d11 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness12.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setEmail("hi!");
    account3.setName("hi!");
    java.lang.String str12 = account3.getName();
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    java.lang.String str5 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness12.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness12.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness11.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getPhoneNumber();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    java.lang.String str10 = account3.getEmail();
    account3.setName("");
    java.lang.String str13 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setEmail("hi!");
    account3.setPhoneNumber("");
    java.lang.String str12 = account3.getEmail();
    java.lang.String str13 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness5 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness5.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness7.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setPhoneNumber("");
    java.lang.String str10 = account3.getPhoneNumber();
    java.lang.String str11 = account3.getName();
    java.lang.String str12 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    java.lang.String str8 = transferAccount2.getIBAN();
    java.lang.String str9 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(-1.0f));
    java.lang.String str12 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str10 = account3.getEmail();
    account3.setEmail("");
    account3.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    java.lang.String str5 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    java.lang.String str8 = account3.getPhoneNumber();
    java.lang.String str9 = account3.getPhoneNumber();
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getEmail();
    java.lang.String str12 = account3.getName();
    java.lang.String str13 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness9.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    java.lang.String str7 = account3.getEmail();
    java.lang.String str8 = account3.getEmail();
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    account3.setEmail("");
    account3.setEmail("");
    java.lang.String str14 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness8.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    double d3 = transferAccount2.getBalance();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    double d6 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness11.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setPhoneNumber("");
    account3.setPhoneNumber("");
    account3.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)100L);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness15 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness15.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("");
    boolean b8 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    boolean b12 = transferMoneyData0.accountExists("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }

    Account account3 = new Account("hi!", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    java.lang.String str5 = account3.getPhoneNumber();
    java.lang.String str6 = account3.getEmail();
    java.lang.String str7 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    double d9 = transferAccount2.getBalance();
    java.lang.String str10 = transferAccount2.getIBAN();
    java.lang.String str11 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount12);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    java.lang.String str9 = account3.getName();
    account3.setName("");
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setName("");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getEmail();
    java.lang.String str7 = account3.getName();
    account3.setPhoneNumber("");
    java.lang.String str10 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setPhoneNumber("hi!");
    java.lang.String str15 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("");
    boolean b12 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("hi!");
    boolean b16 = transferMoneyData0.accountExists("hi!");
    boolean b18 = transferMoneyData0.accountExists("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    double d4 = transferAccount2.getBalance();
    java.lang.String str5 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)10);
    double d8 = transferAccount2.getBalance();
    java.lang.String str9 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)-1);
    java.lang.String str12 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    java.lang.String str10 = account3.getEmail();
    account3.setName("");
    java.lang.String str13 = account3.getName();
    java.lang.String str14 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness9.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setEmail("hi!");
    java.lang.String str11 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    boolean b12 = transferMoneyData0.accountExists("");
    boolean b14 = transferMoneyData0.accountExists("hi!");
    boolean b16 = transferMoneyData0.accountExists("hi!");
    boolean b18 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount20 = transferMoneyData0.getAccount("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount20);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness13.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setEmail("");
    java.lang.String str8 = account3.getName();
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("");
    java.lang.String str13 = account3.getPhoneNumber();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    account3.setName("");
    java.lang.String str12 = account3.getName();
    java.lang.String str13 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    java.lang.String str9 = account3.getName();
    java.lang.String str10 = account3.getEmail();
    account3.setName("hi!");
    java.lang.String str13 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    CreateAccountBusiness createAccountBusiness1 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness1.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account18 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness19 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness19.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account18);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str10 = account3.getPhoneNumber();
    account3.setName("hi!");
    java.lang.String str13 = account3.getEmail();
    account3.setPhoneNumber("");
    java.lang.String str16 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    CreateAccountBusiness createAccountBusiness1 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness1.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)1);
    double d6 = transferAccount2.getBalance();
    java.lang.String str7 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(short)-1);
    transferAccount2.setBalance((double)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account13);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    account3.setEmail("");
    account3.setPhoneNumber("hi!");
    java.lang.String str14 = account3.getPhoneNumber();
    account3.setPhoneNumber("hi!");
    java.lang.String str17 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("hi!");
    account3.setPhoneNumber("");
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)0L);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    double d9 = transferAccount2.getBalance();
    double d10 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)'a');
    java.lang.String str13 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account16);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setPhoneNumber("hi!");
    java.lang.String str15 = account3.getPhoneNumber();
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getEmail();
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setEmail("");
    java.lang.String str11 = account3.getName();
    java.lang.String str12 = account3.getName();
    java.lang.String str13 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness11.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    account3.setEmail("");
    account3.setPhoneNumber("hi!");
    account3.setName("hi!");
    java.lang.String str16 = account3.getName();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getEmail();
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setEmail("");
    java.lang.String str11 = account3.getName();
    java.lang.String str12 = account3.getPhoneNumber();
    java.lang.String str13 = account3.getEmail();
    java.lang.String str14 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    double d3 = transferAccount2.getBalance();
    double d4 = transferAccount2.getBalance();
    double d5 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness8.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    java.lang.String str7 = account3.getEmail();
    java.lang.String str8 = account3.getEmail();
    account3.setName("");
    java.lang.String str11 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness14 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness15 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness16 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", 0.0d);
    java.lang.String str3 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)10);
    transferAccount2.setBalance((double)(short)-1);
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setPhoneNumber("");
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(short)10);
    transferAccount2.setBalance((double)'a');
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    transferAccount2.setBalance(0.0d);
    transferAccount2.setBalance(0.0d);
    transferAccount2.setBalance((double)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 97.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("");
    boolean b16 = transferMoneyData0.accountExists("");
    boolean b18 = transferMoneyData0.accountExists("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness17 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness17.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account16);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(short)10);
    double d11 = transferAccount2.getBalance();
    double d12 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 10.0d);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness14 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account13);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setPhoneNumber("");
    java.lang.String str8 = account3.getPhoneNumber();
    java.lang.String str9 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setName("");
    java.lang.String str11 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("");
    account3.setPhoneNumber("hi!");
    java.lang.String str18 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str23 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }

    Account account3 = new Account("hi!", "hi!", "");
    account3.setName("hi!");
    account3.setEmail("");
    account3.setEmail("");
    java.lang.String str10 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(short)10);
    double d11 = transferAccount2.getBalance();
    java.lang.String str12 = transferAccount2.getIBAN();
    java.lang.String str13 = transferAccount2.getIBAN();
    java.lang.String str14 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getPhoneNumber();
    java.lang.String str12 = account3.getEmail();
    account3.setEmail("hi!");
    java.lang.String str15 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness14 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account13);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    double d3 = transferAccount2.getBalance();
    java.lang.String str4 = transferAccount2.getIBAN();
    java.lang.String str5 = transferAccount2.getIBAN();
    java.lang.String str6 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    CreateAccountBusiness createAccountBusiness1 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account3 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account3);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", 10.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness8.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("");
    boolean b8 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount16 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount18 = transferMoneyData0.getAccount("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount18);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    double d3 = transferAccount2.getBalance();
    java.lang.String str4 = transferAccount2.getIBAN();
    java.lang.String str5 = transferAccount2.getIBAN();
    java.lang.String str6 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    boolean b14 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount16 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount18 = transferMoneyData0.getAccount("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount18);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    java.lang.String str8 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)100);
    double d11 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 100.0d);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setName("");
    java.lang.String str7 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str10 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str10 = account3.getEmail();
    account3.setEmail("");
    java.lang.String str13 = account3.getName();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount12);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness15 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness15.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    account3.setEmail("");
    account3.setPhoneNumber("hi!");
    account3.setName("hi!");
    account3.setName("");
    java.lang.String str18 = account3.getName();
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness15 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness15.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness14 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness14.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness10.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setName("");
    java.lang.String str7 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    java.lang.String str10 = account3.getName();
    account3.setPhoneNumber("");
    java.lang.String str13 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness11.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness12.createAccount("hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(short)10);
    java.lang.String str11 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str14 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)100L);
    java.lang.String str17 = transferAccount2.getIBAN();
    java.lang.String str18 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(short)10);
    transferAccount2.setBalance((double)'a');
    double d5 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(-1L));
    java.lang.String str8 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 97.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str10 = account3.getEmail();
    account3.setEmail("");
    java.lang.String str13 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getPhoneNumber();
    java.lang.String str7 = account3.getEmail();
    account3.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setName("");
    account3.setEmail("");
    account3.setName("");
    account3.setEmail("");
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    boolean b14 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount16 = transferMoneyData0.getAccount("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount16);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness14 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness14.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account13);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getPhoneNumber();
    java.lang.String str12 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    java.lang.String str15 = account3.getName();
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account15 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account15);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setName("hi!");

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("hi!");
    java.lang.String str10 = account3.getPhoneNumber();
    java.lang.String str11 = account3.getEmail();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }

    // The following exception was thrown during execution in test generation
    try {
    TransferAccount transferAccount2 = new TransferAccount("", (double)(-1L));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness11.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness5 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness8.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    account3.setEmail("hi!");
    account3.setPhoneNumber("hi!");
    account3.setEmail("");
    java.lang.String str14 = account3.getEmail();
    java.lang.String str15 = account3.getEmail();
    java.lang.String str16 = account3.getName();
    java.lang.String str17 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("hi!");
    boolean b10 = transferMoneyData0.accountExists("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    account3.setPhoneNumber("");
    java.lang.String str11 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }

    Account account3 = new Account("", "", "");
    java.lang.String str4 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness11.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    java.lang.String str7 = account3.getEmail();
    account3.setEmail("");
    java.lang.String str10 = account3.getEmail();
    java.lang.String str11 = account3.getName();
    java.lang.String str12 = account3.getPhoneNumber();
    java.lang.String str13 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("");
    boolean b8 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    boolean b14 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount16 = transferMoneyData0.getAccount("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount16);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getEmail();
    account3.setEmail("hi!");
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account18 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness19 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account21 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account21);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", 0.0d);
    java.lang.String str3 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)10);
    transferAccount2.setBalance((double)(short)-1);
    java.lang.String str8 = transferAccount2.getIBAN();
    java.lang.String str9 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account18 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness19 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness20 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness20.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account18);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness7.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }

    Account account3 = new Account("", "", "");
    java.lang.String str4 = account3.getName();
    account3.setPhoneNumber("hi!");
    account3.setName("");
    account3.setEmail("hi!");
    java.lang.String str11 = account3.getPhoneNumber();
    java.lang.String str12 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness14 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    account3.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    java.lang.String str5 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    java.lang.String str8 = account3.getPhoneNumber();
    java.lang.String str9 = account3.getEmail();
    account3.setName("");
    java.lang.String str12 = account3.getName();
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)1);
    java.lang.String str6 = transferAccount2.getIBAN();
    java.lang.String str7 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account13);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setName("");
    java.lang.String str11 = account3.getEmail();
    account3.setName("hi!");
    java.lang.String str14 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    java.lang.String str7 = account3.getEmail();
    java.lang.String str8 = account3.getEmail();
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getPhoneNumber();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness11.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(short)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setEmail("hi!");
    java.lang.String str10 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness15 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness15.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setName("");
    java.lang.String str11 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("");
    java.lang.String str16 = account3.getEmail();
    java.lang.String str17 = account3.getPhoneNumber();
    java.lang.String str18 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness9.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    java.lang.String str9 = account3.getName();
    java.lang.String str10 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness15 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness16 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    boolean b6 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("hi!");
    boolean b10 = transferMoneyData0.accountExists("hi!");
    boolean b12 = transferMoneyData0.accountExists("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)1);
    double d3 = transferAccount2.getBalance();
    double d4 = transferAccount2.getBalance();
    double d5 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.0d);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getEmail();
    account3.setEmail("");
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("");
    boolean b12 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount16 = transferMoneyData0.getAccount("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount16);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness10.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    double d9 = transferAccount2.getBalance();
    java.lang.String str10 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)100);
    double d13 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)10);
    transferAccount2.setBalance((double)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 100.0d);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getPhoneNumber();
    java.lang.String str8 = account3.getEmail();
    account3.setName("");
    java.lang.String str11 = account3.getPhoneNumber();
    account3.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setPhoneNumber("");
    account3.setName("");
    java.lang.String str12 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    boolean b14 = transferMoneyData0.accountExists("hi!");
    boolean b16 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount18 = transferMoneyData0.getAccount("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount18);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)10);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    java.lang.String str5 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    java.lang.String str8 = account3.getPhoneNumber();
    java.lang.String str9 = account3.getPhoneNumber();
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getEmail();
    java.lang.String str12 = account3.getName();
    java.lang.String str13 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness15 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)10L);
    transferAccount2.setBalance((double)100.0f);
    transferAccount2.setBalance((double)1.0f);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    account3.setEmail("");
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("");
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(short)100);
    transferAccount2.setBalance((double)100L);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account15 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account17 = createAccountData0.getAccount("hi!");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account17);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setEmail("hi!");
    account3.setPhoneNumber("");
    java.lang.String str12 = account3.getPhoneNumber();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("");
    boolean b16 = transferMoneyData0.accountExists("");
    boolean b18 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount20 = transferMoneyData0.getAccount("hi!");
    boolean b22 = transferMoneyData0.accountExists("hi!");
    boolean b24 = transferMoneyData0.accountExists("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getEmail();
    account3.setEmail("");
    java.lang.String str9 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)'#');
    double d11 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 35.0d);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    account3.setName("hi!");
    account3.setEmail("");
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    transferAccount2.setBalance((double)(byte)100);
    double d9 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 100.0d);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }

    Account account3 = new Account("", "hi!", "");
    account3.setEmail("");
    account3.setName("");
    account3.setName("hi!");
    java.lang.String str10 = account3.getPhoneNumber();
    java.lang.String str11 = account3.getEmail();
    account3.setName("");
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    java.lang.String str10 = account3.getEmail();
    account3.setName("");
    account3.setEmail("hi!");
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getPhoneNumber();
    java.lang.String str12 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    java.lang.String str15 = account3.getName();
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setName("");
    java.lang.String str11 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("");
    java.lang.String str16 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    java.lang.String str19 = account3.getName();
    java.lang.String str20 = account3.getPhoneNumber();
    account3.setPhoneNumber("hi!");
    java.lang.String str23 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    java.lang.String str5 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    java.lang.String str8 = account3.getPhoneNumber();
    java.lang.String str9 = account3.getPhoneNumber();
    java.lang.String str10 = account3.getName();
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    CreateAccountBusiness createAccountBusiness1 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account3 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountData0.createAccount("", "hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account3);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    double d9 = transferAccount2.getBalance();
    java.lang.String str10 = transferAccount2.getIBAN();
    java.lang.String str11 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }

    Account account3 = new Account("hi!", "hi!", "");
    account3.setName("hi!");
    java.lang.String str6 = account3.getName();
    account3.setEmail("hi!");
    account3.setEmail("");
    java.lang.String str11 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setName("");
    account3.setEmail("");
    java.lang.String str9 = account3.getEmail();
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)'#');
    transferAccount2.setBalance((double)(short)100);
    java.lang.String str13 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)' ');
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    double d9 = transferAccount2.getBalance();
    double d10 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(-1));
    double d13 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == (-1.0d));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str10 = account3.getPhoneNumber();
    account3.setName("hi!");
    java.lang.String str13 = account3.getEmail();
    java.lang.String str14 = account3.getEmail();
    account3.setEmail("");
    java.lang.String str17 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

}
