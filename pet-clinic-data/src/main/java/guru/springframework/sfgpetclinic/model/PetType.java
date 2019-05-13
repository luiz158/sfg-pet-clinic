package guru.springframework.sfgpetclinic.model;


/**
 * Created by jt on 7/13/18.
 */

public class PetType extends BaseEntity {

    public PetType() {}

    public PetType(Long id, String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
