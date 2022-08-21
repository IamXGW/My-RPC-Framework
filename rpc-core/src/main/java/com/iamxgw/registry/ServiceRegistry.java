package com.iamxgw.registry;

import java.net.InetSocketAddress;

/**
 * 服务注册接口
 * @author IamXGW
 */
public interface ServiceRegistry {
    <T> void register(T service);
    Object getService(String serviceName);
}
