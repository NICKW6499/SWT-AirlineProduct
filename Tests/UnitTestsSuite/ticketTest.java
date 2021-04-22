package UnitTestsSuite;

import airline.ticket;
import org.junit.jupiter.api.Assertions;
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
        ticket.txtclass.setSelectedItem("");
        ticket.txtprice.setText("");
        ticket.txtseats.setValue(1);
    }

    @Test
    @DisplayName("NullB1")
    void jButton1ActionPerformed() {
        ticket.txtcustid.setText("");
        ticket.txtclass.setSelectedItem(null);
        ticket.txtprice.setText(null);
        ticket.txtseats.setValue(1);
        ticket.jButton1.doClick();
        Assertions.assertEquals("Please fill in all fields", myTicket.addTicket());

    }
    @Test
    @DisplayName("EmptyB1")
    void jButton1ActionPerformed2() {
        ticket.txtcustid.setText("");
        ticket.txtclass.setSelectedItem("");
        ticket.txtprice.setText("");
        ticket.txtseats.setValue(1);
        ticket.jButton1.doClick();
        Assertions.assertEquals("Please fill in all fields", myTicket.addTicket());


    }
    @Test
    @DisplayName("PositiveB1")
    void jButton1ActionPerformed3() {
        ticket.txtcustid.setText("CS001");
        ticket.txtclass.setSelectedItem("first");
        ticket.txtprice.setText("20");
        ticket.txtseats.setValue(1);
        ticket.jButton4.doClick();
        ticket.jButton1.doClick();
        Assertions.assertEquals("complete", myTicket.addTicket());


    }

    @Test
    @DisplayName("Button Test")
    void jButton2ActionPerformed3() {
        ticket.jButton2.doClick();

    }
    
    @Test
    @DisplayName("NullB3")
    void jButton3ActionPerformed() {
        ticket.txtsource.setSelectedItem(null);
        ticket.txtdepart.setSelectedItem(null);
        ticket.jButton3.doClick();
        Assertions.assertEquals("a field is empty", myTicket.loadFlights());


    }

    @Test
    @DisplayName("PositiveB3")
    void jButton3ActionPerformed3() {
        ticket.txtcustid.setText("CS001");
        ticket.txtclass.setSelectedItem("first");
        ticket.txtprice.setText("20");
        ticket.txtseats.setValue(1);
        ticket.jButton4.doClick();
        ticket.jButton3.doClick();
        Assertions.assertEquals("complete", myTicket.loadFlights());


    }

    @Test
    @DisplayName("NullB4")
    void jButton4ActionPerformed() {
        ticket.txtcustid.setText(null);
        ticket.txtclass.setSelectedItem(null);
        ticket.txtprice.setText(null);
        ticket.txtseats.setValue(1);
        ticket.jButton4.doClick();
        Assertions.assertEquals("A field is empty", myTicket.showInfo());


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
        Assertions.assertEquals("A field is empty", myTicket.showInfo());


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
        Assertions.assertEquals("complete", myTicket.showInfo());


    }
    @Test
    @DisplayName("Incorrect customerID")
    void jButton4ActionPerformed4() {
        ticket.txtcustid.setText("CS009");
        ticket.txtclass.setSelectedItem("first");
        ticket.txtprice.setText("20");
        ticket.txtseats.setValue(1);
        ticket.jButton4.doClick();
        Assertions.assertEquals("record not found", myTicket.showInfo());


    }

  /**
   * Test Case ID: Testing Criteria #8 - Positive and negative testing
   * Requirement ID/Decription: The flight booking program shall book the requested number of seats
   * for a flight.
   * Purpose: To ensure that the number of seats are accepted properly for a valid input, and rejected
   * in the case of an invalid input. The user should be able to input a postive integer for the number of
   * seats they need for their flight reservation.
   * Test setup: A default value is set for the number of seats, which is set to 1. This value gets
   * updated to reflect each of the following unit tests.
   * Test strategy: Positive, negative, and exception handling input testing.
   * -- This test covers three instances of input validation for seat calculation.
   * Input: DisplayName("NullSeats"): 0
   *        DisplayName("EmptySeats"): 1, ticket number set to 0 (non-existant ticket)
   *        DisplayName("PositiveSeats"): 10, price set to 20 (in dollars)
   * Expected Output:
   * DisplayName("NullSeats"): "empty"
   * DisplayName("EmptySeats"): "empty"
   * DisplayName("PositiveSeats"): "complete"
   **/
    @Test
    @DisplayName("NullSeats")
    void txtseatsStateChanged() {
        ticket.txtseats.setValue(0);
        Assertions.assertEquals("empty",myTicket.changeSeats());

    }
    @Test
    @DisplayName("EmptySeats")
    void txtseatsStateChanged1() {
        ticket.txtseats.setValue(1);
        ticket.txtticketno.setText("");
        Assertions.assertEquals("empty",myTicket.changeSeats());

    }
    @Test
    @DisplayName("PositiveSeats")
    void txtseatsStateChanged2() {
        ticket.txtseats.setValue(10);
        ticket.txtprice.setText("20");
        Assertions.assertEquals("complete",myTicket.changeSeats());

    }
    /***************************************************************************/

    @Test
    void logic(){
        ticket.txtcustid.setText("");
        ticket.txtclass.setSelectedItem("a");
        ticket.txtprice.setText("a");
        ticket.txtseats.setValue(1);
        Assertions.assertFalse(myTicket.checkValues());
    }

    @Test
    void logic3(){
        ticket.txtcustid.setText("a");
        ticket.txtclass.setSelectedItem("a");
        ticket.txtprice.setText("");
        ticket.txtseats.setValue(1);
        Assertions.assertFalse(myTicket.checkValues());
    }

}