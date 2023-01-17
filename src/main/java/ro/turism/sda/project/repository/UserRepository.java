package ro.turism.sda.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.turism.sda.project.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
