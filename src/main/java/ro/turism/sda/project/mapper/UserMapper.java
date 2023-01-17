package ro.turism.sda.project.mapper;

import org.mapstruct.Mapper;
import ro.turism.sda.project.entity.User;
import ro.turism.sda.project.mapper.dto.user.UserRequest;
import ro.turism.sda.project.mapper.dto.user.UserResponse;

import java.util.List;

@Mapper
public interface UserMapper {
    User map(UserRequest request);

    UserResponse map(User user);

    List<UserResponse> map(List<User> allUsers);
}