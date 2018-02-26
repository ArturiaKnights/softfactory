项目初始化请执行sql文件

项目架构  spring4 + mybatis3 + mvc
数据库版本  mysql 5.7.20

扫描包路径  com.mobile
Common类  ： 通用类  封装常量 , 通用响应对象 , 响应编码

pojo ： 实体类

vo : Value object 实体类进一步封装到View上可用的数据模型

util : 提供已封装好的joda-time Date类处理  String to Date / Date to String


关于代码规范 ： 开发中遇到的例如 权限、用户名 等常量 一律在Const中定义好枚举 或 静态常量
             这么做是为了加强后期修改代码的维护性

             权限：Role  int 1 代表 系统管理员  int 2 代表普通用户


2.26 ： 新增接口规范  service下方定义接口  在service下创建impl包放置实现类
                   接口名 I+接口名 如IUserService     实现类：UserServiceImpl
