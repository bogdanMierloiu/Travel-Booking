package ro.turism.sda.project.controller.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.turism.sda.project.mapper.dto.reservation.ReservationRequest;
import ro.turism.sda.project.mapper.dto.reservation.ReservationResponse;
import ro.turism.sda.project.service.ReservationService;

import java.util.List;

@RestController
@RequestMapping("reservation")
@RequiredArgsConstructor
public class ReservationController {
    private final ReservationService reservationService;

    @PostMapping("add")
    public ReservationResponse add(@RequestBody ReservationRequest reservationRequest) {
        return reservationService.add(reservationRequest);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Integer id) {
        reservationService.deleteById(id);
    }

    @GetMapping("getAll")
    public List<ReservationResponse> getAll() {
        return reservationService.getAll();
    }

    @PatchMapping("updateUser")
    public void updateUser(@RequestBody ReservationRequest reservationRequest) {
        reservationService.updateReservation(reservationRequest);
    }
}
