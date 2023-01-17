package ro.turism.sda.project.mapper.dto.destination;

import lombok.Data;

@Data
public class DestinationResponse {
    private Integer id;
    private String destinationName;
    private Integer price;
    private String description;

}
