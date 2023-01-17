package ro.turism.sda.project.controller.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.turism.sda.project.mapper.dto.user.UserRequest;
import ro.turism.sda.project.mapper.dto.user.UserResponse;
import ro.turism.sda.project.service.UserService;

import java.util.List;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("add")
    public UserResponse add(@RequestBody UserRequest userRequest) {
        return userService.add(userRequest);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Integer id) {
        userService.deleteById(id);
    }

    @GetMapping("getAll")
    public List<UserResponse> getAll() {
        return userService.getAll();
    }

    @PatchMapping("updateUser")
    public void updateUser(@RequestBody UserRequest userRequest) {
        userService.updateUser(userRequest);
    }
}
