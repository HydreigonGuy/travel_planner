package manager.travel_manager.traveler.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

import manager.travel_manager.traveler.entity.Traveler;
import manager.travel_manager.traveler.service.TravelerService;

import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/traveler")
@RequiredArgsConstructor
@Validated
public class TravelerController {

    private final TravelerService travelerService;

    @GetMapping("/")
    public String index() {
        return "Hello";
    }

    @GetMapping("/{id}")
    public ResponseEntity<Traveler> getTravelerById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(travelerService.getTravelerById(id));
    }

    @PostMapping("/")
    public ResponseEntity<Traveler> saveTraveler(@RequestBody Traveler traveler) {
        return ResponseEntity.ok().body(travelerService.saveTraveler(traveler));
    }
}
