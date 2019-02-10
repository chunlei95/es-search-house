package com.java.search.file.qiniu.config;

import com.qiniu.common.Zone;
import com.qiniu.storage.UploadManager;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xzmeasy
 * @version 1.0
 * @since 二月 星期日, 2019
 */
@Configuration
@ConditionalOnClass({com.qiniu.storage.Configuration.class, UploadManager.class})
@EnableConfigurationProperties({QiNiuConfigurationProperties.class})
public class QiNiuAutoConfiguration {

    private final QiNiuConfigurationProperties properties;

    public QiNiuAutoConfiguration(QiNiuConfigurationProperties properties) {
        this.properties = properties;
    }

    @Bean
    @ConditionalOnMissingBean(com.qiniu.storage.Configuration.class)
    public com.qiniu.storage.Configuration configuration() {
        Zone zone = this.properties.getZone();
        return new com.qiniu.storage.Configuration(zone);
    }

    @Bean
    @ConditionalOnMissingBean(UploadManager.class)
    public UploadManager uploadManager() {
        return new UploadManager(configuration());
    }


}
