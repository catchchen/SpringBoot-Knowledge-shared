package com.ch.service;

import org.springframework.lang.NonNull;

public interface AdminService {
    // token 失效的时间
    int ACCESS_TOKEN_EXPIRED_SECONDS = 24 * 3600;


    /**
     * Updates admin assets.
     */
    void updateAdminAssets();

    /**
     * 获取日志的内容 查看日志功能
     *
     * @param lines lines
     * @return logs content.
     */
    String getLogFiles(@NonNull Long lines);


}
