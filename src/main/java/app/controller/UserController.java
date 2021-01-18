package app.controller;

import app.common.ValidateUtils;
import app.reponse.ChangePasswordUserRequest;
import app.reponse.CreateUserResponse;
import app.reponse.LoginResponse;
import app.request.CreateUserRequest;
import app.request.LoginRequest;
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
        CreateUserResponse res = new CreateUserResponse("phongchodien","phongchodien@gmail.com","Lươn Như Phong",
                "+84964129341","male","06/12/1997");
        return res.convertToGSon(res);
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody LoginRequest requestLogin) {
        if (!ValidateUtils.validInfoUserForLogin(requestLogin)) {
            return "error user";
        }
        LoginResponse res = new LoginResponse("phongchodien","phongchodien@gmail.com",
                "JL4fHYWjxQ49HQzk8V6mSV2XrMb9RmGGkf6qAbr7A3pdQL8jdyagXT7sfqEYn7eeEBMajGh9Wsa8LmCuFtckGk4xyLE4NFMpt5wA",
                "Lươn Như Phong");
        return res.convertToGSon(res);
    }

    @RequestMapping(value = "/change-password-user", method = RequestMethod.POST)
    public String login(@RequestBody ChangePasswordUserRequest req) {
        if (ValidateUtils.validChangePasswordUser(req)){
            return "error";
        }
        return "aa";
    }
}
