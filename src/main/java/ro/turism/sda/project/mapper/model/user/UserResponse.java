package ro.turism.sda.project.mapper.model.user;

import lombok.Data;

@Data
public class UserResponse {
    private Integer id;
    private String name;
    private String email;
}
