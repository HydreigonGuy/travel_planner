package manager.travel_manager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import traveler.entity.Traveler;
import traveler.service.TravelerService;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Welcome to the travel planner";
    }
}
