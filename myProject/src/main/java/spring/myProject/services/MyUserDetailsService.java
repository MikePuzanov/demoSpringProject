package spring.myProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import spring.myProject.models.User;
import spring.myProject.repositories.UserRepositoryImpl;

@Service
public class MyUserDetailsService implements UserDetailsService {
    private final UserRepositoryImpl personRepository;

    @Autowired
    public MyUserDetailsService(UserRepositoryImpl personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    public User loadUserById(int userId) throws UsernameNotFoundException {
        return null;
    }
}
