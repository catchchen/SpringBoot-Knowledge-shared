package com.ch.security;

import com.ch.security.bean.UserDetail;
import org.springframework.lang.NonNull;

public interface Authentication {
    /**
     * Get user detail.
     *
     * @return user detail
     */
    @NonNull
    UserDetail getDetail();
}
