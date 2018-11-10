package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by jt on 7/13/18.
 */
public class Owner extends Person {

    private Set<Pet> pes;

    public Set<Pet> getPes() {
        return pes;
    }

    public void setPes(Set<Pet> pes) {
        this.pes = pes;
    }
}
