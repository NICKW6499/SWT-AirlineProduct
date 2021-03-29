import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ticketTest {
 ticket myTicket;
    @Test
    @BeforeEach
    void setup(){
        myTicket = new ticket();
        ticket.txtcustid.setText("");
        ticket.flightno.setText("");
        ticket.txtticketno.setText("");
        ticket.txtclass.setSelectedItem("");
        ticket.txtprice.setText("");
        ticket.txtseats.setValue(1);
        ticket.txtticketno.setText("");
    }

    @Test
    @DisplayName("NullB1")
    void jButton1ActionPerformed() {
        ticket.txtcustid.setText(null);
        ticket.flightno.setText(null);
        ticket.txtticketno.setText(null);
        ticket.txtclass.setSelectedItem(null);
        ticket.txtprice.setText(null);
        ticket.txtseats.setValue(1);
        ticket.txtticketno.setText(null);
        ticket.jButton1.doClick();
    }
    @Test
    @DisplayName("EmptyB1")
    void jButton1ActionPerformed2() {
        ticket.txtcustid.setText("");
        ticket.flightno.setText("");
        ticket.txtticketno.setText("");
        ticket.txtclass.setSelectedItem("");
        ticket.txtprice.setText("");
        ticket.txtseats.setValue(1);
        ticket.txtticketno.setText("");
        ticket.jButton1.doClick();

    }
    @Test
    @DisplayName("PositiveB1")
    void jButton1ActionPerformed3() {
        ticket.txtcustid.setText("CS001");
        ticket.flightno.setText("124");
        ticket.txtticketno.setText("12");
        ticket.txtclass.setSelectedItem("first");
        ticket.txtprice.setText("20");
        ticket.txtseats.setValue(1);
        ticket.txtticketno.setText("234");
        ticket.jButton4.doClick();
        ticket.jButton1.doClick();

    }

    @Test
    @DisplayName("NullB2")
    void jButton2ActionPerformed() {
        ticket.txtcustid.setText(null);
        ticket.flightno.setText(null);
        ticket.txtticketno.setText(null);
        ticket.txtclass.setSelectedItem(null);
        ticket.txtprice.setText(null);
        ticket.txtseats.setValue(1);
        ticket.txtticketno.setText(null);
        ticket.jButton2.doClick();
    }
    @Test
    @DisplayName("EmptyB2")
    void jButton2ActionPerformed2() {
        ticket.txtcustid.setText("");
        ticket.flightno.setText("");
        ticket.txtticketno.setText("");
        ticket.txtclass.setSelectedItem("");
        ticket.txtprice.setText("");
        ticket.txtseats.setValue(1);
        ticket.txtticketno.setText("");
        ticket.jButton2.doClick();

    }
    @Test
    @DisplayName("PositiveB2")
    void jButton2ActionPerformed3() {
        ticket.txtcustid.setText("CS001");
        ticket.flightno.setText("124");
        ticket.txtticketno.setText("12");
        ticket.txtclass.setSelectedItem("first");
        ticket.txtprice.setText("20");
        ticket.txtseats.setValue(1);
        ticket.txtticketno.setText("234");
        ticket.jButton4.doClick();
        ticket.jButton2.doClick();

    }
    
    @Test
    @DisplayName("NullB3")
    void jButton3ActionPerformed() {
        ticket.txtcustid.setText(null);
        ticket.flightno.setText(null);
        ticket.txtticketno.setText(null);
        ticket.txtclass.setSelectedItem(null);
        ticket.txtprice.setText(null);
        ticket.txtseats.setValue(1);
        ticket.txtticketno.setText(null);
        ticket.jButton3.doClick();

    }
    @Test
    @DisplayName("EmptyB3")
    void jButton3ActionPerformed2() {
        ticket.txtcustid.setText("");
        ticket.flightno.setText("");
        ticket.txtticketno.setText("");
        ticket.txtclass.setSelectedItem("");
        ticket.txtprice.setText("");
        ticket.txtseats.setValue(1);
        ticket.txtticketno.setText("");
        ticket.jButton3.doClick();

    }
    @Test
    @DisplayName("PositiveB3")
    void jButton3ActionPerformed3() {
        ticket.txtcustid.setText("CS001");
        ticket.flightno.setText("124");
        ticket.txtticketno.setText("12");
        ticket.txtclass.setSelectedItem("first");
        ticket.txtprice.setText("20");
        ticket.txtseats.setValue(1);
        ticket.txtticketno.setText("234");
        ticket.jButton4.doClick();
        ticket.jButton3.doClick();

    }

    @Test
    @DisplayName("NullB4")
    void jButton4ActionPerformed() {
        ticket.txtcustid.setText(null);
        ticket.flightno.setText(null);
        ticket.txtticketno.setText(null);
        ticket.txtclass.setSelectedItem(null);
        ticket.txtprice.setText(null);
        ticket.txtseats.setValue(1);
        ticket.txtticketno.setText(null);
        ticket.jButton4.doClick();

    }
    @Test
    @DisplayName("EmptyB4")
    void jButton4ActionPerformed2() {
        ticket.txtcustid.setText("");
        ticket.flightno.setText("");
        ticket.txtticketno.setText("");
        ticket.txtclass.setSelectedItem("");
        ticket.txtprice.setText("");
        ticket.txtseats.setValue(1);
        ticket.txtticketno.setText("");
        ticket.jButton4.doClick();

    }
    @Test
    @DisplayName("Positive")
    void jButton4ActionPerformed3() {
        ticket.txtcustid.setText("CS001");
        ticket.flightno.setText("124");
        ticket.txtticketno.setText("12");
        ticket.txtclass.setSelectedItem("first");
        ticket.txtprice.setText("20");
        ticket.txtseats.setValue(1);
        ticket.txtticketno.setText("234");
        ticket.jButton4.doClick();

    }
    
    
    @Test
    void autoID() {

    }

    @Test
    //INTEGRATION TEST
    void jTable1MouseClicked() {

    }

    @Test
    @DisplayName("NullSeats")
    void txtseatsStateChanged() {
        ticket.txtseats.setValue(0);
        ticket.txtticketno.setText(null);

    }
    @Test
    @DisplayName("EmptySeats")

    void txtseatsStateChanged1() {
        ticket.txtseats.setValue(1);
        ticket.txtticketno.setText("");

    }
    @Test
    @DisplayName("PositiveSeats")

    void txtseatsStateChanged2() {
        ticket.txtseats.setValue(10);
        ticket.txtticketno.setText("20");

    }

    
}