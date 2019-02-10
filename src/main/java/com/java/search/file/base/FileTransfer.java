package com.java.search.file.base;

import com.java.search.base.ApiResponse;

import java.io.InputStream;

/**
 * @author xzmeasy
 * @version 1.0
 * @since 二月 星期日, 2019
 */
public interface FileTransfer {

    ApiResponse<Object> upload(String filePath);

    ApiResponse<Object> upload(InputStream inputStream);

    ApiResponse<Object> download();

}
