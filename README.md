Junit5Study  
==============  
##Junit5 IDEA依赖  
    需要引入相应版本的junit-platform-launcher、junit-jupiter-engine和junit-vintage-engine JAR文件  
    
    //添加Maven依赖  
    <dependency>
        <groupId>org.junit.platform</groupId>
        <artifactId>junit-platform-launcher</artifactId>
        <version>1.2.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.3.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.vintage</groupId>
        <artifactId>junit-vintage-engine</artifactId>
        <version>5.3.0</version>
        <scope>test</scope>
    </dependency>
  
#SampleTest  
    SampleTest 中是基本的Junit5使用方法，相关注解以及Junit5介绍参考：  
    https://sjyuan.cc/junit5/user-guide-cn/#52-%E6%B3%A8%E5%86%8C%E6%89%A9%E5%B1%95  
    
#FailedTest  
    FailedTest 中实现对失败用例的监听方法。结合注解@ExtendWith（）使用  
    
#AllTestAction
    使用发现测试以及测试执行，可以运行多个测试类；  
    Junit4使用测试套件Suite等方法进行多个测试类的执行，在Junit5中使用LauncherDiscoveryRequest、Launcher来实现

#ParametersTest  
    参数化测试方法，目前只提供了ValueSource、CsvSource两种注解方式  

#TagTest  
    增加标签测试，以及如何进行筛选标签  
    （结合ExtendWith注解来进行筛选）  

#OrderTest  
    顺序执行测试的方法  

#MyAnnotationTest  
    增加如何自定义注解，以及使用自定义注解来进行测试  
