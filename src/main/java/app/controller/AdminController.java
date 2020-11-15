package app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/admin")
public class AdminController {

    @RequestMapping(value = "/create-user", method = RequestMethod.GET)
    public String createUser() {
        return "hello";
    }
}
