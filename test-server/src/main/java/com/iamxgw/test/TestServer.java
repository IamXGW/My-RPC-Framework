package com.iamxgw.test;

import com.iamxgw.HelloService;
import com.iamxgw.HelloServiceImpl;
import com.iamxgw.registry.DefaultServiceRegistry;
import com.iamxgw.registry.ServiceRegistry;
import com.iamxgw.transport.RpcServer;

public class TestServer {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ServiceRegistry serviceRegistry = new DefaultServiceRegistry();
        serviceRegistry.register(helloService);
        RpcServer rpcServer = new RpcServer(serviceRegistry);
        rpcServer.start(9000);
    }
}
