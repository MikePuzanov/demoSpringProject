package spring.myProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import spring.myProject.exceptions.UserLoginException;
import spring.myProject.models.User;
import spring.myProject.models.UserType;
import spring.myProject.payload.SignUpRequest;
import spring.myProject.repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User createUser(SignUpRequest request) {
        User user = new User();
        user.setMail(request.getMail());
        user.setName((request.getName()));
        user.setSurname((request.getSurname()));
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.getPersonType().add(UserType.CLIENT);

        try {
            return userRepository.save(user);
        } catch (Exception e) {
            throw new UserLoginException("");
        }
    }

    public void loginUser() {

    }

    public void getUser() {

    }
}
