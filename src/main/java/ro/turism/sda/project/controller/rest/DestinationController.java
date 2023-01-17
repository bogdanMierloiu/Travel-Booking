package ro.turism.sda.project.controller.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.turism.sda.project.mapper.dto.destination.DestinationRequest;
import ro.turism.sda.project.mapper.dto.destination.DestinationResponse;
import ro.turism.sda.project.service.DestinationService;

import java.util.List;

@RestController
@RequestMapping("destination")
@RequiredArgsConstructor
public class DestinationController {
    private final DestinationService destinationService;

    @PostMapping("add")
    public DestinationResponse add(@RequestBody DestinationRequest destinationRequest) {
        return destinationService.add(destinationRequest);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Integer id) {
        destinationService.deleteById(id);
    }

    @GetMapping("getAll")
    public List<DestinationResponse> getAll() {
        return destinationService.getAll();
    }

    @PatchMapping("updateDestination")
    public void updateUser(@RequestBody DestinationRequest destinationRequest) {
        destinationService.updateDestination(destinationRequest);
    }
}
