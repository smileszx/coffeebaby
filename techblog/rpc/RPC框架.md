### **远程调用技术**

#### 1 WebService

[WebService概念总结](https://www.cnblogs.com/xdp-gacl/p/4048937.html)

##### 1.1 什么是WebService

> WebService是一种跨编程语言和跨操作系统平台的远程调用技术。

##### 1.2 WebService平台技术

  XML+XSD,SOAP和WSDL就是构成WebService平台的三大技术。

###### 1.2.1 XML+XSD

　　WebService采用HTTP协议传输数据，采用XML格式封装数据（即XML中说明调用远程服务对象的方法，传递的参数，以及服务对象的返回结果）。XML主要的优点在于它既是平台无关的。

　　XML Schema(XSD)定义了一套标准的数据类型，WebService平台就 是用XSD来作为其数据类型系统的。为了符合WebService标准，所有使用的数据类型都必须被转换为XSD类型。

###### 1.2.2 SOAP

​        WebService通过HTTP协议发送请求和接收结果时，发送的请求内容和结果内容都采用XML格式封装，并增加了一些特定的HTTP消息头，以说明 HTTP消息的内容格式，这些特定的HTTP消息头和XML内容格式就是SOAP协议。SOAP提供了标准的RPC方法来调用Web Service。

​       **SOAP协议 = HTTP协议 + XML数据格式**

​       SOAP协议定义了SOAP消息的格式，SOAP协议是基于HTTP协议的，SOAP也是基于XML和XSD的，XML是SOAP的数据编码方式。

###### 1.2.3 WSDL

　　WebService客户端要调用一个WebService服务，首先要有知道这个服务的地址在哪，以及这个服务里有什么方法可以调用，所以，WebService务器端首先要通过一个WSDL文件来说明自己家里有啥服务可以对外调用，服务是什么（服务中有哪些方法，方法接受 的参数是什么，返回值是什么），服务的网络地址用哪个url地址表示，服务通过什么方式来调用。

　　WSDL(Web Services Description Language)就是这样一个基于XML的语言，用于描述Web Service及其函数、参数和返回值。它是WebService客户端和服务器端都 能理解的标准格式。因为是基于XML的，所以WSDL既是机器可阅读的，又是人可阅读的，这将是一个很大的好处。一些最新的开发工具既能根据你的 Web service生成WSDL文档，又能导入WSDL文档，生成调用相应WebService的代理类代码。

　　WSDL 文件保存在Web服务器上，通过一个url地址就可以访问到它。客户端要调用一个WebService服务之前，要知道该服务的WSDL文件的地址。 WebService服务提供商可以通过两种方式来暴露它的WSDL文件地址：1.注册到UDDI服务器，以便被人查找；2.直接告诉给客户端调用者。

##### 1.3 WebService 的工作调用原理

​        WebService客户端API传递wsdl文件的url地址，这些API就会创建出底层的代理类，调用这些代理，就可以访问到webservice服务。代理类把客户端的方法调用变成soap格式的请求数据再通过HTTP协议发出去，并把接收到的soap 数据变成返回值返回。对服务端而言，各类WebService框架的本质就是Servlet，当远程调用客户端给它通过http协议发送过来soap格式的请求数据时，它分析这个数据，就知道要调用哪个java类的哪个方法，于是去查找或创建这个对象，并调用其方法，再把方法返回的结果包装成soap格式的数据，通过http响应消息回给客户端。

##### 1.4 WebService举例

[格式虽然凌乱，但是可以参考写个Demo体验WebService](https://www.imooc.com/article/25537?block_id=tuijian_wz)

调用其他人写好的WebService体验一下

http://www.webxml.com.cn/zh_cn/index.aspx

如，查询手机号码归属地

http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?op=getMobileCodeInfo

> This XML file does not appear to have any style information associated with it. The document tree is shown below.
>
> <string xmlns="http://WebXml.com.cn/">15822366305：天津 天津 天津移动全球通卡</string>

