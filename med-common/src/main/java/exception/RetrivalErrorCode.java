package exception;

import lombok.Getter;

@Getter
public enum RetrivalErrorCode {
    COMMON_ERROR(ErrorCodeConstants.UserError.COMMON_ERROR,ErrorCodeConstants.UserError.COMMON_ERROR_MSG),
    USER_NOT_FOUND_ERROR(ErrorCodeConstants.UserError.USER_NOTFOUND_ERROR,ErrorCodeConstants.UserError.USER_NOTFOUND_ERROR_MSG),
    PASSWORD_ERROR(ErrorCodeConstants.UserError.PASSWORD_ERROR,ErrorCodeConstants.UserError.PASSWORD_ERROR_MSG),
    USER_EXISTS_ERROR(ErrorCodeConstants.UserError.USER_EXIST_ERROR,ErrorCodeConstants.UserError.USER_EXIST_ERROR_MSG),
    NEED_TOKEN_ERROR(ErrorCodeConstants.UserError.NEED_TOKEN_ERROR,ErrorCodeConstants.UserError.NEED_TOKEN_ERROR_MSG),
    TOKEN_INVALID_ERROR(ErrorCodeConstants.UserError.TOKEN_INVALID_ERROR,ErrorCodeConstants.UserError.TOKEN_INVALID_ERROR_MSG)
    ;
    private final int code;
    private final String msg;

    RetrivalErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
