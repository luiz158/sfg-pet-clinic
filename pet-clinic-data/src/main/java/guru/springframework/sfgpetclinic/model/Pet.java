package guru.springframework.sfgpetclinic.model;


import java.time.LocalDate;

/**
 * Created by jt on 7/13/18.
 */
public class Pet {

    public Pet(Long id, String name, PetType petType, Owner owner, LocalDate birthDate) {
        this.name = name;
        this.petType = petType;
        this.owner = owner;
        this.birthDate = birthDate;
    }

    private String name;

    private PetType petType;

    private Owner owner;

    private LocalDate birthDate;

    // private Set<Visit> visits = new HashSet<>();

}
