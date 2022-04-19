package com.ch.security;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthToken {
    /**
     * Access token.
     * token值
     */
    @JsonProperty("access_token")
    private String accessToken;

    /**
     * 失效时间 s
     */
    @JsonProperty("expired_in")
    private int expiredIn;

    /**
     * Refresh token.
     */
    @JsonProperty("refresh_token")
    private String refreshToken;
}
