package spring.myProject.payload;

public class JWTTokenResponse {
    private boolean success;
    private String token;

    public JWTTokenResponse(boolean success, String token) {
        this.success = success;
        this.token = token;
    }
}
