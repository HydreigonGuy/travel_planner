package manager.travel_manager.trip.repository;

import manager.travel_manager.trip.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepo extends JpaRepository<Trip, Integer> {
}
