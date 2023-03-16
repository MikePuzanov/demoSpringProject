package spring.myProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.myProject.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findPersonByMail(String mail);
}
