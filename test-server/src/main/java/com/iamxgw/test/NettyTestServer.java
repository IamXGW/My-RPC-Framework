package com.iamxgw.test;

import com.iamxgw.HelloService;
import com.iamxgw.HelloServiceImpl;
import com.iamxgw.serializer.ProtobufSerializer;
import com.iamxgw.transport.netty.server.NettyServer;

public class NettyTestServer {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        NettyServer server = new NettyServer("127.0.0.1", 9999);
        server.setSerializer(new ProtobufSerializer());
        server.publishService(helloService, HelloService.class);
    }
}




