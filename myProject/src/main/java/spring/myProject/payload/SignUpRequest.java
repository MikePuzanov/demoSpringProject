package spring.myProject.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class SignUpRequest {
    @Email(message = "Not be empty!")
    private String mail;
    @Email(message = "Not be empty!")
    private String name;
    @Email(message = "Not be empty!")
    private String surname;
    @Email(message = "Not be empty!")
    @Size(min = 6)
    private String password;
    private String confirmedPassword;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmedPassword() {
        return confirmedPassword;
    }

    public void setConfirmedPassword(String confirmedPassword) {
        this.confirmedPassword = confirmedPassword;
    }
}
