package com.li;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.li.dao.UserDao;
import com.li.domain.User;
import com.li.query.UserQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Wrapper;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisPlus02DqlApplicationTests {

    @Autowired
    private UserDao userDao;
    @Test
    void contextLoads() {
        //方式一按条件查询
//        QueryWrapper qw=new QueryWrapper();
//        qw.lt("age",18);
//        List<User> users = userDao.selectList(qw);
//        System.out.println(users);


        //方式二 lambda格式条件查询条件查询
//        QueryWrapper<User> qw=new QueryWrapper();
//        qw.lambda().lt(User::getAge,18);
//        List<User> users = userDao.selectList(qw);
//        System.out.println(users);

////方式3 lambda格式条件查询条件查询
//        LambdaQueryWrapper<User> lqw=new LambdaQueryWrapper<>();
//        lqw.lt(User::getAge,50).gt(User::getAge,18);//并
////        lqw.lt(User::getAge,50).or().gt(User::getAge,18);//或条件
////        lqw.gt(User::getAge,18);
//        List<User> users = userDao.selectList(lqw);
//        System.out.println(users);



        //带上下限的查询
//        UserQuery uq=new UserQuery();
//        //uq.setAge(10);
//        uq.setAge2(30);
//
//        LambdaQueryWrapper<User> lqw=new LambdaQueryWrapper<>();
//        //先判断第一个是不是ture，在连接当前条件
//        lqw.lt(null !=uq.getAge2(),User::getAge,uq.getAge2());
//        lqw.gt(null !=uq.getAge(),User::getAge,uq.getAge());
////        lqw.lt(User::getAge,uq.getAge2()).gt(User::getAge,uq.getAge());//并
//        List<User> users = userDao.selectList(lqw);
//        System.out.println(users);



        //查询投影

//        LambdaQueryWrapper<User> lqw=new LambdaQueryWrapper<>();
//        lqw.select(User::getId,User::getName);

//        QueryWrapper<User> lqw=new QueryWrapper<>();
//        lqw.select("id","name");
//        List<User> users = userDao.selectList(lqw);
//        System.out.println(users);

        QueryWrapper<User> lqw=new QueryWrapper<>();
        lqw.select("count(*) as count,age");//计数
        //分组
        lqw.groupBy("age");
        List<Map<String, Object>> maps = userDao.selectMaps(lqw);
        System.out.println(maps);

    }

}
