import com.toedter.calendar.JCalendar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void autoID() {
        customer.autoID();
    }

    @Test
    @DisplayName("")
    void addImageTest() {
        assertEquals("complete", customer.addImage());
    }

    @Test
    @DisplayName("No image uploaded")
    void addImageTest2() {
        assertEquals("image is empty", customer.addImage());
    }

    @Test
    @DisplayName("Correct Parameters Positive Testing")
    void CreateCustomerT1() {
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
        assertEquals("complete", customer.addUser());
    }

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
        addCustomer.r1.setSelected(true);
        addCustomer.r2.setSelected(false);
        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
        JCalendar txtdob = new JCalendar();
        String date = da.format(txtdob.getDate());
        addCustomer.jButton1.doClick();
        assertEquals("A field is empty", customer.addUser());

    }

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
        assertEquals("A field is empty", customer.addUser());
    }

    @Test
    void jButton3ActionPerformed() {
        addCustomer.jButton3.doClick();
    }
}