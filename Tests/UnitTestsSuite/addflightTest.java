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