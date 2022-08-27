package com.iamxgw.test;

import com.iamxgw.HelloService;
import com.iamxgw.HelloServiceImpl;
import com.iamxgw.registry.DefaultServiceRegistry;
import com.iamxgw.registry.ServiceRegistry;
import com.iamxgw.transport.netty.server.NettyServer;

public class NettyTestServer {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ServiceRegistry registry = new DefaultServiceRegistry();
        registry.register(helloService);
        NettyServer server = new NettyServer();
        server.start(9999);
    }

}


