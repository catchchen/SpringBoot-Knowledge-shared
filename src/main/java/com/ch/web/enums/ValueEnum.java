package com.ch.web.enums;

import org.springframework.util.Assert;

import java.util.stream.Stream;

public interface ValueEnum<T> {
    /**
     * 将值装换成枚举Enum
     *
     * @param enumType enum type
     * @param value    database value
     * @param <V>      value generic
     * @param <E>      enum generic
     * @return corresponding enum
     */
    //
    static <V, E extends ValueEnum<V>> E valueToEnum(Class<E> enumType, V value) {
        Assert.notNull(enumType, "enum type must not be null");
        Assert.notNull(value, "value must not be null");
        Assert.isTrue(enumType.isEnum(), "type must be an enum type");
        // 类对象的方法
        /**
         * getEnumConstants
         * Returns the elements of this enum class or null if this
         * Class object does not represent an enum type.
         *
         * @return an array containing the values comprising the enum class
         *     represented by this {@code Class} object in the order they're
         *     declared, or null if this {@code Class} object does not
         *     represent an enum type
         * @since 1.5
         */
        return Stream.of(enumType.getEnumConstants())
                .filter(item -> item.getValue().equals(value))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("unknown database value: " + value));
    }
    /**
     * Gets enum value.
     *
     * @return enum value
     */
    T getValue();
}
