package ro.turism.sda.project.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.turism.sda.project.entity.Reservation;
import ro.turism.sda.project.mapper.ReservationMapper;
import ro.turism.sda.project.mapper.dto.reservation.ReservationRequest;
import ro.turism.sda.project.mapper.dto.reservation.ReservationResponse;
import ro.turism.sda.project.repository.DestinationRepository;
import ro.turism.sda.project.repository.ReservationRepository;
import ro.turism.sda.project.repository.UserRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationMapper reservationMapper;
    private final UserRepository userRepository;
    private final DestinationRepository destinationRepository;
    private final ReservationRepository reservationRepository;

    public ReservationResponse add(ReservationRequest reservationRequest){
        Reservation reservation = new Reservation();
        reservation.setDepartureDate(reservationRequest.getDepartureDate());
        reservation.setArrivalDate(reservationRequest.getArrivalDate());
        reservation.setNumberOfPeople(reservationRequest.getNumberOfPeople());
        reservation.setUser(userRepository.findById(reservationRequest.getUserId()).orElseThrow());
        reservation.setDestination(destinationRepository.findById(reservationRequest.getDestinationId()).orElseThrow());
        return reservationMapper.map(reservationRepository.save(reservation));
    }

    public void deleteById(int id) {
        reservationRepository.deleteById(id);
    }

    public List<ReservationResponse> getAll() {
        return reservationMapper.map(reservationRepository.findAll());
    }

    public void updateReservation(ReservationRequest reservationRequest) {
        Reservation reservation = reservationRepository.findById(reservationRequest.getId()).orElseThrow();
        reservation.setDepartureDate(reservationRequest.getDepartureDate());
        reservation.setArrivalDate(reservationRequest.getArrivalDate());
        reservation.setNumberOfPeople(reservationRequest.getNumberOfPeople());
        reservation.setUser(userRepository.findById(reservationRequest.getUserId()).orElseThrow());
        reservation.setDestination(destinationRepository.findById(reservationRequest.getDestinationId()).orElseThrow());
    }
}
