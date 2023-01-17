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
        DestinationResponse amsterdam = destinationService.findById(1);
        DestinationResponse athena = destinationService.findById(2);
        DestinationResponse frankfurt = destinationService.findById(3);
        DestinationResponse luxembourg = destinationService.findById(4);
        DestinationResponse newYork = destinationService.findById(5);
        DestinationResponse paris = destinationService.findById(6);
        DestinationResponse romeColosseum = destinationService.findById(7);
        DestinationResponse sweden = destinationService.findById(8);
        DestinationResponse switzerland = destinationService.findById(9);
        model.addAttribute("amsterdam", amsterdam);
        model.addAttribute("destinations", destinationResponses);
        model.addAttribute("athena", athena);
        model.addAttribute("frankfurt", frankfurt);
        model.addAttribute("luxembourg", luxembourg);
        model.addAttribute("newYork", newYork);
        model.addAttribute("paris", paris);
        model.addAttribute("romeColosseum", romeColosseum);
        model.addAttribute("sweden", sweden);
        model.addAttribute("switzerland", switzerland);

        return "index";
    }

}
