package UnitTestsSuite;

import airline.addCustomer;
import com.toedter.calendar.JCalendar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * classs UnitTestsSuite.AddCustomerTest
 * This class test the addCustomer.java class
 */
class addCustomerTest {
    addCustomer customer = new addCustomer();
    String path = null;
    byte[] userimage = null;

    @BeforeEach
    void setUp() {
        addCustomer.txtid.setText("");
        addCustomer.txtfirstname.setText("");
        addCustomer.txtlastname.setText("");
        addCustomer.txtnic.setText("");
        addCustomer.txtpassport.setText("");
        addCustomer.txtaddress.setText("");
        addCustomer.txtcontact.setText("");
        addCustomer.r1.setSelected(false);
        addCustomer.r2.setSelected(false);
    }

    /**
     * AutoId test
     * Test if id is auto generated
     */
    @Test
    void autoID() {
        customer.autoID();
    }

    /**
     * Adding Image Test
     * Test if an image was selected
     */
    @Test
    @DisplayName("")
    void addImageTest() {
        Assertions.assertEquals("complete", customer.addImage());
    }

    /**
     * Test if no image was uploaded
     * Return "image is empty"
     */
    @Test
    @DisplayName("No image uploaded")
    void addImageTest2() {
        Assertions.assertEquals("image is empty", customer.addImage());
    }

    /**
     * Correct parameters positive testing
     * Return complete
     */
    @Test
    @DisplayName("Correct Parameters Positive Testing")
    public void CreateCustomerT1() {
        addCustomer.txtaddress.setText("yeehaw");
        addCustomer.txtcontact.setText("76876876");
        addCustomer.txtfirstname.setText("Nick");
        addCustomer.txtid.setText("123");
        addCustomer.txtlastname.setText("Wright");
        addCustomer.txtnic.setText("231");
        addCustomer.txtpassport.setText("2323");

        addCustomer.r1.setSelected(true);
        addCustomer.r2.setSelected(false);
        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
        JCalendar txtdob = new JCalendar();
        String date = da.format(txtdob.getDate());
        addCustomer.jButton1.doClick();
        addCustomer.jButton2.doClick();
        Assertions.assertEquals("complete", customer.addUser());
    }

    /**
     * Empty string testing
     * No input was added
     * Return a field is empty
     */
    @Test
    @DisplayName("Empty String Testing")
    void CreateCustomerT12() {
        addCustomer.txtid.setText("");
        addCustomer.txtfirstname.setText("");
        addCustomer.txtlastname.setText("");
        addCustomer.txtnic.setText("");
        addCustomer.txtpassport.setText("");
        addCustomer.txtaddress.setText("");
        addCustomer.txtcontact.setText("");
        addCustomer.r1.setSelected(false);
        addCustomer.r2.setSelected(true);
        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
        JCalendar txtdob = new JCalendar();
        String date = da.format(txtdob.getDate());
        addCustomer.jButton1.doClick();
        Assertions.assertEquals("A field is empty", customer.addUser());

    }

    /**
     * Null testing
     */
    @Test
    @DisplayName("Null Testing")
    void CreateCustomerT13() {
        addCustomer.txtid.setText(null);
        addCustomer.txtfirstname.setText(null);
        addCustomer.txtlastname.setText(null);
        addCustomer.txtnic.setText(null);
        addCustomer.txtpassport.setText(null);
        addCustomer.txtaddress.setText(null);
        addCustomer.txtcontact.setText(null);
        addCustomer.r1.setSelected(true);
        addCustomer.r2.setSelected(false);
        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
        JCalendar txtdob = new JCalendar();
        String date = da.format(txtdob.getDate());
        addCustomer.jButton1.doClick();
        Assertions.assertEquals("A field is empty", customer.addUser());
    }

    /**
     * Button click test
     */
    @Test
    void jButton3ActionPerformed() {
        addCustomer.jButton3.doClick();
    }

