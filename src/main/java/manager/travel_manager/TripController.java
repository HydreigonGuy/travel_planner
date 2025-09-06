package manager.travel_manager.trip.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

import manager.travel_manager.trip.entity.Trip;
import manager.travel_manager.trip.service.TripService;
import manager.travel_manager.destination.entity.Destination;
import manager.travel_manager.destination.service.DestinationService;

import lombok.RequiredArgsConstructor;
import java.util.List;


class CreateTripRequest {

    public Trip trip;
    public Destination destination;

}


class GetTripResponse {
    public Trip trip;
    public List<Destination> destinations;

    public GetTripResponse(Trip t) {
        trip = t;
    }
}


@RestController
@RequestMapping("/trip")
@RequiredArgsConstructor
@Validated
public class TripController {

    private final TripService tripService;
    private final DestinationService destinationService;

    @GetMapping("/{id}")
    public ResponseEntity<GetTripResponse> getTripById(@PathVariable Integer id) {
        Trip trip = tripService.getTripById(id);
        GetTripResponse response = new GetTripResponse(trip);
        response.destinations = destinationService.getTripDestinations(id);
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/")
    public ResponseEntity<String> saveTrip(@RequestBody CreateTripRequest newTrip) {
        Integer newTripId = tripService.saveTrip(newTrip.trip).getId();
        destinationService.saveDestination(newTrip.destination);
        return ResponseEntity.ok().body("OK");
    }
}
