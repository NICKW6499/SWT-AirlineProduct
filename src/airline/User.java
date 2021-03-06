package airline;

public class User {

    private String username;
    private String password;
    private String id;
    private String firstName;
    private String lastName;

    // Generated default constructor.
    public User(String username, String password, String id, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Overloaded constructor to handle username and password values.
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
