package com.iamxgw.provider;

/**
 * 保存和提供服务实例对象
 * @author IamXGW
 */
public interface ServiceProvider {


    <T> void addServiceProvider(T service);

    Object getServiceProvider(String serviceName);

}
