package request;

import annotation.FieldDescription;
import lombok.Getter;

/**
 * /medapi/user/login
 * @author chen
 * @date 2023.04.08 18:15
 */
@Getter
public class LoginRequest {
    @FieldDescription("用户名")
    String username;

    @FieldDescription("密码")
    String password;
}
