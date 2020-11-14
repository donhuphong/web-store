package app.error;

public class LoginError extends Error {

    private String code;
    private String message;
    private String parameter;

    public static final String INTERNAL_SERVER_ERROR_CODE = "API001";
    public static final String INTERNAL_SERVER_ERROR_MSG = "Internal server error";

    public static final String EMAIL_REQUIRED_ERROR_CODE = "API045";
    public static final String EMAIL_REQUIRED_ERROR_MSG = "Email is required";

    public static final String PASS_REQUIRED_ERROR_CODE = "API046";
    public static final String PASS_REQUIRED_ERROR_MSG = "Password is required";

    public static final String DEVICE_ID_REQUIRED_ERROR_CODE = "API112";
    public static final String DEVICE_ID_REQUIRED_ERROR_MSG = "Device ID is required";

    public static final String EMAIL_NOT_YET_REGISTERED_CODE = "API197";
    public static final String EMAIL_NOT_YET_REGISTERED_MSG = "Email not yet registered";

    public LoginError() {
    }

    public LoginError(String code, String message, String parameter) {
        this.code = code;
        this.message = message;
        this.parameter = parameter;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
