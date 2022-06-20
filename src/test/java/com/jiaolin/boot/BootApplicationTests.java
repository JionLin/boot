package com.jiaolin.boot;


import com.jiaolin.boot.config.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class BootApplicationTests {


    @Autowired
    DataSource dataSource;

    @Autowired
    private Person person;

    @Test
    public void test1() throws SQLException {
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    public void  test02(){
        System.out.println(person);
    }






}
