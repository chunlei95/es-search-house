package com.java.search.base.exception;

import com.java.search.base.ResponseStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author xzmeasy
 * @version 1.0
 * @since 星期日 二月,2019
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CustomizeException extends RuntimeException {

    private int code;

    public CustomizeException(String message, int code) {
        super(message);
        this.code = code;
    }

    public CustomizeException(ResponseStatus responseStatus) {
        super(responseStatus.getMessage());
        this.code = responseStatus.getCode();
    }
}
