package com.maoxf;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;

import static org.junit.platform.engine.discovery.ClassNameFilter.includeClassNamePatterns;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage;

public class AllTestAction {

    public static void main(String... args){
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(
                        //选择测试包
                        selectPackage("com.maoxf")

                        //选择测试类
//                        selectClass(SampleTest.class)

                        //选择测试包下的某个类
//                        selectPackage("com.maoxf")
//                        selectClass(SampleTest.class)
                )
                .filters(
                        includeClassNamePatterns(".*Test")
                )
                .build();

        Launcher launcher = LauncherFactory.create();

        /**
         * // 注册一个你选择的监听器
         * TestExecutionListener listener = new SummaryGeneratingListener();
         * launcher.registerTestExecutionListeners(listener);
         */

        //发现测试
        TestPlan testPlan = launcher.discover(request);

        //执行测试
//        launcher.execute(testPlan);
        launcher.execute(request);
    }
}
