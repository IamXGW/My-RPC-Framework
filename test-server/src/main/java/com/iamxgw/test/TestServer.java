package com.iamxgw.test;

import com.iamxgw.HelloService;
import com.iamxgw.HelloServiceImpl;
import com.iamxgw.transport.RpcServer;

public class TestServer {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        RpcServer rpcServer = new RpcServer();
        rpcServer.register(helloService, 9000);
    }
}
