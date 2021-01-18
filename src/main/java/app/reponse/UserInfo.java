package app.reponse;

import app.common.GSonUtils;

public class UserInfo extends GSonUtils<UserInfo> {
    private String userName;
    private String email;
    private String fullName;
    private String numberPhone;
    private String gender;
    private String dateOfBirth;

    public UserInfo() {
    }

    public UserInfo(String userName, String email, String fullName, String numberPhone, String gender, String dateOfBirth) {
        this.userName = userName;
        this.email = email;
        this.fullName = fullName;
        this.numberPhone = numberPhone;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
