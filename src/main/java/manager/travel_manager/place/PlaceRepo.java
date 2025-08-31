package manager.travel_manager.place.repository;

import manager.travel_manager.place.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepo extends JpaRepository<Place, Integer> {
}
