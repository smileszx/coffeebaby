package com.coffee.baby.idlecheckdemo;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;


/**
 * @Classname IdleCheckServerInitializer
 * @Description TODO
 * @Date 2019/1/22 19:53
 * @Created by smile.szx
 */
public class IdleCheckServerInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();

        pipeline.addLast(new IdleStateHandler(5, 8, 10, TimeUnit.SECONDS));
        pipeline.addLast(null);
    }
}
