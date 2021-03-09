import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class addflightTest {

    @Test
    void autoID() {
        addflight flight = new addflight();
        flight.autoID();
    }
}