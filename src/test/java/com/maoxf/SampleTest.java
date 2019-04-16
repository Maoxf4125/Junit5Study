package com.maoxf;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SampleTest {

    private static Logger logger = Logger.getLogger(SampleTest.class);

    //测试开始时运行一次
    @BeforeAll
    static void SetUp(){
        logger.info("测试开始时运行一次");
    }

    //测试用例开始时运行一次
    @BeforeEach
    void setUp(){
        logger.info("测试用例开始时运行一次");
    }

    //测试用例结束时运行一次
    @AfterEach
    void tearDown(){
        logger.info("测试用例结束时运行一次");
    }

    //测试结束时运行一次
    @AfterAll
    static void TearDown(){
        logger.info("测试结束时运行一次");
    }

    //测试用例
    @Test
    void test1(){
        logger.info("Test Case 1");
        assertThat(1, is(1));
    }

    @Test
    void test2(){
        logger.info("Test Case 2");
        assertThat(1, is(1));
    }
}
