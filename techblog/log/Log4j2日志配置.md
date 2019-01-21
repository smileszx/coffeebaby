## Log4j2 日志框架

> [日志框架比较（slf4j、log4j、logback、log4j2 ）](https://blog.csdn.net/vbirdbest/article/details/71751835)  分析的很好，而且分析slf4j作为日志通用接口的优势
>
> 



### 1 Maven构建，pom.xml添加如下依赖

 [Apache Log4j 2 官方文档](https://logging.apache.org/log4j/2.x/maven-artifacts.html)

```xml
<!-- Maven 依赖 -->
<dependencies>
  <dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-api</artifactId>
    <version>2.11.1</version>
  </dependency>
  <dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.11.1</version>
  </dependency>
</dependencies>
```

### 2 Log4j2配置文件

 参考 [HowToDoInJava](https://howtodoinjava.com/log4j2/) 技术分享网站，Demo介绍非常详细

#### 2.1 Log4j2 properties文件配置

##### 2.1 Console控制台输出

```properties

status = error
name = PropertiesConfig
 
filters = threshold
 
filter.threshold.type = ThresholdFilter
filter.threshold.level = debug
 
appenders = console
 
appender.console.type = Console
appender.console.name = STDOUT
appender.console.layout.type = PatternLayout
appender.console.layout.pattern = %d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n
 
rootLogger.level = debug
rootLogger.appenderRefs = stdout
rootLogger.appenderRef.stdout.ref = STDOUT
```

