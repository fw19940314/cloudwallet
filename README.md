### cloudwallet云钱包系统
![https://img.shields.io/badge/build-success-brightgreen.svg?longCache=true&style=flat-square](https://img.shields.io/badge/build-success-brightgreen.svg?longCache=true&style=flat-square)
![https://img.shields.io/badge/license-Apache%202-blue.svg?longCache=true&style=flat-square](https://img.shields.io/badge/license-Apache%202-blue.svg?longCache=true&style=flat-square)
![https://img.shields.io/badge/download-1k-green.svg?longCache=true&style=flat-square](https://img.shields.io/badge/download-1k-green.svg?longCache=true&style=flat-square)
![https://img.shields.io/badge/springboot-2.0.4-yellow.svg?longCache=true&style=popout-square](https://img.shields.io/badge/springboot-2.0.4-yellow.svg?longCache=true&style=popout-square)
![https://img.shields.io/badge/apache%20shiro-1.4.0-green.svg?longCache=true&style=flat-square](https://img.shields.io/badge/apache%20shiro-1.4.0-green.svg?longCache=true&style=flat-square)


###主要技术栈

- 框架 [Spring Boot](http://projects.spring.io/spring-boot/)
- 持久层 [MyBatis ](http://www.mybatis.org/mybatis-3/)
- 安全框架 [Shiro ](http://shiro.apache.org/)
- 资源依赖 [Maven ](https://maven.apache.org/)
- 缓存 [Redis ](https://redis.io/)
- 日志框架 [logback ](https://logback.qos.ch/)
- 消息中间件 [RabbitMQ](http://www.rabbitmq.com/)
- 其他：fastjson，poi，javacsv，quartz等。

### 第三方插件

- 优化代码量 [Lombok](https://projectlombok.org/features/index.html)
- Mybatis插件 [MybatisPlus](http://mp.baomidou.com/guide/generator.html)
- 阿里云存储 [OOS](https://www.aliyun.com/product/oss?utm_content=se_1000110541)
- API文档管理 [Swagger ](https://swagger.io/)



### 功能模块
系统功能模块组成如下所示：
```
项目结构
|java------------------------------------|
|  |--cc          
|    |--mrbird
|      |-- app      app业务相关
|      |-- common   工具类及配置
|      |-- system   系统开发 
|---application 启动类
|resource--------------------------------|
|   |--config 逆向工程配置文件
|   |--docker docekr file配置文件
|   |--ip2redion ip定位服务
|   |--mapper mybatis xml文件
|   |--static 静态文件
|  |--application.yml 配置文件
|  |--logback-spring.xml logback 配置文件
```
 
#### 开发环境

- 语言：Java 8

- IDE：IDEA 2018

- 依赖管理：Maven

- 数据库：MySQL5.7

- 版本管理：git 

