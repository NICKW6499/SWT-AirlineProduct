import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class userCreationTest {
User user;
userCreation creator;
    @BeforeEach
    @Test
    void setup(){
        creator = new userCreation();
        userCreation.txtuserid.setText("");
        userCreation.txtfirstname.setText("");
        userCreation.txtlastname.setText("");
        userCreation.txtusername.setText("");
        userCreation.txtpassword.setText("");
        
    }
    
    @Test
    @DisplayName("Empty String Test")
    void jButton1ActionPerformedEmpty() {
        userCreation.jButton1.doClick();
        assertEquals("A field is blank", creator.createUserButton());
    }
    @Test
    @DisplayName("Null String Test")
    void jButton1ActionPerformedNull() {
        userCreation.txtuserid.setText(null);
        userCreation.txtfirstname.setText(null);
        userCreation.txtlastname.setText(null);
        userCreation.txtusername.setText(null);
        userCreation.txtpassword.setText(null);
        userCreation.jButton1.doClick();
        assertEquals("A field is blank", creator.createUserButton());

    }
    @Test
    @DisplayName("Positive Testing")
    void jButton1ActionPerformed() {
        userCreation.txtuserid.setText("1");
        userCreation.txtfirstname.setText("nik");
        userCreation.txtlastname.setText("wri");
        userCreation.txtusername.setText("nwri");
        userCreation.txtpassword.setText("password");
        assertEquals("complete", creator.createUserButton());
    }

    @Test
    void jButton2ActionPerformed() {
        userCreation.jButton2.doClick();
    }
}