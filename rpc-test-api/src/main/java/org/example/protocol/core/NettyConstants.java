package org.example.protocol.core;

import io.netty.channel.Channel;
import jdk.nashorn.api.scripting.ScriptObjectMirror;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author zhouzhiqiang
 * @Date 2023/7/6 1:40 PM
 */
public class NettyConstants {
    public static Map<String, RpcFuture> rpcFutureMap = new ConcurrentHashMap<>();
    public static Map<String, Channel> clientMap = new ConcurrentHashMap<>();
}
