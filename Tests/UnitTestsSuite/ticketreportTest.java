package UnitTestsSuite;

import airline.ticketreport;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ticketreportTest {
ticketreport report;
    @BeforeEach
    void setUp() {
        report = new ticketreport();
    }

    @Test
    void jButton1ActionPerformed() {
        ticketreport.jButton1.doClick();
    }

    @Test
    void loadData() {
        Assertions.assertEquals("complete",report.LoadData());
    }
}