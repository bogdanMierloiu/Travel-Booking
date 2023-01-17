package ro.turism.sda.project.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ro.turism.sda.project.entity.User;
import ro.turism.sda.project.mapper.dto.user.UserRequest;
import ro.turism.sda.project.mapper.dto.user.UserResponse;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-17T11:41:19+0200",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.2 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User map(UserRequest request) {
        if ( request == null ) {
            return null;
        }

        User user = new User();

        user.setId( request.getId() );
        user.setName( request.getName() );
        user.setEmail( request.getEmail() );

        return user;
    }

    @Override
    public UserResponse map(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse userResponse = new UserResponse();

        userResponse.setId( user.getId() );
        userResponse.setName( user.getName() );
        userResponse.setEmail( user.getEmail() );

        return userResponse;
    }

    @Override
    public List<UserResponse> map(List<User> allUsers) {
        if ( allUsers == null ) {
            return null;
        }

        List<UserResponse> list = new ArrayList<UserResponse>( allUsers.size() );
        for ( User user : allUsers ) {
            list.add( map( user ) );
        }

        return list;
    }
}
