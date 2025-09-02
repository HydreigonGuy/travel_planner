package manager.travel_manager.travel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

import manager.travel_manager.place.entity.Place;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "travel")
public class Travel {
    @Id
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "destination_id")
    private Place destination;

    @ManyToOne
    @JoinColumn(name = "origin_id")
    private Place origin;

    private LocalDateTime departure_time;
    private LocalDateTime arrival_time;
}
