package ro.turism.sda.project.controller.mvc;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.turism.sda.project.mapper.dto.destination.DestinationResponse;
import ro.turism.sda.project.mapper.dto.reservation.ReservationRequest;
import ro.turism.sda.project.mapper.dto.reservation.ReservationResponse;
import ro.turism.sda.project.service.DestinationService;
import ro.turism.sda.project.service.ReservationService;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/index")
public class IndexController {
    private final DestinationService destinationService;

    @GetMapping("")
    public String viewIndexPage(Model model) {
        List<DestinationResponse> destinationResponses = destinationService.getAll();
        model.addAttribute("destinations", destinationResponses);
        return "index";
    }

}
