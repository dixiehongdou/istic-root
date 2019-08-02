package com.istic.util;

import org.yangyuan.pay.core.annotation.ResourceFactoryComponent;
import org.yangyuan.pay.core.common.RedisResourceFactory;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @Author: sunwy
 * @Date: 2019/8/2 18:45
 */
@ResourceFactoryComponent
public class DefaultRedisResourceFactory implements RedisResourceFactory {
    private static JedisPool JEDIS_POOL = null;

    private DefaultRedisResourceFactory() {}
    @Override
    public JedisPool getJedisPool() {
        if (JEDIS_POOL == null) {
            synchronized(DefaultRedisResourceFactory.class) {
                if (JEDIS_POOL == null) {
                    JedisPoolConfig poolConfig = new JedisPoolConfig();
                    poolConfig.setMaxTotal(500); // 500个连接
                    poolConfig.setMaxIdle(32); // 最大的空闲连接
                    poolConfig.setMaxWaitMillis(100 * 1000); // 最长的等待时间
                    poolConfig.setTestOnBorrow(true); // 获得一个jedis连接时检测可用性
                    JEDIS_POOL = new JedisPool(poolConfig, "192.168.198.130", 6379);
                }
            }
        }
        return JEDIS_POOL;
    }
}