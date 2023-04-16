package request;

import annotation.FieldDescription;
import lombok.Getter;

/**
 * /medapi/user/register
 * @author chen
 * @date 2023.04.10 12:15
 */
@Getter
public class RegisterRequest {
    @FieldDescription("用户名")
    String username;

    @FieldDescription("密码")
    String password;
}
