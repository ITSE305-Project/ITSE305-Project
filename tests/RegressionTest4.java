
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test001"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getName();
    java.lang.String str6 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test002"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(-1.0f));
    double d8 = transferAccount2.getBalance();
    java.lang.String str9 = transferAccount2.getIBAN();
    double d10 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == (-1.0d));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test003"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(short)1);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test004"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    boolean b6 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
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
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test005"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)100.0f);
    java.lang.String str3 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)10);
    transferAccount2.setBalance((double)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test006"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    java.lang.String str5 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    java.lang.String str8 = account3.getPhoneNumber();
    java.lang.String str9 = account3.getEmail();
    java.lang.String str10 = account3.getPhoneNumber();
    java.lang.String str11 = account3.getPhoneNumber();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
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
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test007"); }

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

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test008"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setName("");
    account3.setEmail("hi!");
    java.lang.String str9 = account3.getPhoneNumber();
    account3.setName("hi!");
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test009"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)' ');
    double d3 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 32.0d);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test010"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getEmail();
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setEmail("");
    java.lang.String str11 = account3.getName();
    java.lang.String str12 = account3.getPhoneNumber();
    java.lang.String str13 = account3.getEmail();
    java.lang.String str14 = account3.getPhoneNumber();
    account3.setEmail("hi!");
    
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
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test011"); }

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
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness17 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account19 = createAccountData0.getAccount("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account19);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test012"); }

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

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test013"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setPhoneNumber("hi!");
    account3.setName("");
    java.lang.String str17 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test014"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setEmail("hi!");
    account3.setEmail("hi!");
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test015"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(short)10);
    java.lang.String str11 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    double d14 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)'a');
    double d17 = transferAccount2.getBalance();
    java.lang.String str18 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)'4');
    
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
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 97.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test016"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", 1.0d);
    java.lang.String str3 = transferAccount2.getIBAN();
    double d4 = transferAccount2.getBalance();
    double d5 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.0d);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test017"); }

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
    CreateAccountBusiness createAccountBusiness17 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness17.createAccount("", "", "");
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
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test018"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("");
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
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account13);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test019"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness5 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test020"); }

    Account account3 = new Account("", "hi!", "");
    account3.setEmail("");
    account3.setName("");
    java.lang.String str8 = account3.getPhoneNumber();
    java.lang.String str9 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test021"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account15 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account17 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account19 = createAccountData0.getAccount("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account19);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test022"); }

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
    account3.setEmail("");
    
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

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test023"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)' ');
    transferAccount2.setBalance((double)(short)1);
    java.lang.String str11 = transferAccount2.getIBAN();
    java.lang.String str12 = transferAccount2.getIBAN();
    java.lang.String str13 = transferAccount2.getIBAN();
    double d14 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)0L);
    double d17 = transferAccount2.getBalance();
    transferAccount2.setBalance(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test024"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)0);
    double d10 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test025"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("");
    boolean b8 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    
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
    org.junit.Assert.assertNull(transferAccount12);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test026"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(-1.0f));
    transferAccount2.setBalance(0.0d);
    
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

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test027"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
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
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test028"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setName("");
    java.lang.String str11 = account3.getEmail();
    account3.setName("hi!");
    java.lang.String str14 = account3.getEmail();
    java.lang.String str15 = account3.getEmail();
    account3.setName("hi!");
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test029"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test030"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)0);
    double d10 = transferAccount2.getBalance();
    java.lang.String str11 = transferAccount2.getIBAN();
    java.lang.String str12 = transferAccount2.getIBAN();
    java.lang.String str13 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)10);
    double d16 = transferAccount2.getBalance();
    java.lang.String str17 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test031"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
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
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test032"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getEmail();
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setEmail("");
    java.lang.String str11 = account3.getName();
    java.lang.String str12 = account3.getPhoneNumber();
    java.lang.String str13 = account3.getEmail();
    account3.setName("");
    
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

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test033"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    double d7 = transferAccount2.getBalance();
    java.lang.String str8 = transferAccount2.getIBAN();
    java.lang.String str9 = transferAccount2.getIBAN();
    double d10 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test034"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    account3.setName("hi!");
    java.lang.String str12 = account3.getName();
    account3.setPhoneNumber("");
    java.lang.String str15 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test035"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getEmail();
    java.lang.String str12 = account3.getEmail();
    java.lang.String str13 = account3.getName();
    java.lang.String str14 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test036"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness5 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("");
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
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test037"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    java.lang.String str9 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str12 = account3.getEmail();
    account3.setPhoneNumber("");
    java.lang.String str15 = account3.getPhoneNumber();
    java.lang.String str16 = account3.getPhoneNumber();
    java.lang.String str17 = account3.getEmail();
    java.lang.String str18 = account3.getPhoneNumber();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test038"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
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
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test039"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness15 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account17 = createAccountData0.getAccount("");
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
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account17);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test040"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setName("");
    java.lang.String str7 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str10 = account3.getPhoneNumber();
    account3.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test041"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness12.createAccount("hi!", "hi!", "hi!");
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
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test042"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("hi!");
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
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test043"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(short)10);
    transferAccount2.setBalance(0.0d);
    transferAccount2.setBalance((double)'#');
    transferAccount2.setBalance(10.0d);
    transferAccount2.setBalance(10.0d);
    transferAccount2.setBalance((double)0);
    double d21 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test044"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    transferAccount2.setBalance((double)(byte)100);
    transferAccount2.setBalance((double)(short)10);
    transferAccount2.setBalance((double)(-1L));
    double d13 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == (-1.0d));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test045"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    java.lang.String str9 = transferAccount2.getIBAN();
    double d10 = transferAccount2.getBalance();
    double d11 = transferAccount2.getBalance();
    java.lang.String str12 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test046"); }

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
    createAccountBusiness13.createAccount("hi!", "hi!", "hi!");
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
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test047"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
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
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test048"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
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

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test049"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setEmail("");
    java.lang.String str12 = account3.getName();
    java.lang.String str13 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test050"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)1);
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(byte)0);
    double d10 = transferAccount2.getBalance();
    transferAccount2.setBalance(10.0d);
    java.lang.String str13 = transferAccount2.getIBAN();
    java.lang.String str14 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test051"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness5 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test052"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account15 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness16 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account18 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness19 = new CreateAccountBusiness(createAccountData0);
    
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
    org.junit.Assert.assertNotNull(optional_account15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account18);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test053"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    boolean b14 = transferMoneyData0.accountExists("");
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
    org.junit.Assert.assertNull(transferAccount12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test054"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", 1.0d);
    double d3 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.0d);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test055"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getEmail();
    account3.setEmail("");
    java.lang.String str14 = account3.getPhoneNumber();
    account3.setEmail("hi!");
    java.lang.String str17 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test056"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
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
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test057"); }

    Account account3 = new Account("", "", "hi!");
    account3.setEmail("hi!");
    java.lang.String str6 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test058"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setName("");
    java.lang.String str11 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    account3.setEmail("");
    account3.setPhoneNumber("");
    account3.setName("");
    
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
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test059"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    double d4 = transferAccount2.getBalance();
    java.lang.String str5 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)10);
    double d8 = transferAccount2.getBalance();
    java.lang.String str9 = transferAccount2.getIBAN();
    double d10 = transferAccount2.getBalance();
    double d11 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)0);
    transferAccount2.setBalance((double)1L);
    transferAccount2.setBalance((double)100.0f);
    
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
    org.junit.Assert.assertTrue(d10 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test060"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
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
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test061"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setName("hi!");
    account3.setEmail("hi!");
    java.lang.String str13 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test062"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str11 = account3.getPhoneNumber();
    
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
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test063"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account15 = createAccountData0.getAccount("hi!");
    
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
    org.junit.Assert.assertNotNull(optional_account15);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test064"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness5 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness15 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness16 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account18 = createAccountData0.getAccount("");
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account18);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test065"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)' ');
    transferAccount2.setBalance(32.0d);
    transferAccount2.setBalance((double)10.0f);
    double d11 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test066"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness5 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("hi!");
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
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test067"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    java.lang.String str9 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str12 = account3.getEmail();
    account3.setPhoneNumber("");
    java.lang.String str15 = account3.getPhoneNumber();
    java.lang.String str16 = account3.getPhoneNumber();
    java.lang.String str17 = account3.getEmail();
    account3.setEmail("");
    java.lang.String str20 = account3.getName();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test068"); }

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
    createAccountBusiness17.createAccount("hi!", "hi!", "hi!");
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
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test069"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    java.lang.String str9 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str12 = account3.getEmail();
    account3.setPhoneNumber("");
    java.lang.String str15 = account3.getName();
    account3.setEmail("");
    account3.setEmail("");
    account3.setName("");
    java.lang.String str22 = account3.getName();
    java.lang.String str23 = account3.getPhoneNumber();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test070"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("hi!");
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
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test071"); }

    Account account3 = new Account("", "hi!", "");
    account3.setEmail("");
    account3.setName("");
    account3.setName("hi!");
    account3.setName("");
    java.lang.String str12 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test072"); }

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
    CreateAccountBusiness createAccountBusiness15 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account17 = createAccountData0.getAccount("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account17);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test073"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account15 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness16 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness16.createAccount("", "", "");
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
    org.junit.Assert.assertNotNull(optional_account13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account15);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test074"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setEmail("");
    account3.setName("");
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("");
    account3.setName("");

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test075"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getPhoneNumber();
    java.lang.String str11 = account3.getName();
    java.lang.String str12 = account3.getPhoneNumber();
    java.lang.String str13 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test076"); }

    Account account3 = new Account("hi!", "hi!", "");
    account3.setPhoneNumber("");
    account3.setEmail("");
    java.lang.String str8 = account3.getPhoneNumber();
    java.lang.String str9 = account3.getName();
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test077"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    boolean b6 = transferMoneyData0.accountExists("");
    boolean b8 = transferMoneyData0.accountExists("");
    boolean b10 = transferMoneyData0.accountExists("");
    boolean b12 = transferMoneyData0.accountExists("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test078"); }

    Account account3 = new Account("hi!", "", "hi!");
    account3.setEmail("hi!");
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setEmail("hi!");
    java.lang.String str9 = account3.getEmail();
    java.lang.String str10 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test079"); }

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
    double d14 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)1);
    
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
    org.junit.Assert.assertTrue(d14 == 0.0d);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test080"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)10L);
    transferAccount2.setBalance((double)1.0f);
    java.lang.String str5 = transferAccount2.getIBAN();
    transferAccount2.setBalance(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test081"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness5 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    
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
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test082"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    account3.setName("hi!");
    java.lang.String str12 = account3.getName();
    java.lang.String str13 = account3.getEmail();
    java.lang.String str14 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test083"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("hi!");
    boolean b10 = transferMoneyData0.accountExists("hi!");
    boolean b12 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount16 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount18 = transferMoneyData0.getAccount("");
    boolean b20 = transferMoneyData0.accountExists("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test084"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)'#');
    java.lang.String str11 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)1.0f);
    
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test085"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setPhoneNumber("hi!");
    account3.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test086"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    boolean b14 = transferMoneyData0.accountExists("hi!");
    boolean b16 = transferMoneyData0.accountExists("hi!");
    boolean b18 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount20 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount22 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount24 = transferMoneyData0.getAccount("hi!");
    
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
    org.junit.Assert.assertNull(transferAccount20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount24);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test087"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness14 = new CreateAccountBusiness(createAccountData0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account13);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test088"); }

    Account account3 = new Account("", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("");
    account3.setEmail("hi!");
    account3.setName("");
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test089"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("hi!");
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
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test090"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getEmail();
    account3.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test091"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)' ');
    double d7 = transferAccount2.getBalance();
    java.lang.String str8 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)10);
    transferAccount2.setBalance((double)(byte)100);
    double d13 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 100.0d);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test092"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("");
    boolean b12 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("hi!");
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
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount18);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test093"); }

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
    java.lang.String str17 = account3.getName();
    account3.setName("");
    java.lang.String str20 = account3.getEmail();
    account3.setPhoneNumber("hi!");
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test094"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    double d4 = transferAccount2.getBalance();
    java.lang.String str5 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)10);
    java.lang.String str8 = transferAccount2.getIBAN();
    java.lang.String str9 = transferAccount2.getIBAN();
    java.lang.String str10 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test095"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(short)10);
    transferAccount2.setBalance(1.0d);
    double d13 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 1.0d);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test096"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("hi!");
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
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account13);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test097"); }

    Account account3 = new Account("", "", "hi!");
    account3.setPhoneNumber("hi!");
    account3.setEmail("");

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test098"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    account3.setPhoneNumber("hi!");
    account3.setEmail("hi!");
    java.lang.String str14 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test099"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)' ');
    double d10 = transferAccount2.getBalance();
    java.lang.String str11 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(-1L));
    transferAccount2.setBalance((double)(short)10);
    
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
    org.junit.Assert.assertTrue(d10 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test100"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    java.lang.String str8 = transferAccount2.getIBAN();
    double d9 = transferAccount2.getBalance();
    java.lang.String str10 = transferAccount2.getIBAN();
    java.lang.String str11 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)1);
    double d14 = transferAccount2.getBalance();
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 1.0d);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test101"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
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
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test102"); }

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
    CreateAccountBusiness createAccountBusiness18 = new CreateAccountBusiness(createAccountData0);
    
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
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test103"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account15 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account17 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness18 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness18.createAccount("hi!", "", "");
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account17);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test104"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account15 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account17 = createAccountData0.getAccount("hi!");
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
    org.junit.Assert.assertNotNull(optional_account15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account17);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test105"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getName();
    account3.setEmail("");
    java.lang.String str13 = account3.getEmail();
    account3.setPhoneNumber("");
    account3.setName("hi!");
    java.lang.String str18 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test106"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    double d9 = transferAccount2.getBalance();
    double d10 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(byte)10);
    java.lang.String str13 = transferAccount2.getIBAN();
    transferAccount2.setBalance(97.0d);
    java.lang.String str16 = transferAccount2.getIBAN();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test107"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setEmail("hi!");
    account3.setEmail("hi!");
    account3.setPhoneNumber("");
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test108"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getEmail();
    account3.setEmail("");
    java.lang.String str9 = account3.getName();
    account3.setEmail("");
    java.lang.String str12 = account3.getEmail();
    java.lang.String str13 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test109"); }

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
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness17 = new CreateAccountBusiness(createAccountData0);
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
    org.junit.Assert.assertNotNull(optional_account11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account16);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test110"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)10.0f);
    double d3 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 10.0d);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test111"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)' ');
    transferAccount2.setBalance((double)(short)1);
    java.lang.String str11 = transferAccount2.getIBAN();
    double d12 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 1.0d);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test112"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
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
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test113"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    boolean b2 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("");
    boolean b12 = transferMoneyData0.accountExists("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test114"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)' ');
    double d10 = transferAccount2.getBalance();
    double d11 = transferAccount2.getBalance();
    transferAccount2.setBalance((-1.0d));
    
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
    org.junit.Assert.assertTrue(d10 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 32.0d);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test115"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("");
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
    org.junit.Assert.assertNotNull(optional_account14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account16);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test116"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test117"); }

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
    createAccountBusiness12.createAccount("hi!", "", "");
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
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test118"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account15 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account17 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account19 = createAccountData0.getAccount("");
    
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
    org.junit.Assert.assertNotNull(optional_account15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account19);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test119"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    CreateAccountBusiness createAccountBusiness1 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account3 = createAccountData0.getAccount("");
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
    org.junit.Assert.assertNotNull(optional_account3);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test120"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    java.lang.String str9 = account3.getPhoneNumber();
    java.lang.String str10 = account3.getName();
    account3.setName("hi!");
    java.lang.String str13 = account3.getName();
    account3.setEmail("hi!");
    
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
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test121"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getEmail();
    account3.setEmail("");
    account3.setName("hi!");
    account3.setName("");
    java.lang.String str18 = account3.getPhoneNumber();
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test122"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account16);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test123"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setName("");
    java.lang.String str7 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setEmail("");
    account3.setName("");
    java.lang.String str14 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test124"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account15 = createAccountData0.getAccount("");
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
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account15);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test125"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(-1.0f));
    java.lang.String str8 = transferAccount2.getIBAN();
    transferAccount2.setBalance(0.0d);
    transferAccount2.setBalance((double)10);
    double d13 = transferAccount2.getBalance();
    transferAccount2.setBalance(35.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 10.0d);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test126"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    java.lang.String str10 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    account3.setName("hi!");
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test127"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test128"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account15 = createAccountData0.getAccount("");
    
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
    org.junit.Assert.assertNotNull(optional_account15);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test129"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", 0.0d);
    transferAccount2.setBalance(0.0d);
    transferAccount2.setBalance((double)'#');
    transferAccount2.setBalance(32.0d);
    java.lang.String str9 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test130"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setPhoneNumber("");
    java.lang.String str10 = account3.getPhoneNumber();
    java.lang.String str11 = account3.getName();
    java.lang.String str12 = account3.getEmail();
    java.lang.String str13 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test131"); }

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
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account13);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test132"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getEmail();
    java.lang.String str12 = account3.getPhoneNumber();
    account3.setEmail("hi!");
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("");
    account3.setEmail("");
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test133"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)100);
    double d3 = transferAccount2.getBalance();
    double d4 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)100.0f);
    double d7 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 100.0d);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test134"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(byte)100);
    double d11 = transferAccount2.getBalance();
    double d12 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 100.0d);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test135"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setEmail("hi!");
    account3.setPhoneNumber("hi!");
    java.lang.String str12 = account3.getPhoneNumber();
    java.lang.String str13 = account3.getName();
    account3.setPhoneNumber("");
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test136"); }

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
    account3.setName("");
    java.lang.String str21 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test137"); }

    Account account3 = new Account("", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("");
    account3.setEmail("hi!");
    account3.setName("");
    account3.setPhoneNumber("");
    java.lang.String str13 = account3.getEmail();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test138"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)' ');
    double d10 = transferAccount2.getBalance();
    java.lang.String str11 = transferAccount2.getIBAN();
    transferAccount2.setBalance(52.0d);
    double d14 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(byte)10);
    
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
    org.junit.Assert.assertTrue(d10 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 52.0d);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test139"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    java.lang.String str8 = transferAccount2.getIBAN();
    java.lang.String str9 = transferAccount2.getIBAN();
    double d10 = transferAccount2.getBalance();
    java.lang.String str11 = transferAccount2.getIBAN();
    java.lang.String str12 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test140"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    boolean b6 = transferMoneyData0.accountExists("");
    boolean b8 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    boolean b14 = transferMoneyData0.accountExists("");
    boolean b16 = transferMoneyData0.accountExists("hi!");
    boolean b18 = transferMoneyData0.accountExists("");
    
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
    org.junit.Assert.assertNull(transferAccount12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test141"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness14 = new CreateAccountBusiness(createAccountData0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account13);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test142"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    account3.setName("hi!");
    java.lang.String str12 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test143"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getPhoneNumber();
    java.lang.String str8 = account3.getEmail();
    account3.setName("");
    account3.setEmail("");
    account3.setName("hi!");
    java.lang.String str15 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test144"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("hi!");
    account3.setPhoneNumber("");
    account3.setEmail("");
    java.lang.String str14 = account3.getPhoneNumber();
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test145"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", 100.0d);
    double d3 = transferAccount2.getBalance();
    double d4 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 100.0d);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test146"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setEmail("");
    java.lang.String str8 = account3.getName();
    account3.setPhoneNumber("hi!");
    account3.setName("hi!");
    java.lang.String str13 = account3.getName();
    account3.setPhoneNumber("");
    java.lang.String str16 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test147"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setEmail("");
    java.lang.String str12 = account3.getName();
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test148"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    double d4 = transferAccount2.getBalance();
    java.lang.String str5 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)10);
    java.lang.String str8 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)'4');
    transferAccount2.setBalance((double)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test149"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness14 = new CreateAccountBusiness(createAccountData0);
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
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account13);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test150"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account18 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness19 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account21 = createAccountData0.getAccount("");
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
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test151"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    double d4 = transferAccount2.getBalance();
    java.lang.String str5 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)10);
    double d8 = transferAccount2.getBalance();
    java.lang.String str9 = transferAccount2.getIBAN();
    double d10 = transferAccount2.getBalance();
    double d11 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)10L);
    transferAccount2.setBalance(0.0d);
    
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
    org.junit.Assert.assertTrue(d10 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test152"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("");
    boolean b12 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("");
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
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount18);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test153"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("hi!");
    boolean b10 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    boolean b14 = transferMoneyData0.accountExists("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test154"); }

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
    account3.setName("");
    
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

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test155"); }

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
    java.util.Optional<Account> optional_account23 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account25 = createAccountData0.getAccount("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account25);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test156"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    account3.setEmail("hi!");
    account3.setPhoneNumber("hi!");
    account3.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test157"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    java.lang.String str9 = account3.getName();
    java.lang.String str10 = account3.getEmail();
    account3.setPhoneNumber("");
    java.lang.String str13 = account3.getEmail();
    account3.setName("hi!");
    account3.setPhoneNumber("hi!");
    account3.setName("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test158"); }

    Account account3 = new Account("", "", "hi!");
    account3.setPhoneNumber("hi!");
    java.lang.String str6 = account3.getEmail();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test159"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getEmail();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getEmail();
    account3.setEmail("hi!");
    java.lang.String str10 = account3.getEmail();
    account3.setName("");
    java.lang.String str13 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test160"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setName("hi!");
    java.lang.String str11 = account3.getEmail();
    java.lang.String str12 = account3.getEmail();
    account3.setName("hi!");
    java.lang.String str15 = account3.getPhoneNumber();
    java.lang.String str16 = account3.getName();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test161"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    java.lang.String str7 = account3.getEmail();
    java.lang.String str8 = account3.getEmail();
    account3.setPhoneNumber("hi!");
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
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test162"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    transferAccount2.setBalance((double)1);
    double d5 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(byte)0);
    java.lang.String str8 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test163"); }

    Account account3 = new Account("hi!", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getName();
    account3.setName("");
    java.lang.String str8 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test164"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getPhoneNumber();
    java.lang.String str12 = account3.getEmail();
    account3.setEmail("hi!");
    account3.setPhoneNumber("hi!");
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

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test165"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    account3.setPhoneNumber("");
    java.lang.String str11 = account3.getName();
    java.lang.String str12 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test166"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setName("hi!");
    java.lang.String str11 = account3.getEmail();
    java.lang.String str12 = account3.getEmail();
    account3.setName("hi!");
    java.lang.String str15 = account3.getPhoneNumber();
    java.lang.String str16 = account3.getPhoneNumber();
    java.lang.String str17 = account3.getName();
    account3.setEmail("");
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test167"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    account3.setEmail("hi!");
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test168"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setPhoneNumber("");
    java.lang.String str10 = account3.getPhoneNumber();
    java.lang.String str11 = account3.getName();
    account3.setName("");
    java.lang.String str14 = account3.getName();
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test169"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    boolean b14 = transferMoneyData0.accountExists("hi!");
    boolean b16 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount18 = transferMoneyData0.getAccount("");
    boolean b20 = transferMoneyData0.accountExists("");
    boolean b22 = transferMoneyData0.accountExists("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test170"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    double d9 = transferAccount2.getBalance();
    double d10 = transferAccount2.getBalance();
    transferAccount2.setBalance(1.0d);
    
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

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test171"); }

    Account account3 = new Account("hi!", "hi!", "");
    account3.setPhoneNumber("");
    account3.setEmail("");
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setName("");
    account3.setName("");
    account3.setEmail("");
    java.lang.String str15 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test172"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    java.lang.String str9 = account3.getName();
    java.lang.String str10 = account3.getEmail();
    java.lang.String str11 = account3.getEmail();
    java.lang.String str12 = account3.getEmail();
    
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test173"); }

    Account account3 = new Account("", "", "");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    java.lang.String str8 = account3.getPhoneNumber();
    java.lang.String str9 = account3.getEmail();
    
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
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test174"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
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
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test175"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test176"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str10 = account3.getPhoneNumber();
    account3.setName("hi!");
    java.lang.String str13 = account3.getEmail();
    account3.setPhoneNumber("");
    java.lang.String str16 = account3.getName();
    java.lang.String str17 = account3.getPhoneNumber();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test177"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness14 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account18 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account20 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account22 = createAccountData0.getAccount("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account22);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test178"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getPhoneNumber();
    java.lang.String str12 = account3.getPhoneNumber();
    account3.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test179"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    java.lang.String str10 = account3.getEmail();
    account3.setEmail("hi!");
    java.lang.String str13 = account3.getEmail();
    account3.setPhoneNumber("");
    account3.setPhoneNumber("");
    
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
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test180"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setPhoneNumber("hi!");
    account3.setEmail("");
    account3.setName("");
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test181"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test182"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("");
    boolean b14 = transferMoneyData0.accountExists("");
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
    org.junit.Assert.assertNull(transferAccount12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount16);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test183"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    java.lang.String str5 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setName("hi!");
    java.lang.String str10 = account3.getPhoneNumber();
    java.lang.String str11 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test184"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account15 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account17 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness18 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness18.createAccount("", "hi!", "");
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account17);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test185"); }

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
    java.lang.String str17 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str20 = account3.getName();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test186"); }

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
    java.util.Optional<Account> optional_account20 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness21 = new CreateAccountBusiness(createAccountData0);
    
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
    org.junit.Assert.assertNotNull(optional_account20);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test187"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("");
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
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account13);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test188"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    boolean b6 = transferMoneyData0.accountExists("");
    boolean b8 = transferMoneyData0.accountExists("");
    boolean b10 = transferMoneyData0.accountExists("hi!");
    boolean b12 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("hi!");
    boolean b16 = transferMoneyData0.accountExists("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
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
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test189"); }

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
    CreateAccountBusiness createAccountBusiness18 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness18.createAccount("", "hi!", "");
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
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test190"); }

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
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account18 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account20 = createAccountData0.getAccount("hi!");
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
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account20);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test191"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness14 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("hi!");
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
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account16);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test192"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setName("");
    java.lang.String str11 = account3.getEmail();
    account3.setName("hi!");
    account3.setEmail("");
    java.lang.String str16 = account3.getPhoneNumber();
    
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
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test193"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setEmail("hi!");
    java.lang.String str6 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test194"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)0);
    transferAccount2.setBalance((double)(-1));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test195"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("");
    boolean b8 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    boolean b14 = transferMoneyData0.accountExists("hi!");
    boolean b16 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount18 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount20 = transferMoneyData0.getAccount("");
    boolean b22 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount24 = transferMoneyData0.getAccount("hi!");
    
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
    org.junit.Assert.assertNull(transferAccount12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount24);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test196"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    double d9 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)100L);
    
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

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test197"); }

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
    java.lang.String str12 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test198"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)1);
    double d3 = transferAccount2.getBalance();
    java.lang.String str4 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test199"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness14 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness14.createAccount("hi!", "hi!", "");
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
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test200"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getPhoneNumber();
    account3.setName("");
    java.lang.String str8 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test201"); }

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
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness17 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account19 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account21 = createAccountData0.getAccount("hi!");
    
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
    org.junit.Assert.assertNotNull(optional_account16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account21);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test202"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    account3.setPhoneNumber("hi!");
    java.lang.String str12 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test203"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setName("");
    account3.setEmail("");
    java.lang.String str9 = account3.getEmail();
    account3.setEmail("hi!");
    account3.setPhoneNumber("");
    java.lang.String str14 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test204"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)' ');
    double d10 = transferAccount2.getBalance();
    java.lang.String str11 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(-1L));
    java.lang.String str14 = transferAccount2.getIBAN();
    transferAccount2.setBalance(32.0d);
    
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
    org.junit.Assert.assertTrue(d10 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test205"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)' ');
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    java.lang.String str9 = transferAccount2.getIBAN();
    java.lang.String str10 = transferAccount2.getIBAN();
    java.lang.String str11 = transferAccount2.getIBAN();
    double d12 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 32.0d);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test206"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getPhoneNumber();
    java.lang.String str7 = account3.getEmail();
    java.lang.String str8 = account3.getEmail();
    account3.setPhoneNumber("");
    java.lang.String str11 = account3.getName();
    account3.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test207"); }

    Account account3 = new Account("hi!", "hi!", "");
    account3.setPhoneNumber("");
    account3.setEmail("");
    java.lang.String str8 = account3.getPhoneNumber();
    java.lang.String str9 = account3.getPhoneNumber();
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getName();
    account3.setEmail("");
    account3.setName("hi!");
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test208"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    java.lang.String str9 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str12 = account3.getEmail();
    account3.setEmail("");
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("");
    java.lang.String str19 = account3.getName();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test209"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("");
    boolean b8 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    boolean b14 = transferMoneyData0.accountExists("hi!");
    boolean b16 = transferMoneyData0.accountExists("");
    boolean b18 = transferMoneyData0.accountExists("");
    boolean b20 = transferMoneyData0.accountExists("hi!");
    
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
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test210"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    java.lang.String str5 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    java.lang.String str8 = account3.getPhoneNumber();
    java.lang.String str9 = account3.getPhoneNumber();
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getEmail();
    java.lang.String str12 = account3.getName();
    account3.setPhoneNumber("");
    account3.setName("");
    java.lang.String str17 = account3.getEmail();
    account3.setEmail("");
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test211"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    double d9 = transferAccount2.getBalance();
    transferAccount2.setBalance(0.0d);
    double d12 = transferAccount2.getBalance();
    
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
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test212"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)1);
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)0);
    double d10 = transferAccount2.getBalance();
    java.lang.String str11 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test213"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("");
    boolean b12 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount16 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount18 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount20 = transferMoneyData0.getAccount("hi!");
    boolean b22 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount24 = transferMoneyData0.getAccount("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount24);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test214"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
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
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test215"); }

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
    java.lang.String str14 = transferAccount2.getIBAN();
    java.lang.String str15 = transferAccount2.getIBAN();
    double d16 = transferAccount2.getBalance();
    double d17 = transferAccount2.getBalance();
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test216"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
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
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test217"); }

    Account account3 = new Account("hi!", "", "hi!");
    account3.setPhoneNumber("hi!");
    java.lang.String str6 = account3.getPhoneNumber();
    java.lang.String str7 = account3.getName();
    account3.setName("");
    account3.setEmail("hi!");
    account3.setEmail("hi!");
    java.lang.String str14 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test218"); }

    Account account3 = new Account("hi!", "hi!", "");
    account3.setPhoneNumber("");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test219"); }

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
    account3.setPhoneNumber("");
    
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
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test220"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setEmail("");
    account3.setName("");
    java.lang.String str10 = account3.getEmail();
    account3.setEmail("hi!");
    account3.setName("");
    java.lang.String str15 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test221"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    java.lang.String str9 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str12 = account3.getEmail();
    account3.setPhoneNumber("");
    java.lang.String str15 = account3.getName();
    java.lang.String str16 = account3.getName();
    account3.setEmail("");
    account3.setEmail("");
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test222"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account18 = createAccountData0.getAccount("hi!");
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account18);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test223"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness14 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness14.createAccount("hi!", "", "");
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
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test224"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)1);
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)0);
    transferAccount2.setBalance((double)1L);
    transferAccount2.setBalance((double)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.0d);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test225"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)0.0f);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    java.lang.String str5 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test226"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getPhoneNumber();
    java.lang.String str8 = account3.getEmail();
    account3.setName("");
    account3.setPhoneNumber("");
    java.lang.String str13 = account3.getPhoneNumber();
    account3.setName("hi!");
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test227"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setName("");
    java.lang.String str7 = account3.getPhoneNumber();
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test228"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    java.lang.String str10 = account3.getEmail();
    account3.setEmail("hi!");
    account3.setName("");
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test229"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    boolean b14 = transferMoneyData0.accountExists("hi!");
    boolean b16 = transferMoneyData0.accountExists("hi!");
    boolean b18 = transferMoneyData0.accountExists("hi!");
    boolean b20 = transferMoneyData0.accountExists("hi!");
    boolean b22 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount24 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount26 = transferMoneyData0.getAccount("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount26);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test230"); }

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
    java.util.Optional<Account> optional_account17 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account19 = createAccountData0.getAccount("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account19);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test231"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setEmail("");
    java.lang.String str8 = account3.getName();
    account3.setPhoneNumber("hi!");
    account3.setEmail("");
    account3.setPhoneNumber("hi!");
    java.lang.String str15 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test232"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test233"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setName("hi!");
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test234"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getEmail();
    account3.setEmail("");
    account3.setName("");
    java.lang.String str16 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test235"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getPhoneNumber();
    account3.setEmail("");
    account3.setEmail("hi!");
    java.lang.String str10 = account3.getName();
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test236"); }

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
    transferAccount2.setBalance((double)(short)1);
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
    org.junit.Assert.assertTrue(d11 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test237"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)0.0f);
    transferAccount2.setBalance((double)'a');
    transferAccount2.setBalance((double)(-1L));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test238"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)100);
    java.lang.String str11 = transferAccount2.getIBAN();
    java.lang.String str12 = transferAccount2.getIBAN();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test239"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)' ');
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    double d9 = transferAccount2.getBalance();
    java.lang.String str10 = transferAccount2.getIBAN();
    java.lang.String str11 = transferAccount2.getIBAN();
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test240"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)10L);
    transferAccount2.setBalance((double)1.0f);
    transferAccount2.setBalance((double)0L);
    transferAccount2.setBalance(0.0d);
    transferAccount2.setBalance((double)'a');
    transferAccount2.setBalance(0.0d);
    java.lang.String str13 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test241"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", 0.0d);
    java.lang.String str3 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)10);
    transferAccount2.setBalance((double)(short)-1);
    java.lang.String str8 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(short)100);
    java.lang.String str11 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)100);
    double d14 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 100.0d);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test242"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
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
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test243"); }

    Account account3 = new Account("", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("");
    account3.setEmail("hi!");
    account3.setName("");
    account3.setPhoneNumber("");
    java.lang.String str13 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test244"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(-1.0f));
    java.lang.String str8 = transferAccount2.getIBAN();
    transferAccount2.setBalance(32.0d);
    transferAccount2.setBalance((double)0);
    java.lang.String str13 = transferAccount2.getIBAN();
    java.lang.String str14 = transferAccount2.getIBAN();
    double d15 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test245"); }

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
    java.lang.String str16 = account3.getName();
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test246"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)0.0f);
    java.lang.String str3 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)'a');
    double d6 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 97.0d);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test247"); }

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
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness17 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account19 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness20 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness21 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness21.createAccount("hi!", "hi!", "hi!");
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
    org.junit.Assert.assertNotNull(optional_account16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account19);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test248"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("hi!");
    boolean b8 = transferMoneyData0.accountExists("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test249"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getEmail();
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setEmail("");
    account3.setName("hi!");
    java.lang.String str13 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test250"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setName("");
    java.lang.String str11 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    account3.setEmail("");
    java.lang.String str16 = account3.getName();
    java.lang.String str17 = account3.getName();
    
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

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test251"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    java.lang.String str10 = account3.getEmail();
    java.lang.String str11 = account3.getPhoneNumber();
    account3.setName("hi!");
    
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
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test252"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    java.lang.String str9 = transferAccount2.getIBAN();
    java.lang.String str10 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test253"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setEmail("");
    java.lang.String str8 = account3.getName();
    account3.setName("");
    java.lang.String str11 = account3.getEmail();
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test254"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    boolean b12 = transferMoneyData0.accountExists("");
    boolean b14 = transferMoneyData0.accountExists("hi!");
    boolean b16 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount18 = transferMoneyData0.getAccount("");
    boolean b20 = transferMoneyData0.accountExists("hi!");
    boolean b22 = transferMoneyData0.accountExists("");
    
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
    org.junit.Assert.assertNull(transferAccount18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test255"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    java.lang.String str5 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setName("hi!");
    java.lang.String str10 = account3.getPhoneNumber();
    account3.setName("hi!");
    java.lang.String str13 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test256"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(short)10);
    transferAccount2.setBalance(0.0d);
    transferAccount2.setBalance((double)'#');
    transferAccount2.setBalance(10.0d);
    java.lang.String str17 = transferAccount2.getIBAN();
    transferAccount2.setBalance(0.0d);
    java.lang.String str20 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test257"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test258"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str10 = account3.getPhoneNumber();
    account3.setName("hi!");
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test259"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    java.lang.String str13 = account3.getPhoneNumber();
    java.lang.String str14 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test260"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)100);
    transferAccount2.setBalance(32.0d);
    transferAccount2.setBalance((double)100);
    double d7 = transferAccount2.getBalance();
    java.lang.String str8 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(short)100);
    java.lang.String str11 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test261"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setName("hi!");
    java.lang.String str11 = account3.getName();
    java.lang.String str12 = account3.getEmail();
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test262"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setPhoneNumber("hi!");
    java.lang.String str10 = account3.getEmail();
    java.lang.String str11 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test263"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    transferAccount2.setBalance((double)(byte)100);
    transferAccount2.setBalance((double)(short)10);
    transferAccount2.setBalance((double)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test264"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(-1.0f));
    java.lang.String str8 = transferAccount2.getIBAN();
    java.lang.String str9 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)100);
    java.lang.String str12 = transferAccount2.getIBAN();
    double d13 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 100.0d);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test265"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)10L);
    double d3 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(-1));
    double d6 = transferAccount2.getBalance();
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    java.lang.String str9 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test266"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    java.lang.String str9 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str12 = account3.getEmail();
    account3.setEmail("");
    account3.setPhoneNumber("");
    account3.setEmail("hi!");
    java.lang.String str19 = account3.getEmail();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test267"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness5 = new CreateAccountBusiness(createAccountData0);
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

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test268"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    boolean b8 = transferMoneyData0.accountExists("");
    boolean b10 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("hi!");
    boolean b16 = transferMoneyData0.accountExists("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test269"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    java.lang.String str9 = account3.getName();
    account3.setName("");
    account3.setEmail("hi!");
    
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
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test270"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
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
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test271"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("hi!");
    boolean b10 = transferMoneyData0.accountExists("");
    boolean b12 = transferMoneyData0.accountExists("");
    boolean b14 = transferMoneyData0.accountExists("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test272"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("hi!");
    account3.setPhoneNumber("");
    account3.setEmail("");
    account3.setName("hi!");
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test273"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test274"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("hi!");
    boolean b16 = transferMoneyData0.accountExists("");
    boolean b18 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount20 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount22 = transferMoneyData0.getAccount("hi!");
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
    org.junit.Assert.assertNull(transferAccount22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test275"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    double d9 = transferAccount2.getBalance();
    double d10 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(byte)10);
    java.lang.String str13 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)1L);
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
    org.junit.Assert.assertTrue(d10 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test276"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(short)10);
    transferAccount2.setBalance((double)'a');
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    transferAccount2.setBalance(0.0d);
    transferAccount2.setBalance(0.0d);
    transferAccount2.setBalance((double)10L);
    transferAccount2.setBalance((double)' ');
    double d15 = transferAccount2.getBalance();
    double d16 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 97.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 32.0d);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test277"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    account3.setEmail("");
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("");
    account3.setName("hi!");
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test278"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    account3.setPhoneNumber("");
    account3.setEmail("hi!");
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test279"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setName("");
    java.lang.String str10 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test280"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    java.lang.String str7 = account3.getEmail();
    account3.setEmail("");
    java.lang.String str10 = account3.getEmail();
    java.lang.String str11 = account3.getName();
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test281"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setEmail("");
    account3.setName("");
    account3.setPhoneNumber("");
    account3.setName("hi!");
    java.lang.String str14 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test282"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getPhoneNumber();
    java.lang.String str5 = account3.getPhoneNumber();
    java.lang.String str6 = account3.getName();
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test283"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", 0.0d);
    transferAccount2.setBalance(0.0d);
    transferAccount2.setBalance((double)'#');
    transferAccount2.setBalance(1.0d);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test284"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setEmail("");
    java.lang.String str8 = account3.getName();
    account3.setPhoneNumber("");
    account3.setName("hi!");
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test285"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setName("");
    account3.setEmail("hi!");
    java.lang.String str9 = account3.getPhoneNumber();
    account3.setEmail("hi!");
    java.lang.String str12 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test286"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getPhoneNumber();
    account3.setName("hi!");
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test287"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    boolean b6 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test288"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setEmail("");
    java.lang.String str8 = account3.getName();
    account3.setPhoneNumber("hi!");
    account3.setEmail("");
    account3.setEmail("hi!");
    account3.setEmail("hi!");
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test289"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness14 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account18 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness19 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account21 = createAccountData0.getAccount("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account21);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test290"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
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
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test291"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    account3.setName("hi!");
    account3.setEmail("");
    account3.setEmail("");
    java.lang.String str16 = account3.getEmail();
    java.lang.String str17 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test292"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness17 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account19 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account21 = createAccountData0.getAccount("");
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account21);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test293"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)0);
    double d10 = transferAccount2.getBalance();
    java.lang.String str11 = transferAccount2.getIBAN();
    double d12 = transferAccount2.getBalance();
    double d13 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test294"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setEmail("");
    account3.setName("");
    account3.setPhoneNumber("hi!");
    java.lang.String str12 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test295"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
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

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test296"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)' ');
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    java.lang.String str9 = transferAccount2.getIBAN();
    java.lang.String str10 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test297"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setEmail("hi!");
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setName("");
    account3.setEmail("hi!");
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test298"); }

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
    createAccountBusiness10.createAccount("", "hi!", "hi!");
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
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test299"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", 0.0d);
    java.lang.String str3 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)10);
    double d6 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test300"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getPhoneNumber();
    java.lang.String str7 = account3.getEmail();
    java.lang.String str8 = account3.getEmail();
    account3.setEmail("");
    java.lang.String str11 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test301"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getEmail();
    account3.setEmail("");
    account3.setName("");
    java.lang.String str11 = account3.getName();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test302"); }

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
    java.util.Optional<Account> optional_account17 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account19 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness20 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness21 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account23 = createAccountData0.getAccount("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account23);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test303"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setName("");
    account3.setEmail("hi!");
    java.lang.String str9 = account3.getPhoneNumber();
    account3.setName("hi!");
    account3.setPhoneNumber("");
    account3.setName("hi!");
    account3.setEmail("hi!");
    account3.setEmail("");
    account3.setEmail("hi!");
    java.lang.String str22 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test304"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    java.lang.String str10 = account3.getEmail();
    account3.setName("");
    java.lang.String str13 = account3.getName();
    java.lang.String str14 = account3.getEmail();
    java.lang.String str15 = account3.getName();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test305"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)' ');
    transferAccount2.setBalance((double)(short)1);
    java.lang.String str11 = transferAccount2.getIBAN();
    java.lang.String str12 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)' ');
    java.lang.String str15 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test306"); }

    Account account3 = new Account("hi!", "", "hi!");
    account3.setPhoneNumber("hi!");
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setPhoneNumber("hi!");
    java.lang.String str11 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test307"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str12 = account3.getEmail();
    java.lang.String str13 = account3.getPhoneNumber();
    account3.setEmail("");
    java.lang.String str16 = account3.getName();
    java.lang.String str17 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test308"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    boolean b8 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    
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
    org.junit.Assert.assertNull(transferAccount12);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test309"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    boolean b14 = transferMoneyData0.accountExists("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test310"); }

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
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test311"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getEmail();
    account3.setName("hi!");
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test312"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("hi!");
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
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test313"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    boolean b12 = transferMoneyData0.accountExists("");
    boolean b14 = transferMoneyData0.accountExists("hi!");
    boolean b16 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount18 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount20 = transferMoneyData0.getAccount("");
    
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
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount20);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test314"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getEmail();
    java.lang.String str12 = account3.getEmail();
    java.lang.String str13 = account3.getEmail();
    java.lang.String str14 = account3.getName();
    java.lang.String str15 = account3.getEmail();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test315"); }

    CreateAccountData createAccountData0 = null;
    CreateAccountBusiness createAccountBusiness1 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness1.createAccount("", "", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test316"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
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

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test317"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getPhoneNumber();
    account3.setName("hi!");
    java.lang.String str14 = account3.getPhoneNumber();
    account3.setName("");
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test318"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("hi!");
    
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
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test319"); }

    Account account3 = new Account("hi!", "", "hi!");
    account3.setPhoneNumber("hi!");
    java.lang.String str6 = account3.getPhoneNumber();
    java.lang.String str7 = account3.getName();
    account3.setName("");
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test320"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", 100.0d);
    java.lang.String str3 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test321"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getPhoneNumber();
    java.lang.String str5 = account3.getPhoneNumber();
    java.lang.String str6 = account3.getName();
    java.lang.String str7 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test322"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getName();
    account3.setPhoneNumber("");
    account3.setPhoneNumber("");
    java.lang.String str11 = account3.getPhoneNumber();
    java.lang.String str12 = account3.getName();
    account3.setName("");
    account3.setName("hi!");
    java.lang.String str17 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test323"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness13.createAccount("", "", "");
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
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test324"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
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
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test325"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(short)100);
    transferAccount2.setBalance((double)(short)1);
    transferAccount2.setBalance((double)'4');
    java.lang.String str10 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test326"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(short)10);
    java.lang.String str11 = transferAccount2.getIBAN();
    double d12 = transferAccount2.getBalance();
    double d13 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)10);
    
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
    org.junit.Assert.assertTrue(d12 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 10.0d);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test327"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    account3.setName("hi!");
    java.lang.String str12 = account3.getName();
    account3.setPhoneNumber("");
    account3.setPhoneNumber("hi!");
    account3.setName("hi!");
    java.lang.String str19 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test328"); }

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
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test329"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("");
    boolean b8 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount16 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount18 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount20 = transferMoneyData0.getAccount("hi!");
    boolean b22 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount24 = transferMoneyData0.getAccount("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount24);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test330"); }

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
    transferAccount2.setBalance(1.0d);
    transferAccount2.setBalance((double)(short)-1);
    transferAccount2.setBalance(10.0d);
    java.lang.String str20 = transferAccount2.getIBAN();
    double d21 = transferAccount2.getBalance();
    java.lang.String str22 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test331"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    java.lang.String str8 = transferAccount2.getIBAN();
    java.lang.String str9 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(-1.0f));
    double d12 = transferAccount2.getBalance();
    
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
    org.junit.Assert.assertTrue(d12 == (-1.0d));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test332"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    java.lang.String str9 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str12 = account3.getPhoneNumber();
    account3.setName("");
    java.lang.String str15 = account3.getEmail();
    java.lang.String str16 = account3.getName();
    java.lang.String str17 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test333"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
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
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test334"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", 0.0d);
    transferAccount2.setBalance(0.0d);
    double d5 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test335"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setName("");
    java.lang.String str11 = account3.getEmail();
    java.lang.String str12 = account3.getEmail();
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test336"); }

    Account account3 = new Account("hi!", "", "hi!");
    account3.setPhoneNumber("hi!");
    java.lang.String str6 = account3.getPhoneNumber();
    java.lang.String str7 = account3.getName();
    account3.setName("");
    account3.setEmail("");
    java.lang.String str12 = account3.getName();
    java.lang.String str13 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test337"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    account3.setName("hi!");
    account3.setName("");
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test338"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
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
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test339"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    boolean b6 = transferMoneyData0.accountExists("");
    boolean b8 = transferMoneyData0.accountExists("");
    boolean b10 = transferMoneyData0.accountExists("");
    boolean b12 = transferMoneyData0.accountExists("");
    boolean b14 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount16 = transferMoneyData0.getAccount("hi!");
    boolean b18 = transferMoneyData0.accountExists("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test340"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    boolean b12 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("hi!");
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
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount16);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test341"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
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
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test342"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("");
    boolean b8 = transferMoneyData0.accountExists("");
    boolean b10 = transferMoneyData0.accountExists("hi!");
    boolean b12 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount14);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test343"); }

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
    transferAccount2.setBalance(1.0d);
    transferAccount2.setBalance((double)(short)-1);
    transferAccount2.setBalance((double)(byte)100);
    double d20 = transferAccount2.getBalance();
    double d21 = transferAccount2.getBalance();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 100.0d);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test344"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness17 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account19 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness20 = new CreateAccountBusiness(createAccountData0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account19);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test345"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getPhoneNumber();
    account3.setName("hi!");
    account3.setName("");
    account3.setEmail("hi!");
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test346"); }

    Account account3 = new Account("", "", "");
    java.lang.String str4 = account3.getName();
    account3.setPhoneNumber("hi!");
    account3.setName("");
    account3.setEmail("hi!");
    java.lang.String str11 = account3.getPhoneNumber();
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test347"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness17 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness17.createAccount("hi!", "", "");
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account16);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test348"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getEmail();
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getPhoneNumber();
    java.lang.String str9 = account3.getName();
    account3.setPhoneNumber("");
    java.lang.String str12 = account3.getEmail();
    java.lang.String str13 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test349"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(-1.0f));
    java.lang.String str8 = transferAccount2.getIBAN();
    transferAccount2.setBalance(32.0d);
    transferAccount2.setBalance((double)0);
    java.lang.String str13 = transferAccount2.getIBAN();
    java.lang.String str14 = transferAccount2.getIBAN();
    java.lang.String str15 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
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
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test350"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
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
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test351"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setName("");
    account3.setEmail("");
    java.lang.String str9 = account3.getName();
    account3.setName("");
    account3.setEmail("");
    account3.setName("");
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test352"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness14 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness14.createAccount("", "hi!", "hi!");
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
    org.junit.Assert.assertNotNull(optional_account13);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test353"); }

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
    java.lang.String str15 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(short)10);
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test354"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    boolean b12 = transferMoneyData0.accountExists("");
    boolean b14 = transferMoneyData0.accountExists("hi!");
    boolean b16 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount18 = transferMoneyData0.getAccount("");
    boolean b20 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount22 = transferMoneyData0.getAccount("");
    
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
    org.junit.Assert.assertNull(transferAccount18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount22);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test355"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getPhoneNumber();
    java.lang.String str7 = account3.getEmail();
    java.lang.String str8 = account3.getEmail();
    java.lang.String str9 = account3.getEmail();
    java.lang.String str10 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test356"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    boolean b8 = transferMoneyData0.accountExists("");
    boolean b10 = transferMoneyData0.accountExists("");
    boolean b12 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("");
    boolean b16 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount18 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount20 = transferMoneyData0.getAccount("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount20);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test357"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    java.lang.String str9 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str12 = account3.getPhoneNumber();
    account3.setName("");
    account3.setName("hi!");
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test358"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(short)10);
    transferAccount2.setBalance(0.0d);
    transferAccount2.setBalance((double)'#');
    transferAccount2.setBalance(10.0d);
    java.lang.String str17 = transferAccount2.getIBAN();
    transferAccount2.setBalance(0.0d);
    transferAccount2.setBalance((double)(-1));
    transferAccount2.setBalance(0.0d);
    double d24 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 0.0d);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test359"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    double d4 = transferAccount2.getBalance();
    double d5 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test360"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setName("");
    account3.setEmail("");
    java.lang.String str9 = account3.getEmail();
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getEmail();
    account3.setName("hi!");
    java.lang.String str14 = account3.getName();
    java.lang.String str15 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test361"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str10 = account3.getEmail();
    java.lang.String str11 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test362"); }

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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test363"); }

    Account account3 = new Account("hi!", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    java.lang.String str5 = account3.getPhoneNumber();
    java.lang.String str6 = account3.getEmail();
    account3.setPhoneNumber("");
    account3.setEmail("");
    account3.setEmail("hi!");
    account3.setName("hi!");
    java.lang.String str15 = account3.getName();
    java.lang.String str16 = account3.getPhoneNumber();
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test364"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getEmail();
    java.lang.String str12 = account3.getPhoneNumber();
    account3.setEmail("hi!");
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test365"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)100);
    transferAccount2.setBalance((double)(short)-1);
    java.lang.String str5 = transferAccount2.getIBAN();
    java.lang.String str6 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test366"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", 0.0d);
    transferAccount2.setBalance((double)1.0f);
    java.lang.String str5 = transferAccount2.getIBAN();
    java.lang.String str6 = transferAccount2.getIBAN();
    java.lang.String str7 = transferAccount2.getIBAN();
    transferAccount2.setBalance(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test367"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setEmail("");
    java.lang.String str8 = account3.getName();
    account3.setPhoneNumber("hi!");
    account3.setName("hi!");
    java.lang.String str13 = account3.getEmail();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test368"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test369"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account13);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test370"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(short)10);
    double d11 = transferAccount2.getBalance();
    double d12 = transferAccount2.getBalance();
    double d13 = transferAccount2.getBalance();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 10.0d);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test371"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness15 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account17 = createAccountData0.getAccount("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account17);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test372"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
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
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test373"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("hi!");
    java.lang.String str8 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test374"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness13.createAccount("", "hi!", "");
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
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test375"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(short)10);
    java.lang.String str11 = transferAccount2.getIBAN();
    java.lang.String str12 = transferAccount2.getIBAN();
    transferAccount2.setBalance(0.0d);
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test376"); }

    Account account3 = new Account("", "", "hi!");
    account3.setPhoneNumber("hi!");
    java.lang.String str6 = account3.getEmail();
    account3.setEmail("hi!");
    java.lang.String str9 = account3.getPhoneNumber();
    account3.setEmail("");
    java.lang.String str12 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test377"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setName("hi!");
    java.lang.String str11 = account3.getEmail();
    java.lang.String str12 = account3.getName();
    account3.setPhoneNumber("");
    java.lang.String str15 = account3.getEmail();
    account3.setName("hi!");
    java.lang.String str18 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test378"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
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
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test379"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("");
    boolean b8 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount16 = transferMoneyData0.getAccount("");
    boolean b18 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount20 = transferMoneyData0.getAccount("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount20);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test380"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("hi!");
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
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test381"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setEmail("hi!");
    account3.setPhoneNumber("hi!");
    java.lang.String str12 = account3.getPhoneNumber();
    java.lang.String str13 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test382"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account15 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness16 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account18 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account20 = createAccountData0.getAccount("");
    
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
    org.junit.Assert.assertNotNull(optional_account15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account20);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test383"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getEmail();
    java.lang.String str12 = account3.getPhoneNumber();
    account3.setEmail("hi!");
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("");
    account3.setEmail("");
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test384"); }

    Account account3 = new Account("", "hi!", "");
    account3.setEmail("");
    account3.setName("");
    account3.setName("hi!");
    account3.setPhoneNumber("");
    account3.setEmail("");
    account3.setEmail("");
    java.lang.String str16 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test385"); }

    Account account3 = new Account("hi!", "hi!", "");
    account3.setName("");
    account3.setPhoneNumber("");
    account3.setEmail("");
    account3.setName("");

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test386"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)1);
    double d6 = transferAccount2.getBalance();
    double d7 = transferAccount2.getBalance();
    java.lang.String str8 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test387"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    java.lang.String str9 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str12 = account3.getEmail();
    account3.setPhoneNumber("");
    java.lang.String str15 = account3.getEmail();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test388"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    boolean b6 = transferMoneyData0.accountExists("");
    boolean b8 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("hi!");
    boolean b12 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("");
    boolean b16 = transferMoneyData0.accountExists("");
    boolean b18 = transferMoneyData0.accountExists("");
    
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
    org.junit.Assert.assertNull(transferAccount14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test389"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setName("");
    java.lang.String str7 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str10 = account3.getPhoneNumber();
    account3.setName("hi!");
    account3.setEmail("");
    java.lang.String str15 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test390"); }

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
    transferAccount2.setBalance(0.0d);
    double d17 = transferAccount2.getBalance();
    
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
    org.junit.Assert.assertTrue(d17 == 0.0d);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test391"); }

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
    java.util.Optional<Account> optional_account17 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account19 = createAccountData0.getAccount("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account19);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test392"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(short)100);
    transferAccount2.setBalance(52.0d);
    transferAccount2.setBalance((double)(byte)1);
    java.lang.String str10 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test393"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    CreateAccountBusiness createAccountBusiness1 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account3 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test394"); }

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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test395"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)10L);
    transferAccount2.setBalance((double)100.0f);
    double d5 = transferAccount2.getBalance();
    double d6 = transferAccount2.getBalance();
    double d7 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 100.0d);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test396"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
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
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test397"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(short)10);
    double d11 = transferAccount2.getBalance();
    java.lang.String str12 = transferAccount2.getIBAN();
    double d13 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)0L);
    double d16 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(short)-1);
    
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
    org.junit.Assert.assertTrue(d13 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test398"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)100);
    transferAccount2.setBalance(32.0d);
    double d5 = transferAccount2.getBalance();
    double d6 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 32.0d);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test399"); }

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
    account3.setPhoneNumber("");
    account3.setEmail("");
    account3.setName("hi!");
    java.lang.String str27 = account3.getEmail();
    account3.setEmail("hi!");
    account3.setEmail("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test400"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    java.lang.String str9 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str12 = account3.getEmail();
    account3.setPhoneNumber("");
    java.lang.String str15 = account3.getName();
    account3.setPhoneNumber("");
    account3.setEmail("");
    account3.setEmail("");
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test401"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setName("");
    account3.setEmail("hi!");
    java.lang.String str9 = account3.getName();
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test402"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)' ');
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(short)0);
    double d11 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test403"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str13 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test404"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)1.0f);
    double d3 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.0d);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test405"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", 0.0d);
    java.lang.String str3 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)10);
    transferAccount2.setBalance((double)(short)-1);
    java.lang.String str8 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(short)100);
    java.lang.String str11 = transferAccount2.getIBAN();
    java.lang.String str12 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test406"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)0);
    double d10 = transferAccount2.getBalance();
    java.lang.String str11 = transferAccount2.getIBAN();
    double d12 = transferAccount2.getBalance();
    java.lang.String str13 = transferAccount2.getIBAN();
    double d14 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test407"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("hi!");
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
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account13);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test408"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    account3.setName("hi!");
    java.lang.String str12 = account3.getName();
    account3.setPhoneNumber("");
    account3.setEmail("hi!");
    account3.setPhoneNumber("");
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test409"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getPhoneNumber();
    account3.setEmail("hi!");
    account3.setPhoneNumber("");
    account3.setName("");
    java.lang.String str17 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test410"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getEmail();
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getPhoneNumber();
    java.lang.String str9 = account3.getName();
    account3.setPhoneNumber("");
    java.lang.String str12 = account3.getEmail();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
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
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test411"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getEmail();
    account3.setEmail("");
    account3.setName("hi!");
    account3.setEmail("hi!");
    java.lang.String str18 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test412"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setPhoneNumber("");
    java.lang.String str10 = account3.getName();
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test413"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    java.lang.String str9 = account3.getEmail();
    java.lang.String str10 = account3.getEmail();
    account3.setEmail("");
    
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
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test414"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(short)10);
    transferAccount2.setBalance((double)'a');
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    transferAccount2.setBalance(0.0d);
    transferAccount2.setBalance(0.0d);
    transferAccount2.setBalance((double)1L);
    java.lang.String str13 = transferAccount2.getIBAN();
    double d14 = transferAccount2.getBalance();
    double d15 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 97.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test415"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getEmail();
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    java.lang.String str9 = account3.getEmail();
    java.lang.String str10 = account3.getName();
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test416"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setName("hi!");
    java.lang.String str11 = account3.getEmail();
    java.lang.String str12 = account3.getEmail();
    java.lang.String str13 = account3.getName();
    account3.setPhoneNumber("hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    
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
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test417"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    boolean b6 = transferMoneyData0.accountExists("");
    boolean b8 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    boolean b14 = transferMoneyData0.accountExists("");
    boolean b16 = transferMoneyData0.accountExists("hi!");
    boolean b18 = transferMoneyData0.accountExists("hi!");
    boolean b20 = transferMoneyData0.accountExists("hi!");
    
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
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test418"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getEmail();
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setEmail("");
    account3.setPhoneNumber("");
    java.lang.String str13 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    account3.setName("");
    
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
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test419"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    CreateAccountBusiness createAccountBusiness1 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account3 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness7.createAccount("hi!", "", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test420"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    java.lang.String str9 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str12 = account3.getEmail();
    account3.setPhoneNumber("");
    java.lang.String str15 = account3.getName();
    account3.setPhoneNumber("");
    java.lang.String str18 = account3.getEmail();
    java.lang.String str19 = account3.getEmail();
    java.lang.String str20 = account3.getName();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test421"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getEmail();
    account3.setEmail("");
    account3.setEmail("");
    account3.setEmail("");
    account3.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test422"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)' ');
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    double d9 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 32.0d);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test423"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getName();
    java.lang.String str9 = account3.getName();
    account3.setName("hi!");
    account3.setName("");
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test424"); }

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
    java.lang.String str19 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test425"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("hi!");
    account3.setPhoneNumber("");
    account3.setEmail("");
    java.lang.String str14 = account3.getPhoneNumber();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test426"); }

    Account account3 = new Account("", "hi!", "");
    account3.setEmail("");
    account3.setName("");
    account3.setName("hi!");
    account3.setPhoneNumber("");
    account3.setEmail("");
    java.lang.String str14 = account3.getEmail();
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test427"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    java.lang.String str9 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str12 = account3.getPhoneNumber();
    account3.setName("");
    java.lang.String str15 = account3.getEmail();
    java.lang.String str16 = account3.getName();
    java.lang.String str17 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test428"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount14);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test429"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account15 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account17 = createAccountData0.getAccount("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account17);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test430"); }

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
    createAccountBusiness11.createAccount("", "hi!", "");
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
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test431"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    java.lang.String str9 = account3.getPhoneNumber();
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test432"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setEmail("");
    java.lang.String str8 = account3.getName();
    account3.setPhoneNumber("hi!");
    account3.setName("hi!");
    java.lang.String str13 = account3.getName();
    java.lang.String str14 = account3.getPhoneNumber();
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test433"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    java.lang.String str9 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str12 = account3.getEmail();
    account3.setPhoneNumber("");
    java.lang.String str15 = account3.getName();
    account3.setEmail("");
    java.lang.String str18 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test434"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", 35.0d);
    java.lang.String str3 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test435"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)0);
    transferAccount2.setBalance((double)0);
    transferAccount2.setBalance((double)'a');
    double d14 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 97.0d);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test436"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account15 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account17 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness18 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness19 = new CreateAccountBusiness(createAccountData0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account17);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test437"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    boolean b8 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("");
    boolean b14 = transferMoneyData0.accountExists("hi!");
    
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
    org.junit.Assert.assertNull(transferAccount12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test438"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setName("");
    java.lang.String str7 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str10 = account3.getPhoneNumber();
    java.lang.String str11 = account3.getPhoneNumber();
    account3.setName("");
    account3.setEmail("hi!");
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test439"); }

    Account account3 = new Account("", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("");
    account3.setEmail("hi!");
    account3.setName("");
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test440"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    boolean b14 = transferMoneyData0.accountExists("hi!");
    
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

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test441"); }

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
    createAccountBusiness16.createAccount("hi!", "hi!", "");
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
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test442"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", 0.0d);
    transferAccount2.setBalance(0.0d);
    transferAccount2.setBalance((double)'#');
    transferAccount2.setBalance(32.0d);
    java.lang.String str9 = transferAccount2.getIBAN();
    double d10 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 32.0d);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test443"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(short)10);
    java.lang.String str11 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    transferAccount2.setBalance((double)'a');
    java.lang.String str16 = transferAccount2.getIBAN();
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test444"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    boolean b8 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("hi!");
    boolean b12 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount16 = transferMoneyData0.getAccount("");
    boolean b18 = transferMoneyData0.accountExists("hi!");
    
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
    org.junit.Assert.assertNull(transferAccount14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test445"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)1);
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(byte)0);
    transferAccount2.setBalance(97.0d);
    double d12 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 97.0d);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test446"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
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
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test447"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test448"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)100.0f);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    java.lang.String str5 = transferAccount2.getIBAN();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 100.0d);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test449"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setEmail("hi!");
    account3.setPhoneNumber("hi!");
    java.lang.String str12 = account3.getPhoneNumber();
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test450"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setName("hi!");
    java.lang.String str11 = account3.getEmail();
    java.lang.String str12 = account3.getEmail();
    java.lang.String str13 = account3.getName();
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("hi!");
    account3.setEmail("hi!");
    account3.setName("hi!");
    
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
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test451"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account15 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness16 = new CreateAccountBusiness(createAccountData0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account15);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test452"); }

    Account account3 = new Account("", "hi!", "hi!");
    java.lang.String str4 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    java.lang.String str7 = account3.getEmail();
    java.lang.String str8 = account3.getEmail();
    account3.setName("");
    account3.setPhoneNumber("hi!");
    account3.setEmail("");
    account3.setPhoneNumber("");
    java.lang.String str17 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test453"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("");
    boolean b16 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount18 = transferMoneyData0.getAccount("hi!");
    boolean b20 = transferMoneyData0.accountExists("");
    boolean b22 = transferMoneyData0.accountExists("hi!");
    
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
    org.junit.Assert.assertNull(transferAccount18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test454"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    java.lang.String str9 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str12 = account3.getPhoneNumber();
    java.lang.String str13 = account3.getName();
    account3.setName("");
    account3.setPhoneNumber("hi!");
    java.lang.String str18 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test455"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)1);
    java.lang.String str6 = transferAccount2.getIBAN();
    java.lang.String str7 = transferAccount2.getIBAN();
    java.lang.String str8 = transferAccount2.getIBAN();
    double d9 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 1.0d);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test456"); }

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
    account3.setEmail("");
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test457"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    
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
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test458"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    account3.setEmail("");
    java.lang.String str10 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test459"); }

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
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test460"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setEmail("");
    account3.setName("");
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test461"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setEmail("hi!");
    account3.setEmail("hi!");
    account3.setName("");
    account3.setPhoneNumber("hi!");
    java.lang.String str15 = account3.getPhoneNumber();
    java.lang.String str16 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test462"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("");
    boolean b12 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount16 = transferMoneyData0.getAccount("hi!");
    boolean b18 = transferMoneyData0.accountExists("hi!");
    boolean b20 = transferMoneyData0.accountExists("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test463"); }

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
    CreateAccountBusiness createAccountBusiness15 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness16 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness16.createAccount("", "", "");
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
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test464"); }

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
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness17 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness18 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness19 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness20 = new CreateAccountBusiness(createAccountData0);
    
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
    org.junit.Assert.assertNotNull(optional_account16);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test465"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("");
    boolean b8 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount16 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount18 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount20 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount22 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount24 = transferMoneyData0.getAccount("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount24);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test466"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("hi!");
    boolean b10 = transferMoneyData0.accountExists("hi!");
    boolean b12 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount16 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount18 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount20 = transferMoneyData0.getAccount("");
    boolean b22 = transferMoneyData0.accountExists("");
    boolean b24 = transferMoneyData0.accountExists("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test467"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    java.lang.String str6 = transferAccount2.getIBAN();
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    double d9 = transferAccount2.getBalance();
    double d10 = transferAccount2.getBalance();
    double d11 = transferAccount2.getBalance();
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
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test468"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("hi!");
    boolean b10 = transferMoneyData0.accountExists("hi!");
    boolean b12 = transferMoneyData0.accountExists("");
    
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
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test469"); }

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
    createAccountBusiness14.createAccount("", "", "hi!");
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
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test470"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setName("");
    account3.setEmail("hi!");
    account3.setEmail("hi!");
    java.lang.String str11 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test471"); }

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
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test472"); }

    Account account3 = new Account("hi!", "hi!", "");
    account3.setPhoneNumber("");
    account3.setEmail("");
    java.lang.String str8 = account3.getPhoneNumber();
    java.lang.String str9 = account3.getPhoneNumber();
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getName();
    java.lang.String str12 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test473"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account15 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account17 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account19 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness20 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness20.createAccount("", "", "hi!");
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account19);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test474"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setEmail("hi!");
    account3.setName("hi!");
    account3.setName("");
    account3.setName("hi!");
    java.lang.String str16 = account3.getEmail();
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test475"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    java.lang.String str6 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    java.lang.String str9 = account3.getName();
    java.lang.String str10 = account3.getEmail();
    account3.setName("hi!");
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("");
    account3.setPhoneNumber("hi!");
    java.lang.String str19 = account3.getName();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test476"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", 0.0d);
    transferAccount2.setBalance((double)1.0f);
    java.lang.String str5 = transferAccount2.getIBAN();
    transferAccount2.setBalance(0.0d);
    transferAccount2.setBalance((double)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test477"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account16 = createAccountData0.getAccount("hi!");
    
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
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test478"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account15 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness16 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness16.createAccount("hi!", "", "");
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
    org.junit.Assert.assertNotNull(optional_account13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account15);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test479"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getPhoneNumber();
    java.lang.String str5 = account3.getPhoneNumber();
    java.lang.String str6 = account3.getName();
    account3.setPhoneNumber("");
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test480"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)' ');
    double d7 = transferAccount2.getBalance();
    java.lang.String str8 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)10);
    double d11 = transferAccount2.getBalance();
    double d12 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 10.0d);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test481"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness5 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("");
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
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test482"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setEmail("hi!");
    account3.setName("hi!");
    java.lang.String str12 = account3.getPhoneNumber();
    account3.setEmail("hi!");
    java.lang.String str15 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test483"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
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
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test484"); }

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
    java.lang.String str19 = account3.getEmail();
    java.lang.String str20 = account3.getPhoneNumber();
    account3.setEmail("");
    java.lang.String str23 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test485"); }

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
    java.lang.String str16 = account3.getEmail();
    java.lang.String str17 = account3.getName();
    account3.setEmail("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test486"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(short)10);
    java.lang.String str11 = transferAccount2.getIBAN();
    double d12 = transferAccount2.getBalance();
    double d13 = transferAccount2.getBalance();
    java.lang.String str14 = transferAccount2.getIBAN();
    java.lang.String str15 = transferAccount2.getIBAN();
    
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
    org.junit.Assert.assertTrue(d12 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test487"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setName("hi!");
    account3.setEmail("hi!");
    account3.setName("hi!");
    account3.setName("");
    java.lang.String str14 = account3.getPhoneNumber();
    account3.setEmail("hi!");
    account3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test488"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setEmail("");
    java.lang.String str8 = account3.getName();
    account3.setPhoneNumber("");
    java.lang.String str11 = account3.getEmail();
    java.lang.String str12 = account3.getName();
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("");
    account3.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test489"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getEmail();
    account3.setEmail("");
    account3.setName("");
    java.lang.String str11 = account3.getName();
    java.lang.String str12 = account3.getEmail();
    account3.setName("");
    account3.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test490"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setEmail("hi!");
    account3.setName("hi!");
    account3.setPhoneNumber("hi!");

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test491"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setName("hi!");
    java.lang.String str11 = account3.getEmail();
    java.lang.String str12 = account3.getEmail();
    java.lang.String str13 = account3.getName();
    account3.setPhoneNumber("hi!");
    java.lang.String str16 = account3.getEmail();
    java.lang.String str17 = account3.getPhoneNumber();
    java.lang.String str18 = account3.getName();
    java.lang.String str19 = account3.getPhoneNumber();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test492"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getPhoneNumber();
    java.lang.String str8 = account3.getEmail();
    account3.setName("");
    account3.setEmail("");
    java.lang.String str13 = account3.getPhoneNumber();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test493"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    double d4 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 10.0d);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test494"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness13 = new CreateAccountBusiness(createAccountData0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
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
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test495"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    boolean b6 = transferMoneyData0.accountExists("");
    boolean b8 = transferMoneyData0.accountExists("");
    boolean b10 = transferMoneyData0.accountExists("hi!");
    boolean b12 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount16 = transferMoneyData0.getAccount("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
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
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test496"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("hi!");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("");
    boolean b10 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    boolean b14 = transferMoneyData0.accountExists("hi!");
    boolean b16 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount18 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount20 = transferMoneyData0.getAccount("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount20);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test497"); }

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
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test498"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)' ');
    double d7 = transferAccount2.getBalance();
    double d8 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(short)0);
    java.lang.String str11 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test499"); }

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
    double d14 = transferAccount2.getBalance();
    java.lang.String str15 = transferAccount2.getIBAN();
    
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
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test500"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    double d5 = transferAccount2.getBalance();
    transferAccount2.setBalance((double)(-1.0f));
    java.lang.String str8 = transferAccount2.getIBAN();
    transferAccount2.setBalance(0.0d);
    transferAccount2.setBalance(0.0d);
    transferAccount2.setBalance((double)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

}
