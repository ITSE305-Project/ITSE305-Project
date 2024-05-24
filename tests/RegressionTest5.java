
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test01"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getPhoneNumber();
    account3.setPhoneNumber("");
    java.lang.String str10 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test02"); }

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
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account15);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test03"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getName();
    java.lang.String str11 = account3.getEmail();
    java.lang.String str12 = account3.getName();
    account3.setEmail("");
    java.lang.String str15 = account3.getPhoneNumber();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test04"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getEmail();
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setEmail("");
    account3.setName("");
    java.lang.String str13 = account3.getPhoneNumber();
    java.lang.String str14 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test05"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setPhoneNumber("hi!");
    account3.setEmail("hi!");
    account3.setPhoneNumber("");
    account3.setName("");
    account3.setEmail("");
    java.lang.String str15 = account3.getPhoneNumber();
    account3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test06"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setEmail("");
    account3.setName("");
    account3.setPhoneNumber("hi!");
    account3.setPhoneNumber("");
    java.lang.String str14 = account3.getName();
    java.lang.String str15 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test07"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("hi!");
    account3.setPhoneNumber("");
    account3.setEmail("");
    account3.setName("hi!");
    java.lang.String str16 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test08"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
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
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test09"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness10 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account12 = createAccountData0.getAccount("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account12);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test10"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getPhoneNumber();
    java.lang.String str11 = account3.getName();
    account3.setEmail("");
    account3.setEmail("");
    account3.setEmail("");
    
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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test11"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
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
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test12"); }

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
    account3.setName("hi!");
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
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test13"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    double d3 = transferAccount2.getBalance();
    java.lang.String str4 = transferAccount2.getIBAN();
    java.lang.String str5 = transferAccount2.getIBAN();
    double d6 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test14"); }

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
    org.junit.Assert.assertNotNull(optional_account5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account13);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test15"); }

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
    account3.setPhoneNumber("hi!");
    java.lang.String str23 = account3.getEmail();
    java.lang.String str24 = account3.getEmail();
    java.lang.String str25 = account3.getName();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test16"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness6 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness7 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness15 = new CreateAccountBusiness(createAccountData0);
    // The following exception was thrown during execution in test generation
    try {
    createAccountBusiness15.createAccount("", "hi!", "hi!");
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
    org.junit.Assert.assertNotNull(optional_account11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account14);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test17"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)10L);
    transferAccount2.setBalance((double)1.0f);
    transferAccount2.setBalance((double)10.0f);
    java.lang.String str7 = transferAccount2.getIBAN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test18"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness4 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account6 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account8 = createAccountData0.getAccount("hi!");
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
    org.junit.Assert.assertNotNull(optional_account6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account10);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test19"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", 0.0d);
    java.lang.String str3 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)10);
    transferAccount2.setBalance((double)(short)-1);
    double d8 = transferAccount2.getBalance();
    double d9 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == (-1.0d));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test20"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    boolean b8 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("hi!");
    boolean b12 = transferMoneyData0.accountExists("");
    boolean b14 = transferMoneyData0.accountExists("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount4);
    
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
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test21"); }

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
    double d14 = transferAccount2.getBalance();
    
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
    org.junit.Assert.assertTrue(d14 == 10.0d);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test22"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    java.lang.String str6 = account3.getEmail();
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setEmail("");
    account3.setName("hi!");
    java.lang.String str13 = account3.getName();
    
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
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test23"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    account3.setName("");
    account3.setEmail("hi!");
    java.lang.String str9 = account3.getPhoneNumber();
    java.lang.String str10 = account3.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test24"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("hi!");
    boolean b10 = transferMoneyData0.accountExists("hi!");
    boolean b12 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount16 = transferMoneyData0.getAccount("");
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
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test25"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    java.lang.String str8 = account3.getPhoneNumber();
    account3.setName("hi!");
    java.lang.String str11 = account3.getEmail();
    java.lang.String str12 = account3.getName();
    account3.setEmail("");
    account3.setEmail("hi!");
    
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

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test26"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    boolean b6 = transferMoneyData0.accountExists("");
    boolean b8 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("hi!");
    
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
    org.junit.Assert.assertNull(transferAccount14);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test27"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    java.lang.String str4 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)0L);
    java.lang.String str7 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)0);
    java.lang.String str10 = transferAccount2.getIBAN();
    double d11 = transferAccount2.getBalance();
    double d12 = transferAccount2.getBalance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test28"); }

    TransferAccount transferAccount2 = new TransferAccount("hi!", (double)(byte)10);
    java.lang.String str3 = transferAccount2.getIBAN();
    double d4 = transferAccount2.getBalance();
    java.lang.String str5 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)(byte)10);
    java.lang.String str8 = transferAccount2.getIBAN();
    java.lang.String str9 = transferAccount2.getIBAN();
    transferAccount2.setBalance((double)1L);
    java.lang.String str12 = transferAccount2.getIBAN();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test29"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    boolean b4 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("");
    boolean b8 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("hi!");
    boolean b14 = transferMoneyData0.accountExists("hi!");
    boolean b16 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount18 = transferMoneyData0.getAccount("hi!");
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
    org.junit.Assert.assertNull(transferAccount18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test30"); }

    Account account3 = new Account("hi!", "hi!", "");
    account3.setName("hi!");
    account3.setName("hi!");
    java.lang.String str8 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test31"); }

    Account account3 = new Account("hi!", "", "hi!");
    account3.setEmail("hi!");
    java.lang.String str6 = account3.getPhoneNumber();
    java.lang.String str7 = account3.getPhoneNumber();
    account3.setName("hi!");
    java.lang.String str10 = account3.getEmail();
    account3.setPhoneNumber("");
    java.lang.String str13 = account3.getPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test32"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount6 = transferMoneyData0.getAccount("");
    TransferAccount transferAccount8 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount12 = transferMoneyData0.getAccount("");
    boolean b14 = transferMoneyData0.accountExists("");
    
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
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test33"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("hi!");
    account3.setPhoneNumber("");
    account3.setPhoneNumber("");
    account3.setName("hi!");
    java.lang.String str16 = account3.getEmail();
    account3.setPhoneNumber("");
    java.lang.String str19 = account3.getPhoneNumber();
    java.lang.String str20 = account3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test34"); }

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
    org.junit.Assert.assertNotNull(optional_account13);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test35"); }

    TransferMoneyData transferMoneyData0 = new TransferMoneyData();
    TransferAccount transferAccount2 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount4 = transferMoneyData0.getAccount("");
    boolean b6 = transferMoneyData0.accountExists("hi!");
    boolean b8 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount10 = transferMoneyData0.getAccount("hi!");
    boolean b12 = transferMoneyData0.accountExists("hi!");
    TransferAccount transferAccount14 = transferMoneyData0.getAccount("hi!");
    TransferAccount transferAccount16 = transferMoneyData0.getAccount("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount4);
    
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

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test36"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account10 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness11 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account13 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account15 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness16 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness17 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness18 = new CreateAccountBusiness(createAccountData0);
    
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
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test37"); }

    Account account3 = new Account("hi!", "", "");
    java.lang.String str4 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str7 = account3.getName();
    java.lang.String str8 = account3.getEmail();
    java.lang.String str9 = account3.getName();
    account3.setEmail("hi!");
    java.lang.String str12 = account3.getEmail();
    java.lang.String str13 = account3.getName();
    account3.setEmail("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test38"); }

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
    boolean b20 = transferMoneyData0.accountExists("");
    TransferAccount transferAccount22 = transferMoneyData0.getAccount("");
    
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
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferAccount22);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test39"); }

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
    CreateAccountBusiness createAccountBusiness20 = new CreateAccountBusiness(createAccountData0);
    
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

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test40"); }

    Account account3 = new Account("", "", "hi!");
    java.lang.String str4 = account3.getName();
    java.lang.String str5 = account3.getEmail();
    account3.setName("");
    account3.setName("");
    java.lang.String str10 = account3.getPhoneNumber();
    account3.setEmail("hi!");
    account3.setPhoneNumber("");
    java.lang.String str15 = account3.getName();
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test41"); }

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
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test42"); }

    Account account3 = new Account("", "hi!", "hi!");
    account3.setName("hi!");
    account3.setEmail("");
    java.lang.String str8 = account3.getName();
    account3.setPhoneNumber("hi!");
    account3.setName("hi!");
    java.lang.String str13 = account3.getName();
    account3.setPhoneNumber("");
    account3.setPhoneNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test43"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account4 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness5 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness8 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness9 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(optional_account11);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test44"); }

    CreateAccountData createAccountData0 = new CreateAccountData();
    java.util.Optional<Account> optional_account2 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness3 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account5 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account7 = createAccountData0.getAccount("hi!");
    java.util.Optional<Account> optional_account9 = createAccountData0.getAccount("");
    java.util.Optional<Account> optional_account11 = createAccountData0.getAccount("");
    CreateAccountBusiness createAccountBusiness12 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account14 = createAccountData0.getAccount("hi!");
    CreateAccountBusiness createAccountBusiness15 = new CreateAccountBusiness(createAccountData0);
    CreateAccountBusiness createAccountBusiness16 = new CreateAccountBusiness(createAccountData0);
    java.util.Optional<Account> optional_account18 = createAccountData0.getAccount("hi!");
    
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
    org.junit.Assert.assertNotNull(optional_account18);

  }

}
