#SpringBoot配置文件的加载顺序（优先级由高到低）
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
