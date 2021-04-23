package UnitTestsSuite;

import airline.ticketreport;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class UnitTestsSuite.TicketReportTest.java
 * This class was created to test the ticketReport.java
 * To test button functionality and test if correct data were
 * loaded into the database
 */
class ticketreportTest {
ticketreport report;
    @BeforeEach
    void setUp() {
        report = new ticketreport();
    }

    /**
     * Button Check test
     */
    @Test
    void jButton1ActionPerformed() {
        ticketreport.jButton1.doClick();
    }

    /**
     * Load data in database test
     */
    @Test
    void loadData() {
        Assertions.assertEquals("complete",report.LoadData());
    }
}