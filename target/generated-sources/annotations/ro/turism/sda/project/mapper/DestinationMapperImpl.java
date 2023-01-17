package ro.turism.sda.project.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ro.turism.sda.project.entity.Destination;
import ro.turism.sda.project.mapper.model.destination.DestinationRequest;
import ro.turism.sda.project.mapper.model.destination.DestinationResponse;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-17T08:38:58+0200",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.2 (Amazon.com Inc.)"
)
@Component
public class DestinationMapperImpl implements DestinationMapper {

    @Override
    public Destination map(DestinationRequest destinationRequest) {
        if ( destinationRequest == null ) {
            return null;
        }

        Destination destination = new Destination();

        destination.setId( destinationRequest.getId() );
        destination.setDestinationName( destinationRequest.getDestinationName() );
        destination.setPrice( destinationRequest.getPrice() );

        return destination;
    }

    @Override
    public DestinationResponse map(Destination destination) {
        if ( destination == null ) {
            return null;
        }

        DestinationResponse destinationResponse = new DestinationResponse();

        destinationResponse.setId( destination.getId() );
        destinationResponse.setDestinationName( destination.getDestinationName() );
        destinationResponse.setPrice( destination.getPrice() );

        return destinationResponse;
    }

    @Override
    public List<DestinationResponse> map(List<Destination> allDestinations) {
        if ( allDestinations == null ) {
            return null;
        }

        List<DestinationResponse> list = new ArrayList<DestinationResponse>( allDestinations.size() );
        for ( Destination destination : allDestinations ) {
            list.add( map( destination ) );
        }

        return list;
    }
}
