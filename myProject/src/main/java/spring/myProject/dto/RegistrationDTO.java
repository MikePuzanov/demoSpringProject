package spring.myProject.dto;

public class RegistrationDTO {
    private String name;
    private String surname;
    private String mail;

    private String password;
    private int age;

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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public RegistrationDTO() {
    }

    public RegistrationDTO(String name, String surname, String mail, String password, int age) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.password = password;
        this.age = age;
    }
}
