package com.coffee.baby.socketdemo;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.util.CharsetUtil;

/**
 * @Classname MyServerInitializer
 * @Description TODO
 * @Date 2019/1/22 14:15
 * @Created by smile.szx
 */
public class MyServerInitializer extends ChannelInitializer<SocketChannel>{
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {

        ChannelPipeline channelPipeline = socketChannel.pipeline();

        channelPipeline.addLast(new LengthFieldBasedFrameDecoder(Integer.MAX_VALUE, 0 , 4, 0, 4));
        channelPipeline.addLast(new LengthFieldPrepender(4));
        channelPipeline.addLast(new StringDecoder(CharsetUtil.UTF_8));
        channelPipeline.addLast(new StringEncoder(CharsetUtil.UTF_8));
        channelPipeline.addLast(new MyServerHandler());
    }
}
