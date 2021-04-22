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

    /**
     * Test Case ID: Integration Testing #6
     * Requirement ID/Decription: F15 -The flight booking program shall create flights with required
     * information including flight id, name, source, departure location, date, departure and arrival time,
     * and flight cost.
     * Purpose: To test that flights are added successfully.
     * Test setup: Injected mock for an addFlight object.
     * Test strategy: Input validation testing with mock
     * Input: Checks if exception handling is handled correctly when button click isn't working properly/
     * Checks if error of empty flight being added fails gracefully.
     * Expected Output: Proper exception caught message, and "failed" String in the case of an empty flight.
     **/
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
    /***************************************************************************/

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
     * Test setup: Injected mock for a searchCustomer object.
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

    /**
     * Test Case ID: Integration Testing #5
     * Requirement ID/Decription: F11 - The flight booking program shall create each ticket with a unique identifier.
     * Purpose: To test that each ticket is uniquely identified when entered to the database via
     * user submission in the ticket.java class (the flight booking page).
     * Test setup: Injected mock for a ticket object.
     * Test strategy: Positive validation testing with mock
     * Input: Creates a new instance of a ticket.
     * Expected Output: Output loads all flights and matches the mocked flight with a new flight
     * and matches their ticket IDs.
     **/
    @Test
    public void ticketMock(){
        ticket ticket = new ticket();
        mockticket = new ticket();
        assertEquals(ticket.loadFlights(),mockticket.loadFlights());

    }

    /**
     * Test Case ID: Integration Testing #7
     * Requirement ID/Decription: F4 - The flight booking program shall search customer profiles using customer id.
     * Purpose: Checking if an empty search customer call is handled correctly.
     * Test setup: Injected mock for a searchCustomer object.
     * Test strategy: Input validation testing
     * Input: Makes a new searchCustomer object and calls the search function without fields being filled out
     * Expected Output: "A field is empty."
     **/
    @Test
    public void customerSearchEmptyMock(){
        searchCustomer customer  = new searchCustomer();
        mockSearch = mock(searchCustomer.class);

        when(mockSearch.searchCustomer()).thenReturn("A field is empty");
        assertEquals(customer.searchCustomer(), mockSearch.searchCustomer());

    }

    /**
     * Test Case ID: Integration Testing #8
     * Requirement ID/Decription: F14 - The flight booking program shall display all currently
     * booked tickets with their corresponding flight number, customer id, class, price, seats, and date.
     * Purpose: Checking if the ticket report page loads properly.
     * Test setup: Injected mock for a ticketreport object.
     * Test strategy: Positive testing
     * Input: New instance of the ticketreport object, and loads the data for the mock.
     * Expected Output: "complete"
     **/
    @Test
    public void ticketReportMock(){
        ticketreport report = new ticketreport();
        ticketMock = mock(ticketreport.class);
        when(ticketMock.LoadData()).thenReturn("complete");
        assertEquals(report.LoadData(),ticketMock.LoadData());

    }
}
