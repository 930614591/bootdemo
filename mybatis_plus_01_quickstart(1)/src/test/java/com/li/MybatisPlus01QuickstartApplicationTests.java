package com.li;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

    @Test
    void testSave(){
        User user = new User();
        user.setAge(18);
        user.setName("lilongang");
        user.setPassword("123456");
        user.setTel("130");
        userDao.insert(user);
    }

    @Test
    void testdelete(){
//        1.5816517206513664e18
        userDao.deleteById(1.5816517206513664e18);
    }

    @Test
    void testupdate(){
        User user = new User();
        user.setAge(18);
        user.setName("lilongang");
        user.setId(1L);
        userDao.updateById(user);
    }

    @Test
    void testById(){
        User user = userDao.selectById(1);
        System.out.println(user);
    }

    @Test
    void tsetGetByPage(){
        IPage page = new Page(2,3);
        userDao.selectPage(page, null);
        System.out.println("当前页码值"+page.getCurrent());
        System.out.println("每页显示数值"+page.getSize());
        System.out.println("一共多少也"+page.getPages());
        System.out.println("一共多少条"+page.getTotal());
        System.out.println("数据"+page.getRecords());
    }

}
