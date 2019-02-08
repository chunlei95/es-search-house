package com.java.search.base;

/**
 * @author xzmeasy
 * @version 1.0
 * @since 星期日 二月,2019
 */
public enum ResponseStatus {

    SUCCESS(200, "success"),
    NOT_FOUND(404, "not found"),
    ACCESS_DENIED(403, "access denied"),
    INTERNAL_SERVER_ERROR(500, "internal server error");
    private int code;

    private String message;

    ResponseStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
