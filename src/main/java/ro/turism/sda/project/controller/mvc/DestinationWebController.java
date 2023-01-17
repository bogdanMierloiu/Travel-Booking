package ro.turism.sda.project.controller.mvc;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.turism.sda.project.mapper.dto.IdRequest;
import ro.turism.sda.project.mapper.dto.destination.DestinationResponse;
import ro.turism.sda.project.service.DestinationService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/destination")
public class DestinationWebController {

    private final DestinationService destinationService;

    @GetMapping("/get-destination")
    public String getDestination(@ModelAttribute IdRequest request, Model model) {
        DestinationResponse destination = destinationService.findById(request.getId());
        model.addAttribute("destinationSelected", destination);
        return "createUserPage";
    }
}
