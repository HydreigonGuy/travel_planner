package manager.travel_manager.travel.repository;

import manager.travel_manager.travel.entity.Travel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelRepo extends JpaRepository<Travel, Integer> {
}
