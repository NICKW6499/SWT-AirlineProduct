import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
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



    @Test
    @DisplayName("photo")
    void jButton1ActionPerformed() {
        searchCustomer.jButton1.doClick();
    assertEquals("complete",customer.updatePhoto());

    }
    @Test
    @DisplayName("not jpg or jpeg or other image formats")
    void jButton1ActionPerformed2() {
        assertEquals("An error occurred",customer.updatePhoto());
    }

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
        assertEquals("A field is empty",customer.updateUser());

    }
    @Test
    @DisplayName("empty")
    void jButton2ActionPerformed2() {
        assertEquals("A field is empty",customer.updateUser());


    }
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
        searchCustomer.txtphoto.setText("testImage.png");
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
        customer.updatePhoto();
        assertEquals("complete",customer.updateUser());

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
        searchCustomer.txtphoto.setText("testImage.png");
        searchCustomer.r1.setSelected(true);
        searchCustomer.r2.setSelected(false);
        customer.updatePhoto();
        searchCustomer.jButton2.doClick();
        assertEquals("complete",customer.updateUser());


    }

    @Test
    @DisplayName("")
    void jButton3ActionPerformed() {
        searchCustomer.jButton3.doClick();
    }

    @Test
    @DisplayName("Empty String for id")
    void jButton4ActionPerformed() {
        searchCustomer.txtcustid.setText("");
        searchCustomer.jButton1.doClick();
        assertEquals("A field is empty",customer.searchCustomer());


    }

    @Test
    @DisplayName("null String for id")
    void jButton4ActionPerformed2() {
        searchCustomer.txtcustid.setText(null);
        searchCustomer.jButton1.doClick();
        assertEquals("A field is empty",customer.searchCustomer());


    }
    @Test
    @DisplayName("Positive match for id")
    void jButton4ActionPerformed3() {
        searchCustomer.txtcustid.setText("CS001");
        searchCustomer.jButton1.doClick();
        assertEquals("complete",customer.searchCustomer());


    }
    @Test
    @DisplayName("negative match for id")
    void jButton4ActionPerformed4() {
        searchCustomer.txtcustid.setText("CS005");
        searchCustomer.jButton1.doClick();
        assertEquals("record not found",customer.searchCustomer());
    }

    @Test
    void mockSearchCustomer(){
        searchCustomer.txtcustid.setText("CS009");
        mockCustomer = mock(searchCustomer.class);
        when(mockCustomer.searchCustomer()).thenReturn("record not found");
        assertEquals(mockCustomer.searchCustomer(),"record not found");

    }


}
