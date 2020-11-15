package app.controller;

import app.common.ValidateUtils;
import app.request.CreateUserRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {
    @RequestMapping(value = "/create_user", method = RequestMethod.POST)
    public String createUser(@RequestBody CreateUserRequest createUserRequest) {
        if (!ValidateUtils.validInfoUser(createUserRequest)) {
            return "error user";
        }
        return createUserRequest.convertToGSon(createUserRequest);
    }
}
