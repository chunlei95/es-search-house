package com.java.search.file.qiniu;

import com.google.gson.Gson;
import com.java.search.base.ApiResponse;
import com.java.search.file.base.FileTransfer;
import com.java.search.file.qiniu.config.QiNiuConfigurationProperties;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;

/**
 * @author xzmeasy
 * @version 1.0
 * @since 二月 星期日, 2019
 */
@Service
public class QiNiuFileTransfer implements FileTransfer {

    private final String accessKey;

    private final String secretKey;

    private final String bucket;

    private final String key;

    private final UploadManager uploadManager;

    private final QiNiuConfigurationProperties properties;

    @Autowired
    public QiNiuFileTransfer(UploadManager uploadManager, QiNiuConfigurationProperties properties) {
        this.uploadManager = uploadManager;
        this.properties = properties;
        this.accessKey = this.properties.getAccessKey();
        this.secretKey = this.properties.getSecretKey();
        this.bucket = this.properties.getBucket();
        this.key = this.properties.getKey();
    }

    @Override
    public ApiResponse<Object> upload(String filePath) {
        Auth auth = Auth.create(accessKey, secretKey);
        String uploadToken = auth.uploadToken(bucket);
        try {
            Response response = uploadManager.put(filePath, key, uploadToken);
            QiNiuPutRet qiNiuPutRet = new Gson().fromJson(response.bodyString(), QiNiuPutRet.class);
            return ApiResponse.ok(qiNiuPutRet);
        } catch (QiniuException e) {
            return ApiResponse.error(e.code(), e.getMessage());
        }
    }

    @Override
    public ApiResponse<Object> upload(InputStream inputStream) {
        StringMap putPolicy = new StringMap();
        putPolicy.put("returnBody", "{\"key\":\"$(key)\",\"hash\":\"$(etag)\",\"bucket\":\"$(bucket)\",\"fsize\":$(fsize)}");
        Auth auth = Auth.create(accessKey, secretKey);
        String uploadToken = auth.uploadToken(bucket);
        try {
            Response response = uploadManager.put(inputStream, key, uploadToken, putPolicy, null);
            QiNiuPutRet qiNiuPutRet = new Gson().fromJson(response.bodyString(), QiNiuPutRet.class);
            return ApiResponse.ok(qiNiuPutRet);
        } catch (QiniuException e) {
            return ApiResponse.error(e.code(), e.getMessage());
        }
    }

    @Override
    public ApiResponse<Object> download() {
        return null;
    }

}
