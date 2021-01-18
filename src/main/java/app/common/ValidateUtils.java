package app.common;

import app.reponse.ChangePasswordUserRequest;
import app.request.CreateUserRequest;
import app.request.LoginRequest;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUtils {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^([\\w-\\.]+@([\\w-]+\\.{1,2})+[\\w-]{2,4})|([0-9\\-\\+]{9,15})$", Pattern.CASE_INSENSITIVE);


    public static boolean validUser(String user) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(user);
        if (StringUtils.isBlank(user)) {
            return false;
        }
        if (!matcher.find()) {
            return false;
        }
        return user.equals("donhuphong1902@gmail.com") || user.equals("123456789");
    }

    public static boolean validPassword(String password) {
        if (StringUtils.isBlank(password)) {
            return false;
        }
        return password.equals("phong");
    }

    public static boolean validInfoUser(CreateUserRequest createUserRequest) {
        String email = createUserRequest.getEmail();
        String password = createUserRequest.getPassword();

        return validUser(email) && validPassword(password);
    }
    
    public static boolean validInfoUserForLogin(LoginRequest req){
        String userName = req.getUserName();
        String password = req.getPassword();

        return validUser(userName) && validPassword(password);
    }

    public static boolean validChangePasswordUser(ChangePasswordUserRequest req){
        String userName = req.getUserName();
        String password = req.getPassword();

        if (validUser(userName) && validPassword(password)){
            return false;
        }
        return password.equals(req.getConfirmPassword());
    }
}
