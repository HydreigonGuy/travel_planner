package manager.travel_manager.destination.entity;

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

import manager.travel_manager.trip.entity.Trip;
import manager.travel_manager.place.entity.Place;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "destination")
public class Destination {
    @Id
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "trip_id")
    private Trip trip;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;
}