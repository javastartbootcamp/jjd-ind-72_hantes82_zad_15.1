package pl.javastart.task;

public class User {
    private String firstName;
    private String lastName;
    private int result;

    public User(String firstName, String lastName, int result) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.result = result;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", result=" + result +
                '}';
    }
}
