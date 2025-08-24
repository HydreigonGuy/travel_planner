package traveler.repository;

import traveler.entity.Traveler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelerRepo extends JpaRepository<Traveler, Integer> {
}
