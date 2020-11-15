package app.common;

public class StoreUtils {
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

}
