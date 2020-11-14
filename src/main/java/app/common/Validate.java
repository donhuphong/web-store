package app.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.{1,2})+[\\w-]{2,4}$", Pattern.CASE_INSENSITIVE);

    public static boolean validateEmail(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        if (matcher.find()) {
            return false;
        }
        return true;
    }
}
