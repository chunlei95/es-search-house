package com.java.search.file.controller;

import com.java.search.base.ApiResponse;
import com.java.search.file.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author xzmeasy
 * @version 1.0
 * @since 二月 星期日, 2019
 */
@RestController
public class FileController {

    private final FileService fileService;

    @Autowired
    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @PostMapping("/admin/upload/photo")
    public ApiResponse<Object> upload(@RequestParam MultipartFile file) {
        return fileService.upload(file);
    }

}
