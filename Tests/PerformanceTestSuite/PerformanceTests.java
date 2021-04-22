package PerformanceTestSuite;

import airline.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PerformanceTests {

    Login myLogin;
    User testUser;

    // setup to initialize new login object
    @BeforeEach
    public void setup() {
        myLogin = new Login();
    }

    @Test
    @DisplayName("Positive testing with correct credentials and data type")
    public void testLoginButtonPositive() {
        testUser = new User("hh", "hh");
        boolean timeAcceptable;

        testUser = new User("fake", "notReal");
        double start = System.currentTimeMillis();
        myLogin.loginButton(testUser.getUsername(),
                testUser.getPassword());
        double end = System.currentTimeMillis();
        double total = (end - start);
        if(total < 5000){
            timeAcceptable = true;
        }
        else{ timeAcceptable = false;}
        Assertions.assertEquals(true, timeAcceptable);
    }

    @Test
    @DisplayName("Negative testing with null parameters")
    public void testLoginButtonNegative() {
        testUser = new User(null, null);
        boolean timeAcceptable;

        double start = System.currentTimeMillis();
        myLogin.loginButton(testUser.getUsername(),
                testUser.getPassword());
        double end = System.currentTimeMillis();
        double total = (end - start);
        if(total < 5000){
            timeAcceptable = true;
        }
        else{ timeAcceptable = false;}
        Assertions.assertEquals(true, timeAcceptable);
    }
    @Test
    public void testLoginButtonNegative2() {
        testUser = new User(null, "nick");
        boolean timeAcceptable;
        double start = System.currentTimeMillis();
        myLogin.loginButton(testUser.getUsername(),
                testUser.getPassword());
        double end = System.currentTimeMillis();
        double total = (end - start);
        if(total < 5000){
            timeAcceptable = true;
        }
        else{ timeAcceptable = false;}
        Assertions.assertEquals(true, timeAcceptable);
    }

    @Test
    public void testLoginButtonNegative3() {
        testUser = new User("nick", null);
        boolean timeAcceptable;
        double start = System.currentTimeMillis();
        myLogin.loginButton(testUser.getUsername(),
                testUser.getPassword());
        double end = System.currentTimeMillis();
        double total = (end - start);
        if(total < 5000){
            timeAcceptable = true;
        }
        else{ timeAcceptable = false;}
        Assertions.assertEquals(true, timeAcceptable);
    }
    @Test
    public void testLoginButtonNegative4() {
        testUser = new User("nick", "");
        boolean timeAcceptable;
        double start = System.currentTimeMillis();
        myLogin.loginButton(testUser.getUsername(),
                testUser.getPassword());
        double end = System.currentTimeMillis();
        double total = (end - start);
        if(total < 5000){
            timeAcceptable = true;
        }
        else{ timeAcceptable = false;}
        Assertions.assertEquals(true, timeAcceptable);
    }
    @Test
    public void testLoginButtonNegative5() {
        testUser = new User("", "nick");
        boolean timeAcceptable;
        double start = System.currentTimeMillis();
        myLogin.loginButton(testUser.getUsername(),
                testUser.getPassword());
        double end = System.currentTimeMillis();
        double total = (end - start);
        if(total < 5000){
            timeAcceptable = true;
        }
        else{ timeAcceptable = false;}
        Assertions.assertEquals(true, timeAcceptable);
    }
    
    @Test
    @DisplayName("Input validation with correct data type but wrong values")
    public void testLoginButtonInputVal() {
        boolean timeAcceptable;

        testUser = new User("fake", "notReal");
        double start = System.currentTimeMillis();
        myLogin.loginButton(testUser.getUsername(),
                testUser.getPassword());
        double end = System.currentTimeMillis();
        double total = (end - start);
        if(total < 5000){
            timeAcceptable = true;
        }
        else{ timeAcceptable = false;}
        Assertions.assertEquals(true, timeAcceptable);
    }
    @Test
    public void addCustomerPerf(){
        boolean timeAcceptable;

        addCustomer customer = new addCustomer();
        double start = System.currentTimeMillis();
        customer.addUser();
        double end = System.currentTimeMillis();
        double total = (end - start);
        if(total < 5000){
            timeAcceptable = true;
        }
        else{ timeAcceptable = false;}
        Assertions.assertEquals(true, timeAcceptable);
    }

    @Test
    public void searchCustomerPerf(){
        boolean timeAcceptable;

        searchCustomer customer = new searchCustomer();
        searchCustomer.txtcustid.setText("CS001");
        double start = System.currentTimeMillis();
        customer.searchCustomer();
        double end = System.currentTimeMillis();
        double total = (end - start);
        if(total < 5000){
            timeAcceptable = true;
        }
        else{ timeAcceptable = false;}
        Assertions.assertEquals(true, timeAcceptable);
    }

    @Test
    public void addFlightPerf(){
        boolean timeAcceptable;

        AddFlight customer = new AddFlight();
        double start = System.currentTimeMillis();
        customer.addFlightButton();
        double end = System.currentTimeMillis();
        double total = (end - start);
        if(total < 5000){
            timeAcceptable = true;
        }
        else{ timeAcceptable = false;}
        Assertions.assertEquals(true, timeAcceptable);
    }

    @Test
    public void ticketReportPerf(){
        boolean timeAcceptable;

        ticketreport customer = new ticketreport();
        double start = System.currentTimeMillis();
        customer.LoadData();
        double end = System.currentTimeMillis();
        double total = (end - start);
        if(total < 5000){
            timeAcceptable = true;
        }
        else{ timeAcceptable = false;}
        Assertions.assertEquals(true, timeAcceptable);
    }

    @Test
    public void ticketPerf(){
        boolean timeAcceptable;

        ticket customer = new ticket();
        double start = System.currentTimeMillis();
        customer.showInfo();
        double end = System.currentTimeMillis();
        double total = (end - start);
        if(total < 5000){
            timeAcceptable = true;
        }
        else{ timeAcceptable = false;}
        Assertions.assertEquals(true, timeAcceptable);
    }

    @Test
    public void userPerf(){
        boolean timeAcceptable;

        userCreation customer = new userCreation();
        double start = System.currentTimeMillis();
        customer.createUserButton();
        double end = System.currentTimeMillis();
        double total = (end - start);
        if(total < 5000){
            timeAcceptable = true;
        }
        else{ timeAcceptable = false;}
        Assertions.assertEquals(true, timeAcceptable);
    }
}
