package UnitTestsSuite;

import airline.User;
import airline.userCreation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * class UnitTestsSuite.UserCreationTest
 * This class test for different input in creating user
 */
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

    /**
     * Empty string test
     * No input was added for user
     */
    @Test
    @DisplayName("Empty String Test")
    void jButton1ActionPerformedEmpty() {
        userCreation.jButton1.doClick();
        Assertions.assertEquals("A field is blank", creator.createUserButton());
    }

    /**
     * Null String Test
     * No input was added for firstname
     */
    @Test
    @DisplayName("Null String Test")
    void jButton1ActionPerformedNull1() {
        userCreation.txtuserid.setText("aa");
        userCreation.txtfirstname.setText("");
        userCreation.txtlastname.setText("aa");
        userCreation.txtusername.setText("aa");
        userCreation.txtpassword.setText("aa");
        userCreation.jButton1.doClick();
        Assertions.assertEquals("A field is blank", creator.createUserButton());

    }

    /**
     * Null String Test
     * No input was added for lastname
     */
    @Test
    @DisplayName("Null String Test")
    void jButton1ActionPerformedNull2() {
        userCreation.txtuserid.setText("aa");
        userCreation.txtfirstname.setText("aa");
        userCreation.txtlastname.setText("");
        userCreation.txtusername.setText("aa");
        userCreation.txtpassword.setText("aa");
        userCreation.jButton1.doClick();
        Assertions.assertEquals("A field is blank", creator.createUserButton());

    }

    /**
     * Null String Test
     * No input was added for username
     */
    @Test
    @DisplayName("Null String Test")
    void jButton1ActionPerformedNull3() {
        userCreation.txtuserid.setText("aa");
        userCreation.txtfirstname.setText("aa");
        userCreation.txtlastname.setText("aa");
        userCreation.txtusername.setText("");
        userCreation.txtpassword.setText("aa");
        userCreation.jButton1.doClick();
        Assertions.assertEquals("A field is blank", creator.createUserButton());

    }

    /**
     * Null String Test
     * No input was added for password
     */
    @Test
    @DisplayName("Null String Test")
    void jButton1ActionPerformedNull4() {
        userCreation.txtuserid.setText("aa");
        userCreation.txtfirstname.setText("aa");
        userCreation.txtlastname.setText("aa");
        userCreation.txtusername.setText("aa");
        userCreation.txtpassword.setText("");
        userCreation.jButton1.doClick();
        Assertions.assertEquals("A field is blank", creator.createUserButton());

    }

    /**
     * Null String Test
     * No input was added for user id
     */
    @Test
    @DisplayName("Null String Test")
    void jButton1ActionPerformedNull() {
        userCreation.txtuserid.setText("");
        userCreation.txtfirstname.setText("aa");
        userCreation.txtlastname.setText("aa");
        userCreation.txtusername.setText("aa");
        userCreation.txtpassword.setText("aa");
        userCreation.jButton1.doClick();
        Assertions.assertEquals("A field is blank", creator.createUserButton());

    }

    /**
     * Positive Testing
     * The correct input was added for each field
     * Test Complete
     */
    @Test
    @DisplayName("Positive Testing")
    void jButton1ActionPerformed() {
        userCreation.txtuserid.setText("1");
        userCreation.txtfirstname.setText("nik");
        userCreation.txtlastname.setText("wri");
        userCreation.txtusername.setText("nwri");
        userCreation.txtpassword.setText("password");
        Assertions.assertEquals("complete", creator.createUserButton());
    }

    /**
     * Button click test
     */
    @Test
    void jButton2ActionPerformed() {
        userCreation.jButton2.doClick();
    }
}