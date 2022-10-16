package com.li;

import com.li.dao.UserDao;
import com.li.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlus01QuickstartApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
        List<User> users = userDao.selectList(null);
        System.out.println(users);
    }

}
