package com.bohai.test;

import com.bohai.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    @Test
    // 删除操作
    public void test4() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        sqlSession.delete("userMapper.delete",4);

        sqlSession.close();
    }

    @Test
    // 修改操作
    public void test3() throws IOException {
        User user = new User();
        user.setId(4);
        user.setUsername("u4444");
        user.setPassword("4444");

        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = ssf.openSession();

        sqlSession.update("userMapper.update",user);

        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    // 插入操作
    public void test2() throws IOException {

        User user = new User();

        user.setUsername("xxx");
        user.setPassword("123");

        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        // 设置自动提交事务
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        sqlSession.insert("userMapper.save",user);

        // mybatis执行更新操作提交事务
//        sqlSession.commit();

        // 释放资源
        sqlSession.close();

    }

    @Test
    //查询操作
    public void test1() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        // 获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 获得session 回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 执行操作 参数 namespace+id
        List<User> list = sqlSession.selectList("userMapper.findAll");
        // 打印数据
        for (User user : list) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    // 查询一个对象
    public void test5() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = sqlSession.selectOne("userMapper.findById", 1);
        System.out.println(user);

        sqlSession.close();
    }
}
