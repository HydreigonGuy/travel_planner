package traveler.service;

import traveler.entity.Traveler;
import traveler.repository.TravelerRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class TravelerService {

    private final TravelerRepo travelerRepo;

    public List<Traveler> getAllTravelers() {
        return travelerRepo.findAll();
    }

    public Traveler getTravelerById(Integer id) {
        Optional<Traveler> optionalTraveler = travelerRepo.findById(id);
        if (optionalTraveler.isPresent()) {
            return optionalTraveler.get();
        }
        return null;
    }

    public Traveler saveTraveler(Traveler traveler) {
        Traveler savedTraveler = travelerRepo.save(traveler);
        return savedTraveler;
    }

    public Traveler updateTraveler(Traveler traveler) {
        Optional <Traveler> existingTraveler = travelerRepo.findById(traveler.getId());
        // traveler.setUsername("123");

        Traveler updatedTraveler = travelerRepo.save(traveler);
        return updatedTraveler;
    }

    public void deleteTravelerById(Integer id) {
        travelerRepo.deleteById(id);
    }
}
