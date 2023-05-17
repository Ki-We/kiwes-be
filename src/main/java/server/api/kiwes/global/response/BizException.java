package server.api.kiwes.global.response;

import lombok.Getter;

@Getter
public class BizException extends RuntimeException{
    private final BaseResponseType baseExceptionType;

    public BizException(BaseResponseType baseExceptionType){
        super(baseExceptionType.getMessage());
        this.baseExceptionType = baseExceptionType;
    }
}
