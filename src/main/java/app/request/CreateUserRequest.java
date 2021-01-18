package app.request;

public class CreateUserRequest {
    private String token;
    private String email;
    private String name;
    private String password;
    private String fullName;
    private String gender;
    private String numberPhone;
    private String role;

    public CreateUserRequest(String token, String email, String name, String password, String fullName, String gender, String phone, String role) {
        this.token = token;
        this.email = email;
        this.name = name;
        this.password = password;
        this.fullName = fullName;
        this.gender = gender;
        this.numberPhone = phone;
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
