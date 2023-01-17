package ro.turism.sda.project.controller.mvc;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.turism.sda.project.mapper.dto.reservation.ReservationRequest;
import ro.turism.sda.project.mapper.dto.reservation.ReservationResponse;
import ro.turism.sda.project.service.ReservationService;

@Controller
@RequestMapping("/reservation")
@RequiredArgsConstructor
public class ReservationWebController {
    private final ReservationService reservationService;

    @PostMapping("/add-reservation")
    public String addReservation(@ModelAttribute ReservationRequest request, Model model) {
        ReservationResponse reservationResponse = reservationService.add(request);
        model.addAttribute("reservationCreated", reservationResponse);
        return "succesPage";
    }
}
