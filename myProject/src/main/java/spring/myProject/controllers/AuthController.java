package spring.myProject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.myProject.dto.LoginDTO;
import spring.myProject.dto.RegistrationDTO;
import spring.myProject.services.UserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final UserService personService;
    private final ModelMapper modelMapper;

    @Autowired
    AuthController(UserService personService, ModelMapper modelMapper) {
        this.personService = personService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/registration")
    public void registration(@RequestBody RegistrationDTO registrationDTO) {

    }

    @GetMapping("/login")
    public void login(@RequestBody LoginDTO loginDTO) {

    }
}
