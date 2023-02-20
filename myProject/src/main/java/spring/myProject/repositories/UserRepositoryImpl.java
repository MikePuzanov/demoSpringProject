package spring.myProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.myProject.models.User;

public interface UserRepositoryImpl extends JpaRepository<User, Integer> {
    public User findPersonByMail(String mail);
}
