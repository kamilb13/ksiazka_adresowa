package pl.kielce.um;

public class Person {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String city;
    private String street;
    private String postalCode;

    public Person() {
    }

    public Person(String firstName, String lastName, String phoneNumber, String city, String postalCode, String street) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String toString() {
        return firstName + ", "
                + lastName + ", "
                + phoneNumber + ", "
                + city + ", "
                + street + ", "
                + postalCode + '\n';
    }
}
