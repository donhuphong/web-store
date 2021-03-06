package app.reponse;

import app.error.LoginError;

import java.util.ArrayList;
import java.util.List;

public class ResponseLogin {
    private int responseCode = 200;
    private List<Error> errors = new ArrayList<Error>();

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    public void addError(LoginError error) {
        if (error != null) {
            this.errors.add(error);
        }
    }

    public boolean hasErrors() {
        return !this.errors.isEmpty();
    }
}
