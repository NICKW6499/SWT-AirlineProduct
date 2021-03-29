import com.toedter.calendar.JCalendar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;

class addCustomerTest {
addCustomer customer= new addCustomer();
    String path=null;
    byte[] userimage=null;
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
    void jButton1ActionPerformed() {
       customer.jButton1.doClick();
    }

    @Test
    @DisplayName("Correct Parameters Positive Testing")
    void CreateCustomerT1() {
        addCustomer.txtid.setText("123");
        addCustomer.txtfirstname.setText("Nick");
        addCustomer.txtlastname.setText("Wright");
        addCustomer.txtnic.setText("231");
        addCustomer.txtpassport.setText("2323");
        addCustomer.txtaddress.setText("yeehaw");
        addCustomer.txtcontact.setText("76876876");
        addCustomer.r1.setSelected(true);
        addCustomer.r2.setSelected(false);
        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
        JCalendar txtdob = new JCalendar();
        String date = da.format(txtdob.getDate());
        addCustomer.jButton1.doClick();
        addCustomer.jButton2.doClick();
    }

    @Test
    void jButton3ActionPerformed() {
        addCustomer.jButton3.doClick();
    }
}