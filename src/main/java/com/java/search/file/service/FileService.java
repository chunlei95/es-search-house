package com.java.search.file.service;

import com.java.search.base.ApiResponse;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author xzmeasy
 * @version 1.0
 * @since 二月 星期日, 2019
 */
public interface FileService {

    ApiResponse<Object> upload(MultipartFile file);

}
