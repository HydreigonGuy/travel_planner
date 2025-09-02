package manager.travel_manager.place.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "place")
public class Place {
    @Id
    private Integer id;
    private String name;
    private Integer timezone;

    //@OneToMany(mappedBy = "place", cascade = CascadeType.ALL)
    //private Set desinations = new HashSet();
}