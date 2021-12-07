abstract class Person {

    private String firstName;
    private String lastName;

    public Person() {
        firstName = "John";
        lastName = "Doe";
    }

    public Person(String firstName) {
        this.firstName = firstName;
        this.lastName = "Doe";
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
