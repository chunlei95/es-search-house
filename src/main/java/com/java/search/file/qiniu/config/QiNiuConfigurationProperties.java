package com.java.search.file.qiniu.config;

import com.qiniu.common.Zone;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xzmeasy
 * @version 1.0
 * @since 二月 星期日, 2019
 */
@Data
@ConfigurationProperties(prefix = "qiniu")
public class QiNiuConfigurationProperties {

    /**
     * 七牛云授权凭证的access key
     */
    private String accessKey;

    /**
     * 七牛云授权凭证的secret key
     */
    private String secretKey;

    /**
     * 七牛云对象存储的存储空间名称
     */
    private String bucket;

    /**
     * 默认不指定key的情况下，以文件内容的hash值作为文件名
     */
    private String key = null;

    private Zone zone = Zone.zone0();

}
