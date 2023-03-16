package spring.myProject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.myProject.payload.JWTTokenResponse;
import spring.myProject.payload.LoginRequest;
import spring.myProject.payload.MessageResponse;
import spring.myProject.payload.SignUpRequest;
import spring.myProject.security.JWTTokenProvider;
import spring.myProject.security.SecurityConstants;
import spring.myProject.services.UserService;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/auth")
@PreAuthorize("permitAll()")
public class AuthController {
    @Autowired
    private UserService userService;
    @Autowired
    private ModelMapper modelMapper;
    private AuthenticationManager authenticationManager;
    @Autowired
    private JWTTokenProvider jwtTokenProvider;

    public AuthController(UserService userService, ModelMapper modelMapper, AuthenticationManager authenticationManager, JWTTokenProvider jwtTokenProvider) {
        this.userService = userService;
        this.modelMapper = modelMapper;
        this.authenticationManager = authenticationManager;
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @PostMapping("/signin")
    public ResponseEntity<Object> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginRequest.getUsername(),
                loginRequest.getPassword())
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = SecurityConstants.TOKEN_PREFIX + jwtTokenProvider.generateToken(authentication);

        return ResponseEntity.ok(new JWTTokenResponse(true, jwt));
    }

    @PostMapping("/signup")
    public ResponseEntity<Object> registration(@Valid @RequestBody SignUpRequest signUpRequest) {
        userService.createUser(signUpRequest);
        return ResponseEntity.ok(new MessageResponse(""));
    }
}
