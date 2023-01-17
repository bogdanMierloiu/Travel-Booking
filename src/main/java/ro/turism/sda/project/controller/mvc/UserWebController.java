package ro.turism.sda.project.controller.mvc;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.turism.sda.project.entity.Destination;
import ro.turism.sda.project.entity.User;
import ro.turism.sda.project.mapper.model.destination.DestinationResponse;
import ro.turism.sda.project.mapper.model.user.UserRequest;
import ro.turism.sda.project.mapper.model.user.UserResponse;
import ro.turism.sda.project.service.DestinationService;
import ro.turism.sda.project.service.UserService;

import java.util.List;

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
    public String addUser(@ModelAttribute UserRequest request, Model model) {
        UserResponse userResponse = userService.add(request);
        model.addAttribute("user", userResponse);
        return "index";
    }
}
