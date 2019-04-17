package com.maoxf;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class OrderTest {

    Logger logger = Logger.getLogger(OrderTest.class.getName());

    @Test
    @Order(2)
    void test1(){
        logger.info("OrderTest 中排序第一， Order = 2");
    }

    @Test
    @Order(3)
    void test2(){
        logger.info("OrderTest 中排序第二， Order = 3");
    }

    @Test
    @Order(1)
    void test3(){
        logger.info("OrderTest 中排序第三， Order = 1");
    }

    @Test
    @Order(4)
    void test4(){
        logger.info("OrderTest 中排序第四， Order = 4");
    }
}
