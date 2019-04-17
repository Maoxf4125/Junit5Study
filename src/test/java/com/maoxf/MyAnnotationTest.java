package com.maoxf;

import com.maoxf.annotations.Fast;
import org.apache.log4j.Logger;

public class MyAnnotationTest {

    Logger logger = Logger.getLogger(MyAnnotationTest.class.getName());

    @Fast
    void test1(){
        logger.info("自定义Fast注解成功");
    }
}
