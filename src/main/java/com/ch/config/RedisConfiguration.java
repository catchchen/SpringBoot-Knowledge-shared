package com.ch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author chenk
 * @date 2022/4/18 22:29
 * @description
 */
@Configuration
public class RedisConfiguration {

    @Bean
    public RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<String,Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        // 指定 k v 序列化方式 json 序列化方式
        Jackson2JsonRedisSerializer<Object> objectJackson2JsonRedisSerializer =
                new Jackson2JsonRedisSerializer<>(Object.class);
//        redisTemplate.setDefaultSerializer();
        // 设置 key 为String序列化方式
        redisTemplate.setValueSerializer(objectJackson2JsonRedisSerializer);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        return redisTemplate;
    }

}
