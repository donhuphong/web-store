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
@RequestMapping(value = "/api")
public class StoreController {
    public static Gson gson = new Gson();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "hello";
    }
}
