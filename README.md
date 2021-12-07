## 说明  
  
**使用的jar包**
```xml
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
    <version>2.1.2.RELEASE</version>
</dependency>
```

**添加bootstrap.properties文件**
```properties
spring.cloud.nacos.config.prefix=nacos-config
spring.cloud.nacos.config.file-extension=properties
spring.cloud.nacos.config.group=SERVER
spring.cloud.nacos.config.server-addr=127.0.0.1:8848
## nacos的namespace，需要使用id，用来隔离环境，默认会使用保留命名空间，public
#spring.cloud.nacos.config.namespace=a21b99c3-9425-41da-9d70-859b9e1a7f65

## nacos开关
spring.cloud.nacos.config.refresh-enabled=true
spring.cloud.nacos.config.enabled=true

## nacos账号
#spring.cloud.nacos.config.username=server
#spring.cloud.nacos.config.password=39OaZJLWk4cwUWyW
```

**SpringBoot配置文件的加载顺序（优先级由高到低）**
* 命令行参数
* java:comp/env里的JNDI属性
* JVM系统属性
* 系统环境变量
* 随机生成的带random.*前缀的属性
    > 由jar包外向jar包内进行寻找；
    > 优先加载带profile
* jar包外部的application-{profile}.properties或application.yml(带spring.profile)配置文件[和jar包在同一文件夹下]
* jar包内部的application-{profile}.properties或application.yml(带spring.profile)配置文件
    > 再来加载不带profile
* jar包外部的application.properties或application.yml(不带spring.profile)配置文件[和jar包在同一文件夹下]
* jar包内部的application.properties或application.yml(不带spring.profile)配置文件
* @Configuration注解类上的@PropertySource
* 通过SpringApplication.setDefaultProperties指定的默认属性


**访问**  
http://localhost:8848/nacos/index.html#/login  
用户名：nacos  
密 码：nacos  
  
  
http://localhost:8080/getNacosConfig