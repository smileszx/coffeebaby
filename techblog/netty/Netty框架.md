

### Netty框架学习

#### 1. Netty入门

##### 1.1 Netty 基础

- Linux环境监听端口号

```shell
# 安装lsof
[root@localhost ~]# yum install lsof
```

[Linux lsof命令详解](https://www.cnblogs.com/sparkbj/p/7161669.html)

> lsof(list open files)是一个列出当前系统打开文件的工具。在linux环境下，任何事物都以文件的形式存在，通过文件不仅仅可以访问常规数据，还可以访问网络连接和硬件。

- Windows环境监听端口号

```shell
netstat -ano|findstr "8899"
如下：
  TCP    0.0.0.0:8899           0.0.0.0:0              LISTENING       6056
  TCP    [::]:8899              [::]:0                 LISTENING       6056
  TCP    [::1]:52100            [::1]:8899             TIME_WAIT       0
  
# 
关闭进程  
C:\Users\Thinkpad>taskkill /F /pid 6056
成功: 已终止 PID 为 6056 的进程。
```

- Server Demo

```java
/**
 * Netty Server代码流程
 **/
public static void main(String[] args) throws Exception{
        //（1）定义loopGroup
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workGroup = new NioEventLoopGroup();

    	//（2）启动服务器
        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(bossGroup, workGroup).channel(NioServerSocketChannel.class)
                    .childHandler(new TestServerInitializer()); //自定义Handler

            ChannelFuture channelFuture = serverBootstrap.bind(8899).sync();
            channelFuture.channel().closeFuture().sync();
        } finally {
            bossGroup.shutdownGracefully();
            workGroup.shutdownGracefully();
        }
}
```

