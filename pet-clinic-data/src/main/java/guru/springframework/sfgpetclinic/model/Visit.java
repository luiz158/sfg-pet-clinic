package guru.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="visits")
public class Visit extends BaseEntity {
    private LocalDate date;
    private String description;

    @ManyToOne
    @JoinColumn(name="pet_id")
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }
}
