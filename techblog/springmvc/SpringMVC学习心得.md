## 介绍

### 基础概念介绍

#### B/S和C/S架构

- C/S架构就是客户端、服务器架构
- B/S架构就是浏览器、服务器架构

> 说明：Java开发的大多数应用都是Web应用，几乎都是用的B/S架构，应用系统的标准三层架构：表现层、业务层、持久层。

#### 应用系统的三层架构

- 表现层
  - Web层
  - 负责接收用户请求，响应请求结果。通常客户端通过HTTP协议请求Web层，Web层接收HTTP请求，完成HTTP响应
  - 表现层包括展示层和控制层：控制层负责接收请求，展示层负责结果的展示
  - 表现层依赖业务层，接收到客户端请求一般会调用业务层进行业务处理，并将处理结果响应给客户端
  - 表现层设计一般都使用MVC模型（MVC是表现层的设计模型，和其他层没有关系）
- 业务层
  - Service层
  - 负责业务逻辑的处理，和我们开发的项目需求息息相关，Web层依赖业务层，但是业务层不依赖Web层
  - 业务层在业务处理时可能会依赖持久层，如果对数据持久化，需要保证事务的一致性。（也就是说，事务应该放在业务层来控制）
- 持久层
  - Dao层
  - 负责数据持久化，包括数据层即数据层和数据访问层，数据库是对数据库进行持久化的载体，数据访问层是业务层和持久层交互的接口，业务层需要通过数据访问层将数据持久化到数据库
  - 持久层就是和数据库交互，对数据表进行增删改查

#### MVC设计模式

MVC是Model（模型）-View（视图）-控制器（Controller）的缩写，用于设计编写Web应用表现层设计模式

MVC设计模式的三大角色

- Model 模型

  包含业务模型和数据模型，数据模型用于封装数据，业务模型用于处理业务

- View 视图

  通常指展示数据的，比如JSP和HTML。视图依据数据模型创建

- Controller 控制器

  应用程序中处理用户交互的部分，处理程序逻辑。

### SpringMVC介绍

#### SpringMVC是什么？

- SpringMVC是一种基于MVC设计模型的**请求驱动**类型的轻量级Web框架，属于SpringFramework的后续产品，已经融合在Spring Web FLow里面。Spring框架提供构建Web应用程序的全功能MVC模块。
- 使用Spring可插入的MVC架构，从而在使用Spring进行Web开发时，可以选择使用Spring的SpringMVC框架或集成其他MVC开发框架，如Struts2
- SpringMVC已经成为目前最主流的MVC框架之一，并且随着Spring3.0的发布，全面超越Struts2，成为最优秀的MVC框架
- 通过一套注解，让一个简单的Java类成为处理请求的控制器，无需实现任何接口。支持RESTful编程风格的请求

#### SpringMVC与Spring的联系

SpringMVC全名叫Spring Web MVC，它是Spring家族Web模块的一个重要成员。

SpringMVC目前市场占有率远超于Struts2，作为Web开发从业人员，深入学习其框架原理对提升架构思维很有帮助。

#### SpringMVC原理

##### 六大组件说明

- DispatcherServlet： 前端控制器

  用户请求到达前端控制器，它相当于MVC模式中的C，DispatcherServlet是整个流程控制的中心，由它调用其他组件处理用户的请求，DispatcherServlet的存在降低了组件之间的耦合性。

- HandlerMapping：处理器映射器

  HandlerMapping负责根据用户请求找到Handler即处理器，SpringMVC提供了不同的映射器实现不同的映射方式，如配置文件方式、实现接口方式、注解方式等

- Handler：处理器

  Handler是继DispatcherServlet前端控制器的后端控制器，在DispatcherServlet的控制下Handler对具体的用户请求进行处理

  由于Handler涉及到具体的用户业务请求，所以一般情况需要程序员根据业务需求开发Handler

- HandlerAdapter：处理器适配器

  通过HandlerAdapter对处理器进行执行，这是适配器模式的应用，通过扩展适配器可以对更多类型的处理器进行执行

- View Resolver：视图解析器

  View Resolver负责将处理器结果生成View视图，View Resolver首先根据逻辑视图名解析成物理视图名即具体的页面地址，再生成View视图对象，最后对View进行渲染将处理结果通过页面展示给用户

- View：视图

  SpringMVC框架提供了很多的View视图类型的支持，包括jstlView、freemakerView、pdfView等。最常用的是jsp

  一般情况下需要通过页面标签或页面模板技术将模型数据通过页面展示给用户，需要程序员根据业务需求开发具体的页面。

> 说明：
>
> 1.在SpringMVC的各个组件中，处理器映射器、处理器适配器、视图解析器成为SpringMVC的三大组件。
>
> 2.需要开发的组件：处理器、视图。



### HTTP相关知识

#### HTTP协议组成

HTTP协议由两部分组成：请求协议信息和响应协议信息

