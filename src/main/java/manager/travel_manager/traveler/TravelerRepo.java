package manager.travel_manager.traveler.repository;

import manager.travel_manager.traveler.entity.Traveler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelerRepo extends JpaRepository<Traveler, Integer> {
}
