package com.itheima.mp;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.lang.Snowflake;

public class SnowflakeExample {
    public static void main(String[] args) {
        // 设置 workerId 和 datacenterId
        long workerId = 1L;        // 机器 ID (0-31)
        long datacenterId = 1L;    // 数据中心 ID (0-31)

        // 创建 Snowflake 实例
        Snowflake snowflake = IdUtil.createSnowflake(workerId, datacenterId);

        // 生成唯一 ID
        long uniqueId = snowflake.nextId();
        System.out.println("生成的唯一ID: " + uniqueId);
    }
}
