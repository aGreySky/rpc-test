package org.example;

import org.example.protocol.core.NettyServer;
import org.example.rpc.MyRpcHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RpcServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RpcServiceApplication.class, args);
    }

    @Value("${server.rpcPort}")
    int port;

    @Override
    public void run(String... args) throws Exception {
        NettyServer.start(port, new MyRpcHandler());
    }
}
