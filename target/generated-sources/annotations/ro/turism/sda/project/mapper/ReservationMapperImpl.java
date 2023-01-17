package ro.turism.sda.project.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ro.turism.sda.project.entity.Destination;
import ro.turism.sda.project.entity.Reservation;
import ro.turism.sda.project.entity.User;
import ro.turism.sda.project.mapper.model.destination.DestinationResponse;
import ro.turism.sda.project.mapper.model.reservation.ReservationRequest;
import ro.turism.sda.project.mapper.model.reservation.ReservationResponse;
import ro.turism.sda.project.mapper.model.user.UserResponse;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-17T09:33:17+0200",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.2 (Amazon.com Inc.)"
)
@Component
public class ReservationMapperImpl implements ReservationMapper {

    @Override
    public Reservation map(ReservationRequest reservationRequest) {
        if ( reservationRequest == null ) {
            return null;
        }

        Reservation reservation = new Reservation();

        reservation.setId( reservationRequest.getId() );
        reservation.setDepartureDate( reservationRequest.getDepartureDate() );
        reservation.setArrivalDate( reservationRequest.getArrivalDate() );
        reservation.setNumberOfPeople( reservationRequest.getNumberOfPeople() );

        return reservation;
    }

    @Override
    public ReservationResponse map(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ReservationResponse reservationResponse = new ReservationResponse();

        reservationResponse.setId( reservation.getId() );
        reservationResponse.setDepartureDate( reservation.getDepartureDate() );
        reservationResponse.setArrivalDate( reservation.getArrivalDate() );
        reservationResponse.setNumberOfPeople( reservation.getNumberOfPeople() );
        reservationResponse.setUser( userToUserResponse( reservation.getUser() ) );
        reservationResponse.setDestination( destinationToDestinationResponse( reservation.getDestination() ) );

        return reservationResponse;
    }

    @Override
    public List<ReservationResponse> map(List<Reservation> allReservations) {
        if ( allReservations == null ) {
            return null;
        }

        List<ReservationResponse> list = new ArrayList<ReservationResponse>( allReservations.size() );
        for ( Reservation reservation : allReservations ) {
            list.add( map( reservation ) );
        }

        return list;
    }

    protected UserResponse userToUserResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse userResponse = new UserResponse();

        userResponse.setId( user.getId() );
        userResponse.setName( user.getName() );
        userResponse.setEmail( user.getEmail() );

        return userResponse;
    }

    protected DestinationResponse destinationToDestinationResponse(Destination destination) {
        if ( destination == null ) {
            return null;
        }

        DestinationResponse destinationResponse = new DestinationResponse();

        destinationResponse.setId( destination.getId() );
        destinationResponse.setDestinationName( destination.getDestinationName() );
        destinationResponse.setPrice( destination.getPrice() );
        destinationResponse.setDescription( destination.getDescription() );

        return destinationResponse;
    }
}
