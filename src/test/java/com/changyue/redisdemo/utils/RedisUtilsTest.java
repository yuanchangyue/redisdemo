package com.changyue.redisdemo.utils;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RedisUtilsTest {

    @Autowired
    private RedisUtils redisUtils;

    @Test
    void expire() {
        System.out.println(redisUtils.expire("test", 20));
    }

    @Test
    void getExpire() {
        System.out.println(redisUtils.getExpire("test"));
    }

    @Test
    void hasKey() {
        System.out.println(redisUtils.hasKey("test"));
    }

    @Test
    void del() {

    }

    @Test
    void get() {
        System.out.println(redisUtils.get("test"));
    }

    @Test
    void set() {
        System.out.println(redisUtils.set("test", "this is a test text!!!!"));
    }

    @Test
    void testSet() {
    }

    @Test
    void incr() {
    }

    @Test
    void decr() {
    }

    @Test
    void hget() {
    }

    @Test
    void hmget() {
    }

    @Test
    void hmset() {
    }

    @Test
    void testHmset() {
    }

    @Test
    void hset() {
    }

    @Test
    void testHset() {
    }

    @Test
    void hdel() {
    }

    @Test
    void hHasKey() {
    }

    @Test
    void hincr() {
    }

    @Test
    void hdecr() {
    }

    @Test
    void sGet() {
    }

    @Test
    void sHasKey() {
    }

    @Test
    void sSet() {
    }

    @Test
    void sSetAndTime() {
    }

    @Test
    void sGetSetSize() {
    }

    @Test
    void setRemove() {
    }

    @Test
    void lGet() {
    }

    @Test
    void lGetListSize() {
    }

    @Test
    void lGetIndex() {
    }

    @Test
    void lSet() {
    }

    @Test
    void testLSet() {
    }

    @Test
    void testLSet1() {
    }

    @Test
    void testLSet2() {
    }

    @Test
    void lUpdateIndex() {
    }

    @Test
    void lRemove() {
    }
}