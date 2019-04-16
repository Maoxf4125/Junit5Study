package com.maoxf.listener;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;


public class FailCaseListener implements TestExecutionExceptionHandler {

    public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable{

        //todo
        /**
         * 增加测试失败的监听动作
         */
        System.out.println("请注意，这个case失败了!");
        throw throwable;
    }
}
