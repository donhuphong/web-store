package app.reponse;

public class ChangePasswordUserRequest {
    private String userName;
    private String password;
    private  String confirmPassword;

    public ChangePasswordUserRequest() {
    }

    public ChangePasswordUserRequest(String user, String password, String confirmPassword) {
        this.userName = user;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
