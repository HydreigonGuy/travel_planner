package manager.travel_manager.travel.service;

import manager.travel_manager.travel.entity.Travel;
import manager.travel_manager.travel.repository.TravelRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class TravelService {

    private final TravelRepo travelRepo;

    public List<Travel> getAllTravels() {
        return travelRepo.findAll();
    }

    public Travel getTravelById(Integer id) {
        Optional<Travel> optionalTravel = travelRepo.findById(id);
        if (optionalTravel.isPresent()) {
            return optionalTravel.get();
        }
        return null;
    }

    public Travel saveTravel(Travel travel) {
        Travel savedTravel = travelRepo.save(travel);
        return savedTravel;
    }

    public void deleteTravelById(Integer id) {
        travelRepo.deleteById(id);
    }
}
