package com.changyue.redisdemo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class RedisdemoApplicationTests {

    @Autowired
    private RedisUtils redisUtils;

    @Test
    void get() {
        String test = redisUtils.get("test");
        System.out.println(test);
    }

    @Test
    void set() {
        boolean isSet = redisUtils.set("test", "test");
        System.out.println(isSet);
    }

    @Test
    void del() {
        boolean isDel = redisUtils.delete("mylist");
        System.out.println(isDel);
    }

    @Test
    void update() {
        boolean isUpdate = redisUtils.getAndSet("test", "更新成功");
        System.out.println(isUpdate);
    }

}
