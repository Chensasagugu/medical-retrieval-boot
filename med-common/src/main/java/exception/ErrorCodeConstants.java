package exception;

public interface ErrorCodeConstants {
    class UserError{
        public static final int COMMON_ERROR = 10001;
        public static final String COMMON_ERROR_MSG = "未知异常";

        public static final int USER_NOTFOUND_ERROR = 10002;
        public static final String USER_NOTFOUND_ERROR_MSG = "用户不存在";

        public static final int PASSWORD_ERROR = 10003;
        public static final String PASSWORD_ERROR_MSG = "密码错误";

        public static final int USER_EXIST_ERROR = 10004;
        public static final String USER_EXIST_ERROR_MSG = "用户已存在";

        public static final int NEED_TOKEN_ERROR = 10005;
        public static final String NEED_TOKEN_ERROR_MSG = "需要TOKEN";

        public static final int TOKEN_INVALID_ERROR = 10006;
        public static final String TOKEN_INVALID_ERROR_MSG = "TOKEN失效或者不合法";
    }

}
