package guru.springframework.sfgpetclinic.model;

/**
 * Created by jt on 7/13/18.
 */
public class Person extends BaseEntity {

    public Person() {

    }

    public Person(Long id, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String firstName;

    private String lastName;

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
