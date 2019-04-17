package com.maoxf;

import org.apache.log4j.Logger;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametersTest {

    Logger logger = Logger.getLogger(ParametersTest.class.getName());

    @ParameterizedTest
    @ValueSource(strings = {"Maoxf", "Chenl", "Tian", "Fan", "Wu"})
    void test1(String name){
        logger.info(name);
    }

    @ParameterizedTest
    @CsvSource({"Maoxf, R", "Chen, W", "'Wu, 单身汪', W"})
    void test2(String first, String Second){
        logger.info(first);
        logger.info(Second);
    }
}
