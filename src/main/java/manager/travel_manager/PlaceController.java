package manager.travel_manager.place.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

import manager.travel_manager.place.entity.Place;
import manager.travel_manager.place.service.PlaceService;

import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/place")
@RequiredArgsConstructor
@Validated
public class PlaceController {

    private final PlaceService placeService;

    @GetMapping("/")
    public ResponseEntity<List<Place>> index() {
        return ResponseEntity.ok().body(placeService.getAllPlaces());
    }

}
