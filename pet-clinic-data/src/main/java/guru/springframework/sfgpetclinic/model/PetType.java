package guru.springframework.sfgpetclinic.model;


/**
 * Created by jt on 7/13/18.
 */

public class PetType extends BaseEntity {

    public PetType(Long id, String name) {
        this.name = name;
    }

    private String name;


    @Override
    public String toString() {
        return name;
    }
}
