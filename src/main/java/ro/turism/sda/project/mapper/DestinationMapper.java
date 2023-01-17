package ro.turism.sda.project.mapper;

import org.mapstruct.Mapper;
import ro.turism.sda.project.entity.Destination;
import ro.turism.sda.project.mapper.model.destination.DestinationRequest;
import ro.turism.sda.project.mapper.model.destination.DestinationResponse;

import java.util.List;

@Mapper
public interface DestinationMapper {
    Destination map(DestinationRequest destinationRequest);
    DestinationResponse map(Destination destination);
    List<DestinationResponse> map(List<Destination> allDestinations);
}
