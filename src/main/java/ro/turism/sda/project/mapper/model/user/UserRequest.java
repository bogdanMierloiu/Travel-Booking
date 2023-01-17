package ro.turism.sda.project.mapper.model.user;

import lombok.Data;

@Data
public class UserRequest {
    private Integer id;
    private String name;
    private String email;

}
