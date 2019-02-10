package com.java.search.file.service.impl;

import com.java.search.base.ApiResponse;
import com.java.search.base.ResponseStatus;
import com.java.search.base.exception.CustomizeException;
import com.java.search.file.base.FileTransfer;
import com.java.search.file.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author xzmeasy
 * @version 1.0
 * @since 二月 星期日, 2019
 */
@Service
public class FileServiceImpl implements FileService {

    private final FileTransfer fileTransfer;

    @Autowired
    public FileServiceImpl(FileTransfer fileTransfer) {
        this.fileTransfer = fileTransfer;
    }

    @Override
    public ApiResponse<Object> upload(MultipartFile file) {
        try {
            InputStream inputStream = file.getInputStream();
            return fileTransfer.upload(inputStream);
        } catch (IOException e) {
            throw new CustomizeException(ResponseStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
