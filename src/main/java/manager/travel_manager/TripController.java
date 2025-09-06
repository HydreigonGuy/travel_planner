package manager.travel_manager.trip.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

import manager.travel_manager.trip.entity.Trip;
import manager.travel_manager.trip.service.TripService;
import manager.travel_manager.destination.entity.Destination;

import lombok.RequiredArgsConstructor;
import java.util.List;


class CreateTripRequest {

    public Trip trip;
    public Destination destination;

}


@RestController
@RequestMapping("/trip")
@RequiredArgsConstructor
@Validated
public class TripController {

    private final TripService tripService;

    @GetMapping("/{id}")
    public ResponseEntity<Trip> getTripById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(tripService.getTripById(id));
    }

    @PostMapping("/")
    public ResponseEntity<Trip> saveTrip(@RequestBody CreateTripRequest newTrip) {
        return ResponseEntity.ok().body(tripService.saveTrip(newTrip.trip));
    }
}
