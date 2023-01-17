package ro.turism.sda.project.mapper.dto.reservation;

import lombok.Data;
import ro.turism.sda.project.mapper.dto.destination.DestinationResponse;
import ro.turism.sda.project.mapper.dto.user.UserResponse;

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
