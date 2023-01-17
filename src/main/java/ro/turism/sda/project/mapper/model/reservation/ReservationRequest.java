package ro.turism.sda.project.mapper.model.reservation;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ReservationRequest {
    private Integer id;
    private LocalDate departureDate;
    private LocalDate arrivalDate;

    private Byte numberOfPeople;

    private Integer userId;

    private Integer destinationId;
}
