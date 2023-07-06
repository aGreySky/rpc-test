package org.example.Service;

import org.example.annotation.RpcService;
import org.example.api.HelloService;
import org.example.api.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author zhouzhiqiang
 * @Date 2023/7/6 3:56 PM
 */
@RpcService
@Component
public class HelloServiceImpl implements HelloService {


    @Autowired
    OrderService orderService;

    @Override
    public String hello(String name) {
        return "hello my name is " + name;
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
