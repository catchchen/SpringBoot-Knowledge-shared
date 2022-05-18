package com.ch.web.model.dto;
import com.ch.pojo.entity.User;
import com.ch.web.utils.BeanUtils;
import com.ch.web.utils.ReflectionUtils;
import org.springframework.lang.Nullable;

import java.lang.reflect.ParameterizedType;
import java.util.Objects;

/**
 * Converter interface for input DTO.
 * @param <D> Domain对象
 */
public interface InputConverter<D> {
    /**
     * Convert to Domain.(shallow)
     *
     * @return new Domain with same value(not null)
     * @param userClass
     */
    @SuppressWarnings("unchecked")
    default D convertTo(Class<User> userClass) {
        // Get parameterized type
        ParameterizedType currentType = parameterizedType();

        // Assert not equal
        Objects.requireNonNull(currentType, "Cannot fetch actual type because parameterized type is null");

        Class<D> domainClass = (Class<D>) currentType.getActualTypeArguments()[0];

        return BeanUtils.transformFrom(this, domainClass);
    }

    /**
     * Update a Domain by dto.(shallow)
     *
     * @param D updated Domain
     */
    default void update(D D) {
        BeanUtils.updateProperties(this, D);
    }

    /**
     * 获取  参数化类型
     *
     * @return parameterized type or null
     */
    @Nullable
    default ParameterizedType parameterizedType() {
        return ReflectionUtils.getParameterizedType(InputConverter.class, this.getClass());
    }
}
