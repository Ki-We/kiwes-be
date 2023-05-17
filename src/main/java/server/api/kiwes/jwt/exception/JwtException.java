package server.api.kiwes.jwt.exception;

import server.api.kiwes.global.response.BaseResponseType;
import server.api.kiwes.global.response.BizException;

public class JwtException extends BizException {
    public JwtException(BaseResponseType baseExceptionType) {
        super(baseExceptionType);
    }
}
