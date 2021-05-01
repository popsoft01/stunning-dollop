package TestPractice;

public class Account {
    private String firstName;
    private String lastname;
    private String name;

    public void setName(String fisrtName, String lastname) {
        this.firstName = fisrtName;
        this.lastname = lastname;
        name = fisrtName + " "+ lastname;
    }

    public String getName() {
        return name;
    }
}
