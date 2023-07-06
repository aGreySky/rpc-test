package org.example.controller;

import org.example.annotation.RpcReference;
import org.example.api.HelloService;
import org.example.api.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhouzhiqiang
 * @Date 2023/7/6 2:53 PM
 */
@RestController
public class ClientController {
    @RpcReference
    HelloService helloService;

    @RpcReference
    OrderService orderService;

    @GetMapping("/hello")
    public String hello(@RequestParam String orderId){
        return orderService.getOrder(orderId);
    }

    @GetMapping("/add")
    public int add(@RequestParam Integer a, @RequestParam Integer b){ return helloService.add(a, b); }
}