    /**
     * Null testing
     * No input was added for firstname
     */
    @Test
    void logic2(){
        addCustomer customer = new addCustomer();
        addCustomer.txtid.setText("a");
        addCustomer.txtfirstname.setText("");
        addCustomer.txtlastname.setText("a");
        addCustomer.txtnic.setText("a");
        addCustomer.txtpassport.setText("a");
        addCustomer.txtaddress.setText("a");
        addCustomer.txtcontact.setText("a");
        addCustomer.r1.setSelected(false);
        addCustomer.r2.setSelected(false);
        Assertions.assertEquals(false,customer.checkValues());
    }

    /**
     * Null testing
     * No input was added for lastname
     */
    @Test
    void logic3(){
        addCustomer customer = new addCustomer();
        addCustomer.txtid.setText("a");
        addCustomer.txtfirstname.setText("a");
        addCustomer.txtlastname.setText("");
        addCustomer.txtnic.setText("a");
        addCustomer.txtpassport.setText("a");
        addCustomer.txtaddress.setText("a");
        addCustomer.txtcontact.setText("a");
        addCustomer.r1.setSelected(false);
        addCustomer.r2.setSelected(false);
        Assertions.assertEquals(false,customer.checkValues());
    }

    /**
     * Null testing
     * No input was added for nic
     */
    @Test
    void logic4(){
        addCustomer customer = new addCustomer();
        addCustomer.txtid.setText("a");
        addCustomer.txtfirstname.setText("a");
        addCustomer.txtlastname.setText("a");
        addCustomer.txtnic.setText("");
        addCustomer.txtpassport.setText("a");
        addCustomer.txtaddress.setText("a");
        addCustomer.txtcontact.setText("a");
        addCustomer.r1.setSelected(false);
        addCustomer.r2.setSelected(false);
        Assertions.assertEquals(false,customer.checkValues());
    }

    /**
     * Null testing
     * No input was added for passport
     */
    @Test
    void logic5(){
        addCustomer customer = new addCustomer();
        addCustomer.txtid.setText("a");
        addCustomer.txtfirstname.setText("a");
        addCustomer.txtlastname.setText("a");
        addCustomer.txtnic.setText("a");
        addCustomer.txtpassport.setText("");
        addCustomer.txtaddress.setText("a");
        addCustomer.txtcontact.setText("a");
        addCustomer.r1.setSelected(false);
        addCustomer.r2.setSelected(false);
        Assertions.assertEquals(false,customer.checkValues());
    }

    /**
     * Null testing
     * No input was added for address
     */
    @Test
    void logic6(){
        addCustomer customer = new addCustomer();
        addCustomer.txtid.setText("a");
        addCustomer.txtfirstname.setText("a");
        addCustomer.txtlastname.setText("a");
        addCustomer.txtnic.setText("a");
        addCustomer.txtpassport.setText("a");
        addCustomer.txtaddress.setText("");
        addCustomer.txtcontact.setText("a");
        addCustomer.r1.setSelected(false);
        addCustomer.r2.setSelected(false);
        Assertions.assertEquals(false,customer.checkValues());
    }

    /**
     * Null testing
     * No input was added for contact
     */
    @Test
    void logic7(){
        addCustomer customer = new addCustomer();
        addCustomer.txtid.setText("a");
        addCustomer.txtfirstname.setText("a");
        addCustomer.txtlastname.setText("a");
        addCustomer.txtnic.setText("a");
        addCustomer.txtpassport.setText("a");
        addCustomer.txtaddress.setText("a");
        addCustomer.txtcontact.setText("");
        addCustomer.r1.setSelected(false);
        addCustomer.r2.setSelected(false);
        Assertions.assertEquals(false,customer.checkValues());
    }

    /**
     * Null testing
     * firstname set to null
     */
    @Test
    void logic8(){
        addCustomer customer = new addCustomer();
        addCustomer.txtfirstname.setText(null);
        addCustomer.txtlastname.setText("a");
        addCustomer.txtnic.setText("a");
        addCustomer.txtpassport.setText("a");
        addCustomer.txtaddress.setText("a");
        addCustomer.txtcontact.setText("a");
        addCustomer.r1.setSelected(false);
        addCustomer.r2.setSelected(false);
        Assertions.assertEquals(false,customer.checkValues());
    }

