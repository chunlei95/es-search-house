package com.java.search.file.qiniu;

import lombok.Data;

/**
 * @author xzmeasy
 * @version 1.0
 * @since 二月 星期日, 2019
 */
@Data
public class QiNiuPutRet {

    private String key;

    private String hash;

    private String bucket;

    private Long fsize;

}
