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
    void jButton1ActionPerformedNull1() {
        userCreation.txtuserid.setText("aa");
        userCreation.txtfirstname.setText("");
        userCreation.txtlastname.setText("aa");
        userCreation.txtusername.setText("aa");
        userCreation.txtpassword.setText("aa");
        userCreation.jButton1.doClick();
        assertEquals("A field is blank", creator.createUserButton());

    }
    @Test
    @DisplayName("Null String Test")
    void jButton1ActionPerformedNull2() {
        userCreation.txtuserid.setText("aa");
        userCreation.txtfirstname.setText("aa");
        userCreation.txtlastname.setText("");
        userCreation.txtusername.setText("aa");
        userCreation.txtpassword.setText("aa");
        userCreation.jButton1.doClick();
        assertEquals("A field is blank", creator.createUserButton());

    }
    @Test
    @DisplayName("Null String Test")
    void jButton1ActionPerformedNull3() {
        userCreation.txtuserid.setText("aa");
        userCreation.txtfirstname.setText("aa");
        userCreation.txtlastname.setText("aa");
        userCreation.txtusername.setText("");
        userCreation.txtpassword.setText("aa");
        userCreation.jButton1.doClick();
        assertEquals("A field is blank", creator.createUserButton());

    }
    @Test
    @DisplayName("Null String Test")
    void jButton1ActionPerformedNull4() {
        userCreation.txtuserid.setText("aa");
        userCreation.txtfirstname.setText("aa");
        userCreation.txtlastname.setText("aa");
        userCreation.txtusername.setText("aa");
        userCreation.txtpassword.setText("");
        userCreation.jButton1.doClick();
        assertEquals("A field is blank", creator.createUserButton());

    }
    @Test
    @DisplayName("Null String Test")
    void jButton1ActionPerformedNull() {
        userCreation.txtuserid.setText("");
        userCreation.txtfirstname.setText("aa");
        userCreation.txtlastname.setText("aa");
        userCreation.txtusername.setText("aa");
        userCreation.txtpassword.setText("aa");
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