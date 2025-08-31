package manager.travel_manager.trip.service;

import manager.travel_manager.trip.entity.Trip;
import manager.travel_manager.trip.repository.TripRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class TripService {

    private final TripRepo tripRepo;

    public List<Trip> getAllTrips() {
        return tripRepo.findAll();
    }

    public Trip getTripById(Integer id) {
        Optional<Trip> optionalTrip = tripRepo.findById(id);
        if (optionalTrip.isPresent()) {
            return optionalTrip.get();
        }
        return null;
    }

    public Trip saveTrip(Trip trip) {
        Trip savedTrip = tripRepo.save(trip);
        return savedTrip;
    }

    public void deleteTripById(Integer id) {
        tripRepo.deleteById(id);
    }
}
