package org.example.rpc;

import lombok.AllArgsConstructor;
import org.example.protocol.constants.RpcRequest;
import org.example.protocol.core.NettyClient;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.UUID;

/**
 * @Author zhouzhiqiang
 * @Date 2023/7/6 2:57 PM
 */
@AllArgsConstructor
public class ProxyHandler implements InvocationHandler, Serializable {
    private String rpcHost;
    private int rpcPort;
    private Object target;
    private String service;


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //组装协议
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.setReqId(UUID.randomUUID().toString());
        rpcRequest.setService(this.service);
        rpcRequest.setMethod(method.getName());
        rpcRequest.setArgs(args);
        rpcRequest.setParamType(method.getParameterTypes());

        //发起调用
        NettyClient nettyClient = new NettyClient();
        nettyClient.start(rpcHost, rpcPort, new MyRpcClientHandler());

        return nettyClient.sendRequest(rpcRequest);
    }


}
