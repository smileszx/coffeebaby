package com.coffee.baby.idlecheckdemo;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

/**
 * @Classname IdleCheckServer
 * @Description TODO
 * @Date 2019/1/22 19:49
 * @Created by smile.szx
 */
public class IdleCheckServer {

    public static void main(String[] args) {
        EventLoopGroup boss = new NioEventLoopGroup();
        EventLoopGroup worker = new NioEventLoopGroup();

        try {

            ServerBootstrap bootstrap = new ServerBootstrap();
            bootstrap.group(boss, worker).channel(NioServerSocketChannel.class).
                    handler(new LoggingHandler(LogLevel.INFO)).
                    childHandler(null);

        } finally {
            boss.shutdownGracefully();
            worker.shutdownGracefully();
        }
    }
}
