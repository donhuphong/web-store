package app.request;

import app.common.GSonUtils;
import com.google.gson.Gson;

import javax.swing.*;
import java.util.Date;

public class CreateUserRequest extends GSonUtils<CreateUserRequest> {
    private String userName;
    private int age;
    private String gender;
    private String email;
    private String password;
    private int phoneNumber;
    private String address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CreateUserRequest(){}

    public CreateUserRequest(String userName, int age, String gender, String email, String password, int phoneNumber, String address) {
        this.userName = userName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
