package ro.turism.sda.project.mapper;

import org.mapstruct.Mapper;
import ro.turism.sda.project.entity.Reservation;
import ro.turism.sda.project.mapper.model.reservation.ReservationRequest;
import ro.turism.sda.project.mapper.model.reservation.ReservationResponse;
import java.util.List;

@Mapper
public interface ReservationMapper {
    Reservation map(ReservationRequest reservationRequest);
    ReservationResponse map (Reservation reservation);
    List<ReservationResponse> map (List<Reservation> allReservations);
}
