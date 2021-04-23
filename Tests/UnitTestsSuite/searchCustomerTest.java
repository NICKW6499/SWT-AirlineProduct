package UnitTestsSuite;

import airline.searchCustomer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class searchCustomerTest {
    searchCustomer customer;
    @InjectMocks
    searchCustomer mockCustomer;
    @Mock
    searchCustomer mock;
    @BeforeEach
    void setUp() {
        customer = new searchCustomer();
        searchCustomer.txtcustid.setText("CS001");
        searchCustomer.txtfirstname.setText("");
        searchCustomer.txtlastname.setText("");
        searchCustomer.txtnic.setText("");
        searchCustomer.txtpassport.setText("");
        searchCustomer.txtaddress.setText("");
        searchCustomer.txtcontact.setText("");
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
    }


    /**
     * Test Case ID: Unit test SC#1
     * Purpose: Test for correct handling of image uploads.
     * Test setup: An instance of searchCustomer is set up with default values.
     * Test strategy: Input validation testing
     * Input: DisplayName("photo"): JPG or JPEG image file
     *        DisplayName("not jpg or jpeg or other image formats"): Any non-image file
     * Expected Output: DisplayName("photo"): "complete"
     *                  DisplayName("not jpg or jpeg or other image formats"): "An error occurred"
     **/
    @Test
    @DisplayName("photo")
    void jButton1ActionPerformed() {
        searchCustomer.jButton1.doClick();
    Assertions.assertEquals("complete",customer.updatePhoto());

    }
    @Test
    @DisplayName("not jpg or jpeg or other image formats")
    public void jButton1ActionPerformed2() {
        Assertions.assertEquals("An error occurred",customer.updatePhoto());
    }

    /**
     * Test Case ID: Unit test SC#2
     * Purpose: Tests for null values when attempting to update searchCustomer.
     * Test setup: An instance of searchCustomer is set up with default values.
     * Test strategy: Negative testing
     * Input: null values for all fields
     * Expected Output: "A field is empty"
     **/
    @Test
    @DisplayName("updateNull")
    void jButton2ActionPerformed() {
        customer = new searchCustomer();
        searchCustomer.txtcustid.setText("CS001");
        searchCustomer.txtfirstname.setText(null);
        searchCustomer.txtlastname.setText(null);
        searchCustomer.txtnic.setText(null);
        searchCustomer.txtpassport.setText(null);
        searchCustomer.txtaddress.setText(null);
        searchCustomer.txtcontact.setText(null);
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
        Assertions.assertEquals("A field is empty",customer.updateUser());

    }
    @Test
    @DisplayName("empty")
    void jButton2ActionPerformed2() {
        Assertions.assertEquals("A field is empty",customer.updateUser());


    }

    /**
     * Test Case ID: Unit test SC#3
     * Purpose: Tests for correct values when attempting to update searchCustomer.
     * Test setup: An instance of searchCustomer is set up with default values.
     * Test strategy: Positive testing
     * Input: Valid inputs for all fields
     * Expected Output: "complete"
     **/
    @Test
    @DisplayName("positive")
    void jButton2ActionPerformed3() {
        customer = new searchCustomer();
        searchCustomer.txtcustid.setText("CS001");
        searchCustomer.txtfirstname.setText("nick");
        searchCustomer.txtlastname.setText("wright");
        searchCustomer.txtnic.setText("123");
        searchCustomer.txtpassport.setText("123");
        searchCustomer.txtaddress.setText("123 bgd");
        searchCustomer.txtcontact.setText("123532");
        searchCustomer.txtphoto.setText("airline/testImage.png");
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
        customer.updatePhoto();
        Assertions.assertEquals("complete",customer.updateUser());

    }

    @Test
    @DisplayName("positiveR2")
    void jButton2ActionPerformed4() {
        customer = new searchCustomer();
        searchCustomer.txtcustid.setText("CS001");
        searchCustomer.txtfirstname.setText("nick");
        searchCustomer.txtlastname.setText("wright");
        searchCustomer.txtnic.setText("123");
        searchCustomer.txtpassport.setText("123");
        searchCustomer.txtaddress.setText("123 bgd");
        searchCustomer.txtcontact.setText("123532");
        searchCustomer.txtphoto.setText("airline/testImage.png");
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
        customer.updatePhoto();
        searchCustomer.jButton2.doClick();
        Assertions.assertEquals("complete",customer.updateUser());


    }
    /**********************************************************************/

    @Test
    @DisplayName("")
    void jButton3ActionPerformed() {
        searchCustomer.jButton3.doClick();
    }

    /**
     * Test Case ID: Unit test SC#4
     * Purpose: Tests for ID search
     * Test setup: An instance of searchCustomer is set up with default values.
     * Test strategy: Positive and negative testing
     * Input: DisplayName("Empty String for id"): ""
     *        DisplayName("null String for id"): null
     *        DisplayName("Positive match for id"): "CS001"
     *        DisplayName("negative match for id"): "CS009"
     * Expected Output: DisplayName("Empty String for id"): "A field is empty"
     *                  DisplayName("null String for id"): "A field is empty"
     *                  DisplayName("Positive match for id"): "complete"
     *                  DisplayName("negative match for id"): "field not found"
     **/
    @Test
    @DisplayName("Empty String for id")
    void jButton4ActionPerformed() {
        searchCustomer.txtcustid.setText("");
        searchCustomer.jButton1.doClick();
        Assertions.assertEquals("A field is empty",customer.searchCustomer());


    }

    @Test
    @DisplayName("null String for id")
    void jButton4ActionPerformed2() {
        searchCustomer.txtcustid.setText(null);
        searchCustomer.jButton1.doClick();
        Assertions.assertEquals("A field is empty",customer.searchCustomer());


    }
    @Test
    @DisplayName("Positive match for id")
    void jButton4ActionPerformed3() {
        searchCustomer.txtcustid.setText("CS001");
        searchCustomer.jButton1.doClick();
        Assertions.assertEquals("complete",customer.searchCustomer());


    }
    @Test
    @DisplayName("negative match for id")
    void jButton4ActionPerformed4() {
        searchCustomer.txtcustid.setText("CS005");
        searchCustomer.jButton1.doClick();
        Assertions.assertEquals("record not found",customer.searchCustomer());
    }

    @Test
    void mockSearchCustomer(){
        searchCustomer.txtcustid.setText("CS009");
        mockCustomer = mock(searchCustomer.class);
        when(mockCustomer.searchCustomer()).thenReturn("record not found");
        Assertions.assertEquals(mockCustomer.searchCustomer(),"record not found");

    }
    /***********************************************************************/

    /**
     * Test Case ID: Unit test SC#5
     * Purpose: Tests for individual empty fields
     * Test setup: An instance of searchCustomer is set up with default values.
     * Test strategy: Input validation testing
     * Input: All fields except one are entered with valid inputs.
     * Expected Output: false
     **/
    @Test
    void logic(){
        customer = new searchCustomer();
        searchCustomer.txtcustid.setText("");
        searchCustomer.txtfirstname.setText("a");
        searchCustomer.txtlastname.setText("a");
        searchCustomer.txtnic.setText("a");
        searchCustomer.txtpassport.setText("a");
        searchCustomer.txtaddress.setText("a");
        searchCustomer.txtcontact.setText("a");
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
        Assertions.assertEquals(false, customer.checkValues());

    }
    @Test
    void logic2(){
        customer = new searchCustomer();
        searchCustomer.txtcustid.setText("CS001");
        searchCustomer.txtfirstname.setText("");
        searchCustomer.txtlastname.setText("a");
        searchCustomer.txtnic.setText("a");
        searchCustomer.txtpassport.setText("a");
        searchCustomer.txtaddress.setText("a");
        searchCustomer.txtcontact.setText("a");
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
        Assertions.assertEquals(false, customer.checkValues());

    }
    @Test
    void logic3(){
        customer = new searchCustomer();
        searchCustomer.txtcustid.setText("CS001");
        searchCustomer.txtfirstname.setText("a");
        searchCustomer.txtlastname.setText("");
        searchCustomer.txtnic.setText("a");
        searchCustomer.txtpassport.setText("a");
        searchCustomer.txtaddress.setText("a");
        searchCustomer.txtcontact.setText("a");
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
        Assertions.assertEquals(false, customer.checkValues());

    }
    @Test
    void logic4(){
        customer = new searchCustomer();
        searchCustomer.txtcustid.setText("CS001");
        searchCustomer.txtfirstname.setText("a");
        searchCustomer.txtlastname.setText("a");
        searchCustomer.txtnic.setText("");
        searchCustomer.txtpassport.setText("a");
        searchCustomer.txtaddress.setText("a");
        searchCustomer.txtcontact.setText("a");
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
        Assertions.assertEquals(false, customer.checkValues());

    }
    @Test
    void logic5(){
        customer = new searchCustomer();
        searchCustomer.txtcustid.setText("CS001");
        searchCustomer.txtfirstname.setText("a");
        searchCustomer.txtlastname.setText("a");
        searchCustomer.txtnic.setText("a");
        searchCustomer.txtpassport.setText("");
        searchCustomer.txtaddress.setText("a");
        searchCustomer.txtcontact.setText("a");
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
        Assertions.assertEquals(false, customer.checkValues());

    }
    @Test
    void logic6(){
        customer = new searchCustomer();
        searchCustomer.txtcustid.setText("CS001");
        searchCustomer.txtfirstname.setText("a");
        searchCustomer.txtlastname.setText("a");
        searchCustomer.txtnic.setText("a");
        searchCustomer.txtpassport.setText("a");
        searchCustomer.txtaddress.setText("");
        searchCustomer.txtcontact.setText("a");
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
        Assertions.assertEquals(false, customer.checkValues());

    }
    @Test
    void logic7(){
        customer = new searchCustomer();
        searchCustomer.txtcustid.setText("CS001");
        searchCustomer.txtfirstname.setText("a");
        searchCustomer.txtlastname.setText("a");
        searchCustomer.txtnic.setText("a");
        searchCustomer.txtpassport.setText("a");
        searchCustomer.txtaddress.setText("a");
        searchCustomer.txtcontact.setText("");
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
        Assertions.assertEquals(false, customer.checkValues());

    }
    @Test
    void logic8(){
        customer = new searchCustomer();
        searchCustomer.txtcustid.setText(null);
        searchCustomer.txtfirstname.setText("a");
        searchCustomer.txtlastname.setText("a");
        searchCustomer.txtnic.setText("a");
        searchCustomer.txtpassport.setText("a");
        searchCustomer.txtaddress.setText("a");
        searchCustomer.txtcontact.setText("a");
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
        Assertions.assertEquals(false, customer.checkValues());

    }
    @Test
    void logic9(){
        customer = new searchCustomer();
        searchCustomer.txtcustid.setText("CS001");
        searchCustomer.txtfirstname.setText(null);
        searchCustomer.txtlastname.setText("a");
        searchCustomer.txtnic.setText("a");
        searchCustomer.txtpassport.setText("a");
        searchCustomer.txtaddress.setText("a");
        searchCustomer.txtcontact.setText("a");
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
        Assertions.assertEquals(false, customer.checkValues());

    }
    @Test
    void logic10(){
        customer = new searchCustomer();
        searchCustomer.txtcustid.setText("CS001");
        searchCustomer.txtfirstname.setText("a");
        searchCustomer.txtlastname.setText(null);
        searchCustomer.txtnic.setText("a");
        searchCustomer.txtpassport.setText("a");
        searchCustomer.txtaddress.setText("a");
        searchCustomer.txtcontact.setText("a");
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
        Assertions.assertEquals(false, customer.checkValues());

    }
    @Test
    void logic11(){
        customer = new searchCustomer();
        searchCustomer.txtcustid.setText("CS001");
        searchCustomer.txtfirstname.setText("a");
        searchCustomer.txtlastname.setText("a");
        searchCustomer.txtnic.setText(null);
        searchCustomer.txtpassport.setText("a");
        searchCustomer.txtaddress.setText("a");
        searchCustomer.txtcontact.setText("a");
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
        Assertions.assertEquals(false, customer.checkValues());

    }
    @Test
    void logic12(){
        customer = new searchCustomer();
        searchCustomer.txtcustid.setText("CS001");
        searchCustomer.txtfirstname.setText("a");
        searchCustomer.txtlastname.setText("a");
        searchCustomer.txtnic.setText("a");
        searchCustomer.txtpassport.setText(null);
        searchCustomer.txtaddress.setText("a");
        searchCustomer.txtcontact.setText("a");
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
        Assertions.assertEquals(false, customer.checkValues());

    }
    @Test
    void logic13(){
        customer = new searchCustomer();
        searchCustomer.txtcustid.setText("CS001");
        searchCustomer.txtfirstname.setText("a");
        searchCustomer.txtlastname.setText("a");
        searchCustomer.txtnic.setText("a");
        searchCustomer.txtpassport.setText("a");
        searchCustomer.txtaddress.setText(null);
        searchCustomer.txtcontact.setText("a");
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
        Assertions.assertEquals(false, customer.checkValues());
    }
    @Test
    void logic14(){
        customer = new searchCustomer();
        searchCustomer.txtcustid.setText("CS001");
        searchCustomer.txtfirstname.setText("a");
        searchCustomer.txtlastname.setText("a");
        searchCustomer.txtnic.setText("a");
        searchCustomer.txtpassport.setText("a");
        searchCustomer.txtaddress.setText("a");
        searchCustomer.txtcontact.setText(null);
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
        Assertions.assertEquals(false, customer.checkValues());

    }
    @Test
    void logic15(){
        customer = new searchCustomer();
        searchCustomer.txtcustid.setText("CS001");
        searchCustomer.txtfirstname.setText("a");
        searchCustomer.txtlastname.setText("a");
        searchCustomer.txtnic.setText("a");
        searchCustomer.txtpassport.setText("a");
        searchCustomer.txtaddress.setText("a");
        searchCustomer.txtcontact.setText("a");
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
        Assertions.assertEquals(false, customer.checkValues());

    }
    @Test
    void logic16(){
        customer = new searchCustomer();
        searchCustomer.txtcustid.setText("CS001");
        searchCustomer.txtfirstname.setText("a");
        searchCustomer.txtlastname.setText("a");
        searchCustomer.txtnic.setText("a");
        searchCustomer.txtpassport.setText("a");
        searchCustomer.txtaddress.setText("a");
        searchCustomer.txtcontact.setText("a");
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
        Assertions.assertEquals(false, customer.checkValues());

    }



}
