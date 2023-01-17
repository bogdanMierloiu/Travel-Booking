package ro.turism.sda.project.mapper.model.reservation;

import jakarta.persistence.Id;
import lombok.Data;
import ro.turism.sda.project.mapper.model.destination.DestinationResponse;
import ro.turism.sda.project.mapper.model.user.UserRequest;
import ro.turism.sda.project.mapper.model.user.UserResponse;

import java.time.LocalDate;

@Data
public class ReservationResponse {

    private Integer id;

    private LocalDate departureDate;
    private LocalDate arrivalDate;

    private Byte numberOfPeople;

    private UserResponse user;

    private DestinationResponse destination;
}
