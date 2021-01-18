package app.reponse;

import app.common.GSonUtils;
import app.request.CreateUserRequest;

public class LoginResponse extends GSonUtils<LoginResponse> {
    private String userName;
    private String email;
    private String token;
    private String fullName;

    public LoginResponse(String userName, String email, String token, String fullName) {
        this.userName = userName;
        this.email = email;
        this.token = token;
        this.fullName = fullName;
    }

    public LoginResponse() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
