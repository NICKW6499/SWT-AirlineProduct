package IntegrationTestSuite;

import airline.*;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Class IntegrationTestSuite.MockTests
 *
 **/

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

    /**
     * Test Case ID: Integration testing #1 Input validation for Login class
     * Requirement ID/Decription: F1 The flight booking program shall allow a user to log on using a valid username and password combination.
     * Purpose: Tests correctly matching username and password values.
     * Test setup: Created a mock to simulate a matched username and password from the database.
     * Test strategy: Mocking
     * Input: username: hh password: hh
     * Expected Output: "validated"
     **/
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

    /**
     * Test Case ID: Integration Testing #3
     * Requirement ID/Decription: F5 - The flight booking program shall display customer info after searching with customer id.
     * Purpose: To test that all customer fields can be found and viewed when matched with a correct customer ID.
     * Test setup: Created a mock of an existing customer
     * Test strategy: Positive Testing with a mock
     * Input: Calls the CS001 mock
     * Expected Output: Output matches the search customer result with the mocked search customer call.
     **/
    @Test
    public void searchCustomerMock(){
        searchCustomer search = new searchCustomer();
        mockSearch = mock(searchCustomer.class);
        searchCustomer.txtcustid.setText("CS001");
        when(mockSearch.searchCustomer()).thenReturn("complete");
        assertEquals(search.searchCustomer(),mockSearch.searchCustomer());

    }

    /**
     * Test Case ID: Integration Testing #4
     * Requirement ID/Decription: F6 -The flight booking program shall allow for the user to update
     * existing customer info by replacing filled out fields with new information after searching with customer id.
     * Purpose: To test that the update function of the program works correctly.
     * Test setup: Set up a mock with existing customer ID and an updated field.
     * Test strategy: Input validation testing with mock
     * Input: Calls the CS001 mock and updated the first name field of the associated customer ID
     * Expected Output: Output matches the search customer result with the mocked search customer call and updates the
     * selected field.
     **/
    @Test
    public void updateCustomerMock(){
        searchCustomer search = new searchCustomer();
        mockSearch = mock(searchCustomer.class);
        searchCustomer.txtcustid.setText("CS001");
        searchCustomer.txtfirstname.setText("John");
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
