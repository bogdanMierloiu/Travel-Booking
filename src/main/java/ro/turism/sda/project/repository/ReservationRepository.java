package ro.turism.sda.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.turism.sda.project.entity.Reservation;
import ro.turism.sda.project.entity.User;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {

}