**请求协议信息由三部分组成：请求行、请求头、请求体，简称行头体**

- 请求行

  请求首行，包含四部分（请求方法、URI、协议/版本、回车换行）

  举例， GET /ueser.html HTTP/1.1

请求方法：

GET、POST等8种

互联网中WEB资源操作也有增删改查方法，分别是POST、DELETE、PUT、GET

URI：

统一资源标识符，相当于一个网络资源的名称，只是名称的表现形式是/开头的路径形式

URL：统一资源定位符

URL是URI的子集

协议/版本：

表示该请求是通过哪个协议发送的，比如HTTP协议、HTTPS协议，如果是HTTP协议一般情况是1.1版本

- 请求头

  请求头信息是以[key:value]形式展现

  大多数请求头信息都不是必须的，只需要了解常见的请求头信息即可

请求头说明：

Content-Type：请求头中非常重要的内容，表示请求正文中的文档属于什么MIME类型。格式，Content-Type：[type]/[subtype];parameter。例如最常见的就是text/html，意思是说返回的内容是文本类型，文本是html格式

Host：指定请求资源的Internet主机和端口号，必须表示请求url的原始服务器或网关的位置。HTTP/1.1请求必须包含主机头域，否则系统会以400状态码返回

Accept：浏览器可接受的MIME类型

Accept-Charset：浏览器可接受的字符集

Accept-Encoding：浏览器能进行解码的数据编码方式，比如gzip。Servlet能够向支持gzip的浏览器返回经gzip编码的HTML页面。许多情形下可以减少5-10倍的下载时间

Accept-Language：浏览器希望的语言种类，当服务器能够提供一种以上的语言版本时用到。

Authorization：授权信息，通常出现在对服务器发送的WWW-Authenticate头的应答中

Connection：表示是否需要持久链接。如果Servlet看到这里值为“Keep-Alive”，或者看到请求使用的是HTTP1.1（HTTP1.1默认进行持久链接），就可以利用持久连接的优点，当页面包含多个元素时，显著的减少下载需要的时间。要实现这一点，Servlet需要在应答中发送一个Content-Length头，最简单的实现方法是先把内容写入ByteArrayOutputStream，然后在正式写出内容之前计算它的大小。

Content-Length：表示请求消息正文的长度

Cookie：最重要的请求头信息之一，可以在客户端记录访问状态

From：请求发送者的Email地址，由一些特殊的Web客户程序使用，浏览器不会用到它

If-Modified-Since：只有当请求的内容在指定的日期之后又经过修改才返回它，否则返回304 “Not Modified”应答

Pragma：指定“no-cache”值表示服务器必须返回一个刷新后的文档，即使它是代理服务器而且已经有了页面的本地拷贝

Referer：包含一个URL，用户从该URL代表的页面出发访问当前请求的页面，使用场景：防盗链、统计网站访问信息

User-Agent：浏览器类型，如果Servlet返回的内容与浏览器类型有关则该值非常有用

- MIME概述：多用途互联网邮件扩展类型，也叫媒体类型
  - 格式：大类型/小类型，阅读是反过来，如text/html, 读成html文本
  - 常见的MIME类型
    - text/html  HTML格式
    - text/plain  纯文本格式
    - text/xml  XML格式
    - image/gif  gif图片格式
    - image/jpeg  jpg图片格式
    - image/png  png图片格式
    - application/xhtml+xml  XHTML格式
    - application/xml  XML数据格式
    - application/atom+xml  Atom XML聚合格式
    - application/json  JSON格式
    - application/pdf PDF格式
    - application/msword  Word文档格式
    - application/octet-stream  二进制流数据
    - multipart/form-data  需要在表单中进行文件上传

**响应协议信息，由三部分组成：状态行、响应头、响应体（响应正文）**

- 状态行

  HTTP/1.1 200 OK

  状态行由 协议/版本、数字形式的状态码、状态描述 三部分组成

  状态码说明：三位数字组成，第一个数字定义响应的类别，分五种类别

  - 1XX：指示信息--表示请求已接收，继续处理
  - 2XX：成功--表示请求已被成功接收、理解、接受
  - 3XX：重定向--要完成请求必须进行更进一步的操作
  - 4XX：客户端错误--请求有语法错误或请求无法实现
  - 5XX：服务器端错误--服务器未能实现合法的请求

  常见状态码

  200 OK //客户端请求成功

  400 Bad Request  //客户端请求语法错误，不能被服务器所理解

  401 Unauthorized //请求未经授权，这个状态代码必须和WWW-Authenticate报头域一起使用

  403 Forbidden  //服务器收到请求，但是拒绝提供服务

  404 Not Found //请求资源不存在，eg：输入了错误的URL

  500 Internal Server Error //服务器发生不可预期的错误

  503 Server Unavailable //服务器当前不能处理客户端的请求，一段时间后可能恢复正常

- 

- 







































































































