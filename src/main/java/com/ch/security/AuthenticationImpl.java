package com.ch.security;

import com.ch.security.bean.UserDetail;

public class AuthenticationImpl implements Authentication{
    private final UserDetail userDetail;

    public AuthenticationImpl(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    @Override
    public UserDetail getDetail() {
        return userDetail;
    }
}
