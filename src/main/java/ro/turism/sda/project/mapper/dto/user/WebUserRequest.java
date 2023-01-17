package ro.turism.sda.project.mapper.dto.user;

import lombok.Data;

@Data
public class WebUserRequest {
    private Integer id;
    private String name;
    private String email;

    private Integer destinationId;

}
