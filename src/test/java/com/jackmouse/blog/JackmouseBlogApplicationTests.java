package com.jackmouse.blog;


import com.jackmouse.blog.mapper.UserInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class JackmouseBlogApplicationTests {
    @Resource
    private UserInfoMapper userInfoMapper;
    @Test
    void contextLoads() {
    }

}
