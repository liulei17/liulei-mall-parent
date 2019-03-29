# liulei-mall-parent
该项目是本人在日常工作之余学习整合，采用SpringBoot/SpringCloud构建的微服务电商项目.

A、springcloud基础组件
1.使用SpringCloud Eureka作为注册中心，实现服务治理
2.使用Zuul网关框架统一管理微服务请求入口
3.使用config配置中心
4.使用Ribbon实现本地负载均衡器和Fegin客户端调用工具
5.使用Hystrix服务保护框架(服务降级、隔离、熔断、限流)
6.使用消息总线bus RabbitMQ
7.微服务API接口安全控制与单点登陆系统CAS+JWT+Oauth2.0

B、常见分布式解决方案
1.分布式任务调度平台XXL-Job
2.分布式日志采集系统ELK +kafka
3.分布式事务解决方案LCN 
4.分布式锁解决方案Redis
5.分布式配置中心携程阿波罗 
6.高并发分布式全局ID生成雪花算法
7.分布式Session框架Spring-Session
8.分布式服务追踪与调用链ZipKin 