    /**
     * Null testing
     * firstname set to null
     */
    @Test
    void logic9(){
        addCustomer customer = new addCustomer();
        addCustomer.txtid.setText("a");
        addCustomer.txtfirstname.setText(null);
        addCustomer.txtlastname.setText("a");
        addCustomer.txtnic.setText("a");
        addCustomer.txtpassport.setText("a");
        addCustomer.txtaddress.setText("a");
        addCustomer.txtcontact.setText("a");
        addCustomer.r1.setSelected(false);
        addCustomer.r2.setSelected(false);
        Assertions.assertEquals(false,customer.checkValues());
    }

    /**
     * Null testing
     * lastname set to null
     */
    @Test
    void logic10(){
        addCustomer customer = new addCustomer();
        addCustomer.txtid.setText("a");
        addCustomer.txtfirstname.setText("a");
        addCustomer.txtlastname.setText(null);
        addCustomer.txtnic.setText("a");
        addCustomer.txtpassport.setText("a");
        addCustomer.txtaddress.setText("a");
        addCustomer.txtcontact.setText("a");
        addCustomer.r1.setSelected(false);
        addCustomer.r2.setSelected(false);
        Assertions.assertEquals(false,customer.checkValues());
    }

    /**
     * Null testing
     * nic set to null
     */
    @Test
    void logic11(){
        addCustomer customer = new addCustomer();
        addCustomer.txtid.setText("a");
        addCustomer.txtfirstname.setText("a");
        addCustomer.txtlastname.setText("a");
        addCustomer.txtnic.setText(null);
        addCustomer.txtpassport.setText("a");
        addCustomer.txtaddress.setText("a");
        addCustomer.txtcontact.setText("a");
        addCustomer.r1.setSelected(false);
        addCustomer.r2.setSelected(false);
        Assertions.assertEquals(false,customer.checkValues());
    }

    /**
     * Null testing
     * passport set to null
     */
    @Test
    void logic12(){
        addCustomer customer = new addCustomer();
        addCustomer.txtid.setText("a");
        addCustomer.txtfirstname.setText("a");
        addCustomer.txtlastname.setText("a");
        addCustomer.txtnic.setText("a");
        addCustomer.txtpassport.setText(null);
        addCustomer.txtaddress.setText("a");
        addCustomer.txtcontact.setText("a");
        addCustomer.r1.setSelected(false);
        addCustomer.r2.setSelected(false);
        Assertions.assertEquals(false,customer.checkValues());
    }

    /**
     * Null testing
     * Address set to null
     */
    @Test
    void logic13(){
        addCustomer customer = new addCustomer();
        addCustomer.txtid.setText("a");
        addCustomer.txtfirstname.setText("a");
        addCustomer.txtlastname.setText("a");
        addCustomer.txtnic.setText("a");
        addCustomer.txtpassport.setText("");
        addCustomer.txtaddress.setText(null);
        addCustomer.txtcontact.setText("a");
        addCustomer.r1.setSelected(false);
        addCustomer.r2.setSelected(false);
        Assertions.assertEquals(false,customer.checkValues());
    }

    /**
     * Null testing
     * Contract set to null
     */
    @Test
    void logic14(){
        addCustomer customer = new addCustomer();
        addCustomer.txtid.setText("a");
        addCustomer.txtfirstname.setText("a");
        addCustomer.txtlastname.setText("a");
        addCustomer.txtnic.setText("a");
        addCustomer.txtpassport.setText("");
        addCustomer.txtaddress.setText("a");
        addCustomer.txtcontact.setText(null);
        addCustomer.r1.setSelected(false);
        addCustomer.r2.setSelected(false);
        Assertions.assertEquals(false,customer.checkValues());
    }
}