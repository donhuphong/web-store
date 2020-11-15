package app.common;

import app.request.CreateUserRequest;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUtils {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.{1,2})+[\\w-]{2,4}$", Pattern.CASE_INSENSITIVE);

    public static boolean validEmail(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        if (StringUtils.isBlank(email)) {
            return false;
        }
        if (!matcher.find()) {
            return false;
        }
        return email.equals("donhuphong1902@gmail.com");
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

        return validEmail(email) && validPassword(password);
    }
}
