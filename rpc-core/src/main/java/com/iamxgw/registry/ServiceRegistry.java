package com.iamxgw.registry;

import java.net.InetSocketAddress;

/**
 * 服务注册接口
 * @author IamXGW
 */
public interface ServiceRegistry {
    void register(String serviceName, InetSocketAddress inetSocketAddress);
    InetSocketAddress lookupService(String serviceName);
}


