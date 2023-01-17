package ro.turism.sda.project.controller.mvc;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ro.turism.sda.project.mapper.model.destination.DestinationResponse;
import ro.turism.sda.project.mapper.model.reservation.ReservationRequest;
import ro.turism.sda.project.mapper.model.reservation.ReservationResponse;
import ro.turism.sda.project.repository.ReservationRepository;
import ro.turism.sda.project.service.DestinationService;
import ro.turism.sda.project.service.ReservationService;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class IndexController {
    private final ReservationService reservationService;
    private final DestinationService destinationService;

    @GetMapping()
    public String viewIndexPage(Model model) {
        List<DestinationResponse> destinationResponses = destinationService.getAll();
        DestinationResponse destinationResponse = destinationResponses.get(0);
        model.addAttribute("destination", destinationResponse);
        return "index";
    }

    @PostMapping("/index/createReservation")
    public String createReservation(@ModelAttribute ReservationRequest request, Model model) {
        ReservationResponse reservationResponse = reservationService.add(request);
        model.addAttribute("reservation", reservationResponse);
        return "index";
    }
}
