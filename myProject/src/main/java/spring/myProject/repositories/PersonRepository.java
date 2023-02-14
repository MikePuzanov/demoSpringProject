package spring.myProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.myProject.models.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
