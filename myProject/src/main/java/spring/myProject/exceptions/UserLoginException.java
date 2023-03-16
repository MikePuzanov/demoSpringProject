package spring.myProject.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UserLoginException extends RuntimeException {
    public UserLoginException(String message) {
            super(message);
    }
}
