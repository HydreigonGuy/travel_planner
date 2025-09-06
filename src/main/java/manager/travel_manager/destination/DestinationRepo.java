package manager.travel_manager.destination.repository;

import manager.travel_manager.destination.entity.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface DestinationRepo extends JpaRepository<Destination, Integer> {
    List <Destination> findByTrip(Integer trip);
}
