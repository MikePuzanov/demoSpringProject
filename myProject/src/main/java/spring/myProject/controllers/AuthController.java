package spring.myProject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.myProject.services.PersonService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final PersonService personService;
    private final ModelMapper modelMapper;


    AuthController(PersonService personService, ModelMapper modelMapper) {
        this.personService = personService;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public void registration() {

    }

    @GetMapping
    public void login() {

    }
}
