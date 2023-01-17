package ro.turism.sda.project.mapper.model.destination;

import lombok.Data;

@Data
public class DestinationResponse {
    private Integer id;
    private String destinationName;
    private Integer price;
    private String description;

}
