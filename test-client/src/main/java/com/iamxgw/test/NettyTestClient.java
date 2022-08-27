package com.iamxgw.test;

import com.iamxgw.HelloObject;
import com.iamxgw.HelloService;
import com.iamxgw.serializer.ProtobufSerializer;
import com.iamxgw.transport.RpcClient;
import com.iamxgw.transport.RpcClientProxy;
import com.iamxgw.transport.netty.client.NettyClient;

public class NettyTestClient {
    public static void main(String[] args) {
        RpcClient client = new NettyClient();
        client.setSerializer(new ProtobufSerializer());
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
    }
}
