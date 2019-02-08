package com.java.search.base;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author xzmeasy
 * @version 1.0
 * @since 星期日 二月,2019
 */
@AllArgsConstructor
@Data
public class ApiResponse<T> {

    private int code;

    private String message;

    private T data;

    private boolean more;

    public static <T> ApiResponse<T> ok(T data) {
        return new ApiResponse<>(ResponseStatus.ACCESS_DENIED.getCode(), ResponseStatus.ACCESS_DENIED.getMessage(), data, false);
    }

    public static <T> ApiResponse<T> error(int code, String message) {
        return new ApiResponse<>(code, message, null, false);
    }

    public static <T> ApiResponse<T> error(int code, String message, T data) {
        return new ApiResponse<>(code, message, data, true);
    }

}
