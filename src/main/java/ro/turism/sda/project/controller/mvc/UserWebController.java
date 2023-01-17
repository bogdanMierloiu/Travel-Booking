package ro.turism.sda.project.controller.mvc;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.turism.sda.project.mapper.dto.destination.DestinationResponse;
import ro.turism.sda.project.mapper.dto.user.UserRequest;
import ro.turism.sda.project.mapper.dto.user.UserResponse;
import ro.turism.sda.project.mapper.dto.user.WebUserRequest;
import ro.turism.sda.project.service.DestinationService;
import ro.turism.sda.project.service.UserService;

@RequiredArgsConstructor
@Controller
@RequestMapping("/user")
public class UserWebController {
    private final UserService userService;
    private final DestinationService destinationService;

    @GetMapping("/createPage")
    public String goToCreatePage() {
        return "createUserPage";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute WebUserRequest request, Model model) {
        UserRequest userRequest = UserRequest.builder()
                .name(request.getName())
                .email(request.getEmail())
                .build();
        UserResponse userResponse = userService.add(userRequest);

        DestinationResponse destinationResponse = destinationService.findById(request.getDestinationId());
        model.addAttribute("user", userResponse);
        model.addAttribute("destinationSelected", destinationResponse);
        return "reservationPage";
    }
}
