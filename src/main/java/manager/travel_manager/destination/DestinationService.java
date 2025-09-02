package manager.travel_manager.destination.service;

import manager.travel_manager.destination.entity.Destination;
import manager.travel_manager.destination.repository.DestinationRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class DestinationService {

    private final DestinationRepo destinationRepo;

    public List<Destination> getAllDestinations() {
        return destinationRepo.findAll();
    }

    public Destination getDestinationById(Integer id) {
        Optional<Destination> optionalDestination = destinationRepo.findById(id);
        if (optionalDestination.isPresent()) {
            return optionalDestination.get();
        }
        return null;
    }

    public Destination saveDestination(Destination destinaiton) {
        Destination savedDestination = destinationRepo.save(destinaiton);
        return savedDestination;
    }

    public void deleteDestinationById(Integer id) {
        destinationRepo.deleteById(id);
    }
}
