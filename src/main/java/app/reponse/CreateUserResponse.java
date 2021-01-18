package app.reponse;

import app.common.GSonUtils;

public class CreateUserResponse extends GSonUtils<CreateUserResponse> {
    private String userName;
    private String email;
    private String fullName;
    private String numberPhone;
    private String gender;
    private String dayOfBirth;

    public CreateUserResponse() {
    }

    public CreateUserResponse(String userName, String email, String fullName, String numberPhone, String gender, String dayOfBirth) {
        this.userName = userName;
        this.email = email;
        this.fullName = fullName;
        this.numberPhone = numberPhone;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
}
