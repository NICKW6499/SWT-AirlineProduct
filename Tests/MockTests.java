import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Class MockTests
 *
 **/
@RunWith(MockitoJUnitRunner.class)

public class MockTests {
    @Mock
    DB dbMock = mock(DB.class);
    @InjectMocks
    searchCustomer mockSearch = mock(searchCustomer.class);
    @InjectMocks
    AddFlight mockFlight = mock(AddFlight.class);
    @InjectMocks
    ticket mockticket = mock(ticket.class);
    @InjectMocks
    ticketreport ticketMock = mock(ticketreport.class);
    @Mock
    Login loginMock;
    @Mock
    User userTest;
    Login myLogin;
    User testUser;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @DisplayName("Mock")
    public void mockTest(){
        //User to be tested
        myLogin = new Login();
        userTest = new User("hh","hh");
        loginMock = mock(Login.class);
        when(loginMock.loginButton("hh","hh")).thenReturn("validated");
        assertEquals("validated", loginMock.loginButton(userTest.getUsername(),
                userTest.getPassword()));

    }

    @Test
    public void addFlightMock(){
        when(mockFlight.addFlightButton()).thenThrow(ClassNotFoundException.class);
        assertThrows(ClassNotFoundException.class, () ->{mockFlight.addFlightButton();});
    }

    @Test
    public void addFlightEmpty(){
        AddFlight flight = new AddFlight();
        mockFlight = mock(AddFlight.class);
        when(mockFlight.addFlightButton()).thenReturn("failed");
        assertEquals(flight.addFlightButton(),mockFlight.addFlightButton());
    }
    @Test
    public void searchCustomerMock(){
        searchCustomer search = new searchCustomer();
        mockSearch = mock(searchCustomer.class);
        searchCustomer.txtcustid.setText("CS001");
        when(mockSearch.searchCustomer()).thenReturn("complete");
        assertEquals(search.searchCustomer(),mockSearch.searchCustomer());

    }
    @Test
    public void ticketMock(){
        ticket ticket = new ticket();
        mockticket = new ticket();
        assertEquals(ticket.loadFlights(),mockticket.loadFlights());

    }
    @Test
    public void customerSearchEmptyMock(){
        searchCustomer customer  = new searchCustomer();
        mockSearch = mock(searchCustomer.class);

        when(mockSearch.searchCustomer()).thenReturn("A field is empty");
        assertEquals(customer.searchCustomer(), mockSearch.searchCustomer());

    }
    @Test
    public void ticketReportMock(){
        ticketreport report = new ticketreport();
        ticketMock = mock(ticketreport.class);
        when(ticketMock.LoadData()).thenReturn("complete");
        assertEquals(report.LoadData(),ticketMock.LoadData());

    }
}
