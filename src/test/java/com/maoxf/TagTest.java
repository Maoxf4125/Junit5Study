package com.maoxf;

import com.maoxf.listener.TagListener;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

//该注解会使Tag = Fast的用例不执行
@ExtendWith(TagListener.class)
public class TagTest {

    Logger logger = Logger.getLogger(TagTest.class);

    @Test
    @Tag("Fast")
    void test1(){
        logger.info("Fast Test");
    }

    @Test
    @Tag("Slow")
    void test2(){
        logger.info("Slow Test");
    }
}
