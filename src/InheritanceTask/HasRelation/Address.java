package InheritanceTask.HasRelation;

public class Address {
    String street;
    String city;
    String state;
    int zipCode;

    public Address(String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public String toString() {
        return street + ", " + city + ", " + state + " - " + zipCode;
    }
}
