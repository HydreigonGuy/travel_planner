package manager.travel_manager.destination.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

import manager.travel_manager.destination.entity.Destination;
import manager.travel_manager.destination.service.DestinationService;

import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/destination")
@RequiredArgsConstructor
@Validated
public class DestinationController {

    private final DestinationService destinationService;

    @PostMapping("/")
    public ResponseEntity<Destination> saveDestination(@RequestBody Destination destination) {
        return ResponseEntity.ok().body(destinationService.saveDestination(destination));
    }
}
