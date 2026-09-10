package people;

public class AccountOwner {

    private String uuid;

    private String name;

    private String lastName;

    public AccountOwner(String name, String lastName){
        this.name=name;
        this.lastName=lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }
}
