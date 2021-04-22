package UnitTestsSuite;

import airline.AddFlight;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class addflightTest {

    AddFlight myFlight;

    /**
     * Test Case ID: Integration Testing #7
     * Requirement ID/Decription: F7 - The flight booking program shall display flights based on
     * source country and departure country.
     * Purpose: To test that flights are added properly with both a source location and departure location
     * to the database.
     * Test setup: Set up a new myFlight object, set up an empty flight id and name, set a default
     * source and departure String, a default format for the date, and empty Strings for depature time,
     * arrival time, and flight charge.
     * Test strategy: Input validation testing
     * Input: Valid text inputs and GUI interactions to test that flights are added correctly.
     * Expected Output: Output matches the expected flight information based on flight information already
     * existant in the database.
     **/
@Test
@BeforeEach
public void setup(){
    
    myFlight = new AddFlight();
    AddFlight.txtflightid.setText("");
    AddFlight.txtflightname.setText("");

    String source = "Alabama";
    String depart = "US";

    DateFormat da = new SimpleDateFormat("yyyy-MM-dd");

    AddFlight.txtdtime.setText("");
    AddFlight.txtarrtime.setText("");
    AddFlight.txtflightcharge.setText("");
}

    @Test
    void autoID() {
        myFlight.autoID();
    }
    @Test
    @DisplayName("Positive Testing")
    public void jButton1Test(){
       AddFlight.txtflightid.setText("abc");
        AddFlight.txtflightname.setText("abc");

        AddFlight.txtsource.setSelectedItem("US");
        AddFlight.txtdepart.setSelectedItem("US");

        Date date = new Date();

        AddFlight.txtdate.setDate(date);
        AddFlight.txtdtime.setText("now");
        AddFlight.txtarrtime.setText("now");
        AddFlight.txtflightcharge.setText("300");
        
        Assertions.assertEquals("complete",myFlight.addFlightButton());
    }
    @Test
    @DisplayName("Test for flight correct flight charge")
    public void jButton1TestNeg0(){
        AddFlight.txtflightid.setText("abc");
        AddFlight.txtflightname.setText("abc");

        AddFlight.txtsource.setSelectedItem("US");
        AddFlight.txtdepart.setSelectedItem("US");

        Date date = new Date();

        AddFlight.txtdate.setDate(date);
        AddFlight.txtdtime.setText("now");
        AddFlight.txtarrtime.setText("now");
        AddFlight.txtflightcharge.setText("-1");

        Assertions.assertEquals("Price must be greater than zero",myFlight.addFlightButton());
    }

    @Test
    @DisplayName("Empty String testing")
    public void jButton1TestNeg(){
        AddFlight.txtflightid.setText("");
        AddFlight.txtflightname.setText("");

        String source = "Alabama";
        String depart = "US";

        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");

        AddFlight.txtdate.setDate(null);
        AddFlight.txtdtime.setText("");
        AddFlight.txtarrtime.setText("");
        AddFlight.txtflightcharge.setText("");
        Assertions.assertEquals("failed",myFlight.addFlightButton());

    }

    @Test
    public void jbutton2Test(){
        AddFlight.jButton2.doClick();
    }

    @Test
    @DisplayName("Null Testing")
    public void jButton1TestNeg3(){
        AddFlight.txtflightid.setText("");
        AddFlight.txtflightname.setText("abc");

        AddFlight.txtsource.setSelectedItem("US");
        AddFlight.txtdepart.setSelectedItem("US");

        Date date = new Date();

        AddFlight.txtdate.setDate(date);
        AddFlight.txtdtime.setText("now");
        AddFlight.txtarrtime.setText("now");
        AddFlight.txtflightcharge.setText("300");
        Assertions.assertEquals("failed",myFlight.addFlightButton());

    }
    @Test
    @DisplayName("Null Testing")
    public void jButton1TestNeg4(){
        AddFlight.txtflightid.setText("abc");
        AddFlight.txtflightname.setText("");

        AddFlight.txtsource.setSelectedItem("US");
        AddFlight.txtdepart.setSelectedItem("US");

        Date date = new Date();

        AddFlight.txtdate.setDate(date);
        AddFlight.txtdtime.setText("now");
        AddFlight.txtarrtime.setText("now");
        AddFlight.txtflightcharge.setText("300");
        Assertions.assertEquals("failed",myFlight.addFlightButton());

    }
    
    @Test
    @DisplayName("Null Testing")
    public void jButton1TestNeg7(){
        AddFlight.txtflightid.setText("abc");
        AddFlight.txtflightname.setText("abc");

        AddFlight.txtsource.setSelectedItem("US");
        AddFlight.txtdepart.setSelectedItem("US");

        Date date = new Date();

        AddFlight.txtdate.setDate(date);
        AddFlight.txtdtime.setText("");
        AddFlight.txtarrtime.setText("now");
        AddFlight.txtflightcharge.setText("300");
        Assertions.assertEquals("failed",myFlight.addFlightButton());

    }
    @Test
    @DisplayName("Null Testing")
    public void jButton1TestNeg8(){
        AddFlight.txtflightid.setText("abc");
        AddFlight.txtflightname.setText("abc");

        AddFlight.txtsource.setSelectedItem("US");
        AddFlight.txtdepart.setSelectedItem("US");

        Date date = new Date();

        AddFlight.txtdate.setDate(date);
        AddFlight.txtdtime.setText("now");
        AddFlight.txtarrtime.setText("");
        AddFlight.txtflightcharge.setText("300");
        Assertions.assertEquals("failed",myFlight.addFlightButton());

    }
    @Test
    @DisplayName("Null Testing")
    public void jButton1TestNeg9(){
        AddFlight.txtflightid.setText("abc");
        AddFlight.txtflightname.setText("abc");

        AddFlight.txtsource.setSelectedItem("US");
        AddFlight.txtdepart.setSelectedItem("US");

        Date date = new Date();

        AddFlight.txtdate.setDate(date);
        AddFlight.txtdtime.setText("now");
        AddFlight.txtarrtime.setText("");
        AddFlight.txtflightcharge.setText("");
        Assertions.assertEquals("failed",myFlight.addFlightButton());

    }
}