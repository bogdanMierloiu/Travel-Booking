package ro.turism.sda.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.turism.sda.project.entity.Destination;
import ro.turism.sda.project.entity.User;

public interface DestinationRepository extends JpaRepository<Destination,Integer> {

}
