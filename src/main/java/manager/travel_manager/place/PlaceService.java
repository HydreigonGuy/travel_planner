package manager.travel_manager.place.service;

import manager.travel_manager.place.entity.Place;
import manager.travel_manager.place.repository.PlaceRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class PlaceService {

    private final PlaceRepo placeRepo;

    public List<Place> getAllPlaces() {
        return placeRepo.placendAll();
    }

    public Place getPlaceById(Integer id) {
        Optional<Place> optionalPlace = placeRepo.findById(id);
        if (optionalPlace.isPresent()) {
            return optionalPlace.get();
        }
        return null;
    }

    public Place savePlace(Place place) {
        Place savedPlace = placeRepo.save(place);
        return savedPlace;
    }

    public void deletePlaceById(Integer id) {
        placeRepo.deleteById(id);
    }
}
