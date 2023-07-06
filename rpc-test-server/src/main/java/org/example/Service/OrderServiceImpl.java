package org.example.Service;

import org.example.annotation.RpcService;
import org.example.api.OrderService;
import org.springframework.stereotype.Service;

/**
 * @Author zhouzhiqiang
 * @Date 2023/7/6 3:56 PM
 */
@RpcService
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public String getOrder(String orderId) {
        return "select order service by orderId: " + orderId;
    }
}
