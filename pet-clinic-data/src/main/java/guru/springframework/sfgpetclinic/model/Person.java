package guru.springframework.sfgpetclinic.model;

/**
 * Created by jt on 7/13/18.
 */
public class Person extends BaseEntity {

    public Person(Long id, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String firstName;

    private String lastName;

}
