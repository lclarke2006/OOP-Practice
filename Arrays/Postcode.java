public class Postcode {
    String firstName;
    String lastName;
    String postcode;

    public Postcode(String firstName, String lastName, String postcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postcode = postcode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPostcode() {
        return postcode;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n"
                + "Postcode: " + postcode + "\n";
    }
}
