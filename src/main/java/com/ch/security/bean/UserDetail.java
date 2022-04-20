package com.ch.security.bean;

import com.ch.pojo.entity.User;
import com.ch.web.exception.AuthenticationException;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.lang.NonNull;
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class UserDetail {
    private User user;

    /**
     * Gets user info.
     *
     * @return user info
     * @throws AuthenticationException throws if the user is null
     */
    @NonNull
    public User getUser() {
        return user;
    }

    /**
     * Sets user info.
     *
     * @param user user info
     */
    public void setUser(User user) {
        this.user = user;
    }
}
