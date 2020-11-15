package app.controller;

import app.common.ValidateUtils;
import app.error.LoginError;
import app.reponse.LoginResponse;
import app.request.LoginRequest;
import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import org.apache.http.HttpStatus;

@RestController
public class StoreController {
    public static Gson gson = new Gson();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody LoginRequest requestLogin) {

        LoginResponse response = new LoginResponse();

        if (StringUtils.isBlank(requestLogin.getUsername()) || StringUtils.isBlank(requestLogin.getPassword())) {
            response.setResponseCode(HttpStatus.SC_ACCEPTED);
            response.addError(new LoginError(LoginError.EMAIL_REQUIRED_ERROR_CODE, LoginError.INTERNAL_SERVER_ERROR_MSG, StringUtils.EMPTY));
            return gson.toJson(response);
        }

        System.out.println(requestLogin.getUsername());

        if (ValidateUtils.validEmail(requestLogin.getUsername())) {
            return "valadate email";
        }

        if (!requestLogin.getUsername().equals("thinh@gmail.com") || !requestLogin.getPassword().equals("thinh")) {
            return "Email Or Password Is Not Available";
        }

        return gson.toJson(requestLogin);
    }
}
