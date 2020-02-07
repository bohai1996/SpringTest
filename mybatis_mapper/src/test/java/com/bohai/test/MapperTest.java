package com.bohai.test;

import com.bohai.domain.User;
import com.bohai.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MapperTest {

    public static void main(String[] args) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession =
                sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = new User();
//        user.setId(1);
        user.setUsername("u1111");
        List<User> userList = mapper.findByCondition(user);

        for (User user1 : userList) {
            System.out.println(user1);
        }

        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(2);
        ids.add(3);
        List<User> byIds = mapper.findByIds(ids);
        for (User byId : byIds) {
            System.out.println(byId);
        }

        sqlSession.close();
    }
}
