package ro.turism.sda.project.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
//import ro.turism.sda.project.entity.Reservation;
import ro.turism.sda.project.entity.User;
import ro.turism.sda.project.mapper.UserMapper;
//import ro.turism.sda.project.mapper.model.email.EmailDetails;
import ro.turism.sda.project.mapper.model.user.UserRequest;
import ro.turism.sda.project.mapper.model.user.UserResponse;
import ro.turism.sda.project.repository.UserRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

//    private final EmailService emailService;

    public UserResponse add(UserRequest userRequest) {
        User user = new User();
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());


//        EmailDetails emailDetails = new EmailDetails();
//        emailDetails.setRecipient(user.getEmail());
//        emailDetails.setSubject("Test!");
//        emailDetails.setMsgBody("Ai reusit!");
//        emailService.sendSimpleMail(emailDetails);
        return userMapper.map(userRepository.save(user));
    }

    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

    public List<UserResponse> getAll() {
        return userMapper.map(userRepository.findAll());
    }

    public void updateUser(UserRequest userRequest) {
        User user = userRepository.findById(userRequest.getId()).orElseThrow();
        user.setName(userRequest.getName());
//        user.setAge(userRequest.getAge());
//        user.setEmail(userRequest.getEmail());
//        user.setPassword(userRequest.getPassword());
    }
}
